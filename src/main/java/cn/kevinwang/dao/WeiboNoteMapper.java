package cn.kevinwang.dao;

import cn.kevinwang.model.dataObject.WeiboNote;
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
* @description 针对表【weibo_note(微博帖子)】的数据库操作Mapper
* @createDate 2024-02-11 18:57:04
* @Entity cn.kevinwang.model.dataObject.WeiboNote
*/
@Mapper
public interface WeiboNoteMapper extends BaseMapper<WeiboNote> {

    IPage<WeiboNote> selectVideoVOPage(IPage page,@Param(Constants.WRAPPER) Wrapper<WeiboNote> queryWrapper);

    List<String> selectContent(@Param("content")String content);

    List<Long> selectCreateTimeLongs(@Param("createTime")Long createTime);

    List<WeiboNote> selectUserInformation();

}




