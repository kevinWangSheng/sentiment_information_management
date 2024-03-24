package cn.kevinwang.component;

import cn.kevinwang.common.Constance;
import cn.kevinwang.dao.KuaishouVideoMapper;
import cn.kevinwang.model.dataObject.KuaishouVideo;
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
 * @create 2024-02-13-18:44
 */
@Component
public class KuaishouVideoImpl extends VideoAbstractService {
    @Resource
    private KuaishouVideoMapper kuaishouVideoMapper;
    @Override
    public IPage<VideoVO> list(Page page) {
        IPage<KuaishouVideo> kuaishouVideoIPage = kuaishouVideoMapper.selectVideoVOPage(page,new QueryWrapper<>());
        if(null == kuaishouVideoIPage){
            return null;
        }
        IPage<VideoVO> resultPage = new Page<>(kuaishouVideoIPage.getCurrent(),kuaishouVideoIPage.getSize(),kuaishouVideoIPage.getTotal());
        List<VideoVO> videoVOS = new ArrayList<>();
        for(KuaishouVideo kuaishouVideo:kuaishouVideoIPage.getRecords()){
            VideoVO videoVO = OtherVideoMapper.INSTANCE.kuaishou2Video(kuaishouVideo);
            videoVOS.add(videoVO);
        }
        resultPage.setRecords(videoVOS);
        return resultPage;
    }

    @Override
    public String getType() {
        return VideoEnum.kuaishou.name();
    }

    @Override
    public Long getCount() {
        return kuaishouVideoMapper.selectCount(null);
    }

    @Override
    public List<String> listTitle(String title) {
        List<String> titles = kuaishouVideoMapper.selectTitleList(title);
        List<String> batchTitles = new ArrayList<>();
        for(int i = 0;i<titles.size();i+= Constance.TitleAnalyize.batchSize){
            List<String> subTitle = titles.subList(i, Math.min(i + Constance.TitleAnalyize.batchSize, titles.size()));
            batchTitles.add(String.join(". ",subTitle));
        }
        return batchTitles;
    }

    @Override
    public List<Long> getCreateTimeList() {
        return kuaishouVideoMapper.selectCreateTimeLongs(0l);
    }

    @Override
    public List<UserVO> selectUserVO() {
        return UserMapper.INSTANCE.kuaishouVideo2VOS(kuaishouVideoMapper.selectUserInformation());
    }

    @Override
    public Page<VideoVO> listByHot(Page page) {
        QueryWrapper<KuaishouVideo> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("liked_count");
        IPage<KuaishouVideo> kuaishouVideoIPage = kuaishouVideoMapper.selectVideoVOPage(page, wrapper);
        List<VideoVO> videoVOS = OtherVideoMapper.INSTANCE.kuaishou2Video(kuaishouVideoIPage.getRecords());
        Page<VideoVO> resultPage = new Page<>(kuaishouVideoIPage.getCurrent(),kuaishouVideoIPage.getSize(),kuaishouVideoIPage.getTotal());
        resultPage.setRecords(videoVOS);
        return resultPage;
    }
}
