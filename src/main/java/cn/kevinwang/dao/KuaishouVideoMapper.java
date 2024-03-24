package cn.kevinwang.dao;

import cn.kevinwang.model.dataObject.KuaishouVideo;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wang sheng hui
* @description 针对表【kuaishou_video(快手视频)】的数据库操作Mapper
* @createDate 2024-02-11 18:57:04
* @Entity cn.kevinwang.model.dataObject.KuaishouVideo
*/
@Mapper
public interface KuaishouVideoMapper extends BaseMapper<KuaishouVideo> {

    IPage<KuaishouVideo> selectVideoVOPage(IPage page,@Param(Constants.WRAPPER) Wrapper<KuaishouVideo> queryWrapper);

    List<String> selectTitleList(@Param("title")String title);

    List<Long> selectCreateTimeLongs(@Param("createTime")Long createTime);

    List<KuaishouVideo> selectUserInformation();

}




