package cn.kevinwang.service.impl;

import cn.kevinwang.component.factory.VideoFactory;
import cn.kevinwang.model.enums.VideoEnum;
import cn.kevinwang.model.vo.CreateTimeCount;
import cn.kevinwang.model.vo.TitleAnalyize;
import cn.kevinwang.model.vo.UserVO;
import cn.kevinwang.model.vo.VideoVO;
import cn.kevinwang.pool.ExecutorPool;
import cn.kevinwang.service.VideoArr;
import cn.kevinwang.service.VideoService;
import cn.kevinwang.util.CountRunnable;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.Future;

/**
 * @author wang
 * @create 2024-02-14-11:55
 */
@Service
public class VideoServiceImpl implements VideoService {
    @Resource
    private VideoFactory videoFactory;

    @Override
    public IPage<VideoVO> getVideoListByPage(Integer start, Integer size, String platfrom) {
        VideoEnum platfromEnum = VideoEnum.get(platfrom);
        if(null == platfromEnum){
            throw new RuntimeException("没有该对应的平台");
        }

        VideoArr videoService = videoFactory.getVideoService(platfromEnum);
        return videoService.list(new Page(start, size));
    }

    @Override
    public Long getAllCount(String platfrom) {
        if(StringUtils.isNotBlank(platfrom)){
            return videoFactory.getVideoService(VideoEnum.get(platfrom)).getCount();
        }
        List<Future<Long>> futures = new ArrayList<>();

        for(int i = 0;i<VideoEnum.values().length;i++){
            Future future = ExecutorPool.executorService.submit(new CountRunnable(videoFactory.getVideoService(VideoEnum.values()[i])::getCount));
            futures.add(future);
        }
        Long sum = 0L;
        for(Future<Long> future:futures){
            try {
                sum += future.get();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return sum;
    }

    @Override
    public List<TitleAnalyize> analyizeTitle(String platfrom) throws IOException {
        List<String> titles;
        Map<String,Integer> wordFrequency = new HashMap<>();
        if(StringUtils.isBlank(platfrom)){
            titles = getAllTitles();
        }else{
            titles = videoFactory.getVideoService(VideoEnum.get(platfrom)).listTitle(null);
        }
        Directory directory = new RAMDirectory();
        StandardAnalyzer analyzer = new StandardAnalyzer();
        IndexWriterConfig config = new IndexWriterConfig(analyzer);

        try (IndexWriter indexWriter = new IndexWriter(directory, config)) {
            // 将视频标题添加到索引中
            for (String title : titles) {
                Document doc = new Document();
                doc.add(new TextField("title", title, Field.Store.YES));
                indexWriter.addDocument(doc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 使用Lucene来分析索引并提取常见词汇
        try (IndexReader indexReader = DirectoryReader.open(directory)) {
            for (int i = 0; i < indexReader.maxDoc(); i++) {
                Document doc = indexReader.document(i);
                String title = doc.get("title");
                String[] words = title.split("\\s+");
                for (String word : words) {
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return TitleAnalyize.map2List(wordFrequency);
    }

    @Override
    public List<String> getAllTitles() {
        List<String> titles = new ArrayList<>();
        for(VideoEnum videoEnum :VideoEnum.values()){
            titles.addAll(videoFactory.getVideoService(videoEnum).listTitle(null));
        }
        return titles;
    }

    @Override
    public List<CreateTimeCount> statisticsCreateTime(String platfrom) {
        List<Long> timeList = null;
        if(StringUtils.isBlank(platfrom)){
            for(VideoEnum videoEnum :VideoEnum.values()){
                if(null == timeList) {
                    timeList = videoFactory.getVideoService(videoEnum).getCreateTimeList();
                }else{
                    timeList.addAll(videoFactory.getVideoService(videoEnum).getCreateTimeList());
                }
            }
        }else{
            timeList = videoFactory.getVideoService(VideoEnum.get(platfrom)).getCreateTimeList();
        }

        return CreateTimeCount.getStaticsCreateTime(timeList, new SimpleDateFormat("yyyy-MM"));
    }

    @Override
    public List<UserVO> selectUserVO(String platfrom) {
        if(StringUtils.isBlank(platfrom)) {
            List<UserVO> userVOList = null;
            for (VideoEnum value : VideoEnum.values()) {
                if(null == userVOList){
                    userVOList = videoFactory.getVideoService(value).selectUserVO();
                }else{
                    userVOList.addAll(videoFactory.getVideoService(value).selectUserVO());
                }
            }
            return userVOList;
        }
        return videoFactory.getVideoService(VideoEnum.get(platfrom)).selectUserVO();
    }

    @Override
    public Page<VideoVO> getHotVideo(String platfrom,int pageStart,int pageSize) {
        if(StringUtils.isBlank(platfrom)){
            return new Page<>(pageStart,pageSize);
        }
        return videoFactory.getVideoService(VideoEnum.get(platfrom)).listByHot(new Page<>(pageStart, pageSize));
    }
}
