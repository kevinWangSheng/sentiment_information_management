package cn.kevinwang.component;

import cn.kevinwang.common.Constance;
import cn.kevinwang.dao.WeiboNoteMapper;
import cn.kevinwang.model.dataObject.WeiboNote;
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
public class WeiboVideoImpl extends VideoAbstractService {
    @Resource
    private WeiboNoteMapper weiboNoteMapper;
    @Override
    public IPage<VideoVO> list(Page page) {
        IPage<WeiboNote> weiboNoteIPage = weiboNoteMapper.selectVideoVOPage(page,new QueryWrapper<>());
        if(null == weiboNoteIPage){
            return null;
        }
        IPage<VideoVO> resultPage = new Page<>(weiboNoteIPage.getCurrent(),weiboNoteIPage.getSize(),weiboNoteIPage.getTotal());
        List<VideoVO> videoVOS = new ArrayList<>();
        for (WeiboNote record : weiboNoteIPage.getRecords()) {
            VideoVO videoVO = OtherVideoMapper.INSTANCE.weibo2Note(record);
            videoVOS.add(videoVO);
        }
        resultPage.setRecords(videoVOS);
        return resultPage;
    }

    @Override
    public String getType() {
        return VideoEnum.weibo.name();
    }

    @Override
    public Long getCount() {
        return weiboNoteMapper.selectCount(null);
    }

    @Override
    public List<String> listTitle(String title) {
        List<String> titles = weiboNoteMapper.selectContent(title);
        List<String> batchTitles = new ArrayList<>();
        for(int i = 0;i<titles.size();i+= Constance.TitleAnalyize.batchSize){
            List<String> subTitle = titles.subList(i, Math.min(i + Constance.TitleAnalyize.batchSize, titles.size()));
            batchTitles.add(String.join(". ",subTitle));
        }
        return batchTitles;
    }

    @Override
    public List<Long> getCreateTimeList() {
        List<Long> times = weiboNoteMapper.selectCreateTimeLongs(0l);

        List<Long> resultTime = times.stream().map(time -> time * 1000).collect(Collectors.toList());
        times = null;
        return resultTime;

    }

    @Override
    public List<UserVO> selectUserVO() {
        return UserMapper.INSTANCE.weiboNote2VOS(weiboNoteMapper.selectUserInformation());
    }

    @Override
    public Page<VideoVO> listByHot(Page page) {
        QueryWrapper<WeiboNote> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("liked_count");
        IPage<WeiboNote> noteIPage = weiboNoteMapper.selectVideoVOPage(page, wrapper);
        List<VideoVO> records = OtherVideoMapper.INSTANCE.weibo2Note(noteIPage.getRecords());
        Page<VideoVO> resultPage = new Page(noteIPage.getCurrent(),noteIPage.getSize(),noteIPage.getTotal());
        resultPage.setRecords(records);
        return resultPage;
    }
}
