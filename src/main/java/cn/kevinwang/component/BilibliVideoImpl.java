package cn.kevinwang.component;

import cn.kevinwang.common.Constance;
import cn.kevinwang.dao.BilibiliVideoMapper;
import cn.kevinwang.model.dataObject.BilibiliVideo;
import cn.kevinwang.model.enums.VideoEnum;
import cn.kevinwang.model.mapper.OtherVideoMapper;
import cn.kevinwang.model.mapper.UserMapper;
import cn.kevinwang.model.vo.UserVO;
import cn.kevinwang.model.vo.VideoVO;
import cn.kevinwang.service.abstracts.VideoAbstractService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wang
 * @create 2024-02-13-18:46
 */
@Component
public class BilibliVideoImpl extends VideoAbstractService {
    @Resource
    private BilibiliVideoMapper bilibiliVideoMapper;

    @Override
    public IPage<VideoVO> list(Page page) {
        IPage<BilibiliVideo> videoPage = bilibiliVideoMapper.listVideoVOByPage(page,new QueryWrapper<>());
        List<VideoVO> videoVOS = new ArrayList<>();

        for(BilibiliVideo video:videoPage.getRecords()){
            VideoVO videoVO = OtherVideoMapper.INSTANCE.bili2Video(video);
            if(null != videoVO){
                videoVOS.add(videoVO);
            }
        }
        IPage<VideoVO> resultPage = new Page<>(videoPage.getCurrent(),videoPage.getSize(),videoPage.getTotal());
        resultPage.setRecords(videoVOS);
        return resultPage;
    }

    @Override
    public String getType() {
        return VideoEnum.bilibili.name();
    }

    @Override
    public List<String> listTitle(String title) {
        List<String> titles = bilibiliVideoMapper.listTitleList(title);
        List<String> batchTitles = new ArrayList<>();
        for(int i = 0;i<titles.size();i+= Constance.TitleAnalyize.batchSize){
            List<String> subTitle = titles.subList(i, Math.min(i + Constance.TitleAnalyize.batchSize, titles.size()));
            batchTitles.add(String.join(". ",subTitle));
        }
        return batchTitles;
    }

    @Override
    public Long getCount() {
        return bilibiliVideoMapper.selectCount(null);
    }

    @Override
    public List<Long> getCreateTimeList() {
        List<Long> times = bilibiliVideoMapper.listCreateTimeLongs(0l);
        List<Long> resultTime = times.stream().map(time -> time * 1000).collect(Collectors.toList());
        times = null;
        return resultTime;
    }

    @Override
    public List<UserVO> selectUserVO() {
        return UserMapper.INSTANCE.bilibiliVideo2VOS(bilibiliVideoMapper.selectUserInformation());
    }

    @Override
    public Page<VideoVO> listByHot(Page page) {
        QueryWrapper<BilibiliVideo> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("liked_count");
        IPage<BilibiliVideo> videoPage = bilibiliVideoMapper.listVideoVOByPage(page, wrapper);
        List<VideoVO> records = OtherVideoMapper.INSTANCE.bili2Video(videoPage.getRecords());
        Page<VideoVO> resultPage = new Page(videoPage.getCurrent(),videoPage.getSize(),videoPage.getTotal());
        resultPage.setRecords(records);
        return resultPage;
    }
}
