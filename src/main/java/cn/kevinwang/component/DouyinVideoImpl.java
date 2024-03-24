package cn.kevinwang.component;

import cn.kevinwang.common.Constance;
import cn.kevinwang.dao.DouyinAwemeMapper;
import cn.kevinwang.model.dataObject.DouyinAweme;
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
 * @create 2024-02-13-18:44
 */
@Component
public class DouyinVideoImpl extends VideoAbstractService {
    @Resource
    private DouyinAwemeMapper douyinAwemeMapper;
    @Override
    public IPage<VideoVO> list(Page page) {
        IPage<DouyinAweme> douyinPage = douyinAwemeMapper.selectDouyinVOList(page,new QueryWrapper<>());
        if(null == douyinPage){
            return null;
        }
        IPage<VideoVO> resultPage = new Page<>(douyinPage.getCurrent(),douyinPage.getSize(),douyinPage.getTotal());
        List<VideoVO> videoVOS = new ArrayList<>();
        for(DouyinAweme douyinAweme:douyinPage.getRecords()){
            VideoVO videoVO = OtherVideoMapper.INSTANCE.douyin2Aweme(douyinAweme);
            videoVOS.add(videoVO);
        }
        resultPage.setRecords(videoVOS);
        return resultPage;
    }

    @Override
    public String getType() {
        return VideoEnum.douyin.name();
    }

    @Override
    public Long getCount() {
        return douyinAwemeMapper.selectCount(null);
    }

    @Override
    public List<String> listTitle(String title) {
        List<String> titles = douyinAwemeMapper.selectTitleList(title);
        List<String> batchTitles = new ArrayList<>();
        for(int i = 0;i<titles.size();i+= Constance.TitleAnalyize.batchSize){
            List<String> subTitle = titles.subList(i, Math.min(i + Constance.TitleAnalyize.batchSize, titles.size()));
            batchTitles.add(String.join(". ",subTitle));
        }
        return batchTitles;
    }

    @Override
    public List<Long> getCreateTimeList() {
        List<Long> times = douyinAwemeMapper.selectCreateTimeLongs(0l);
        List<Long> resultTime = times.stream().map(time -> time * 1000).collect(Collectors.toList());
        times = null;
        return resultTime;

    }

    @Override
    public List<UserVO> selectUserVO() {
        return UserMapper.INSTANCE.douyinVideo2VOS(douyinAwemeMapper.selectUserInformation());
    }

    @Override
    public Page<VideoVO> listByHot(Page page) {
        QueryWrapper<DouyinAweme> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("liked_count");
        IPage<DouyinAweme> douyinPage = douyinAwemeMapper.selectDouyinVOList(page,wrapper);
        List<VideoVO> records = OtherVideoMapper.INSTANCE.douyin2Aweme(douyinPage.getRecords());
        Page<VideoVO> resultPage = new Page(douyinPage.getCurrent(),douyinPage.getSize(),douyinPage.getTotal());
        resultPage.setRecords(records);
        return resultPage;
    }
}
