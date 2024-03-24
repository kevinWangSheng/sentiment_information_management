package cn.kevinwang.dao;

import cn.kevinwang.model.dataObject.DouyinAweme;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wang sheng hui
* @description 针对表【douyin_aweme(抖音视频)】的数据库操作Mapper
* @createDate 2024-02-11 18:57:04
* @Entity cn.kevinwang.model.dataObject.DouyinAweme
*/
@Mapper
public interface DouyinAwemeMapper extends BaseMapper<DouyinAweme> {
    IPage<DouyinAweme> selectDouyinVOList(IPage<DouyinAweme> page,@Param(Constants.WRAPPER) Wrapper<DouyinAweme> queryWrapper);

    List<String> selectTitleList(@Param("title")String title);

    List<Long> selectCreateTimeLongs(@Param("createTime")Long createTime);

    List<DouyinAweme> selectUserInformation();
}




