package cn.kevinwang.dao;

import cn.kevinwang.model.dataObject.BilibiliVideo;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wang sheng hui
* @description 针对表【bilibili_video(B站视频)】的数据库操作Mapper
* @createDate 2024-02-11 18:57:04
* @Entity cn.kevinwang.model.dataObject.BilibiliVideo
*/
@Mapper
public interface BilibiliVideoMapper extends BaseMapper<BilibiliVideo> {

    IPage<BilibiliVideo> listVideoVOByPage(IPage<BilibiliVideo> page,@Param(Constants.WRAPPER) Wrapper<BilibiliVideo> queryWrapper);

    List<String> listTitleList(@Param("title")String title);

    List<Long> listCreateTimeLongs(Long createTime);

    List<BilibiliVideo> selectUserInformation();

}




