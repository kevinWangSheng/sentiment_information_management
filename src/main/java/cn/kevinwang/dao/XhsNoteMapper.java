package cn.kevinwang.dao;

import cn.kevinwang.model.dataObject.XhsNote;
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
* @description 针对表【xhs_note(小红书笔记)】的数据库操作Mapper
* @createDate 2024-02-11 18:57:04
* @Entity cn.kevinwang.model.dataObject.XhsNote
*/
@Mapper
public interface XhsNoteMapper extends BaseMapper<XhsNote> {

    IPage<XhsNote> selectListVOPage(IPage page,@Param(Constants.WRAPPER) Wrapper<XhsNote> queryWrapper);

    List<String> selectTitleList(@Param("title")String title);

    List<Long> selectCreateTimeLongs(@Param("createTime")Long createTime);

    List<XhsNote> selectUserInformation();

}




