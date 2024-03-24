package cn.kevinwang.component;

import cn.kevinwang.common.Constance;
import cn.kevinwang.dao.XhsNoteMapper;
import cn.kevinwang.model.dataObject.XhsNote;
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

/**
 * @author wang
 * @create 2024-02-13-18:46
 */
@Component
public class XhsVideoImpl extends VideoAbstractService {
    @Resource
    private XhsNoteMapper xhsNoteMapper;
    @Override
    public IPage<VideoVO> list(Page page) {
        IPage<XhsNote> xhsNoteIPage = xhsNoteMapper.selectListVOPage(page,new QueryWrapper<>());
        if(null == xhsNoteIPage){
            return null;
        }
        IPage<VideoVO> resultPage = new Page<>(xhsNoteIPage.getCurrent(),xhsNoteIPage.getSize(),xhsNoteIPage.getTotal());
        List<VideoVO> videoVOS = new ArrayList<>();
        for(XhsNote xhsNote:xhsNoteIPage.getRecords()){
            VideoVO videoVO = OtherVideoMapper.INSTANCE.xhsNote2Video(xhsNote);
            videoVOS.add(videoVO);
        }
        resultPage.setRecords(videoVOS);
        return resultPage;
    }

    @Override
    public String getType() {
        return VideoEnum.xhs.name();
    }

    @Override
    public Long getCount() {
        return xhsNoteMapper.selectCount(null);
    }

    @Override
    public List<String> listTitle(String title) {
        List<String> titles = xhsNoteMapper.selectTitleList(title);
        List<String> batchTitles = new ArrayList<>();
        for(int i = 0;i<titles.size();i+= Constance.TitleAnalyize.batchSize){
            List<String> subTitle = titles.subList(i, Math.min(i + Constance.TitleAnalyize.batchSize, titles.size()));
            batchTitles.add(String.join(". ",subTitle));
        }
        return batchTitles;
    }

    @Override
    public List<UserVO> selectUserVO() {
        return UserMapper.INSTANCE.xhsNote2VOS(xhsNoteMapper.selectUserInformation());
    }

    @Override
    public List<Long> getCreateTimeList() {
        return xhsNoteMapper.selectCreateTimeLongs(0l);
    }

    @Override
    public Page<VideoVO> listByHot(Page page) {
        QueryWrapper<XhsNote> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("liked_count");
        IPage<XhsNote> noteIPage = xhsNoteMapper.selectListVOPage(page, wrapper);
        List<VideoVO> records = OtherVideoMapper.INSTANCE.xhsNote2Video(noteIPage.getRecords());
        Page<VideoVO> resultPage = new Page<>(noteIPage.getCurrent(),noteIPage.getSize(),noteIPage.getTotal());
        resultPage.setRecords(records);
        return resultPage;
    }
}
