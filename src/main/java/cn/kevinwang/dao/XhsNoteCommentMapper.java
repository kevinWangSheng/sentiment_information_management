package cn.kevinwang.dao;

import cn.kevinwang.model.dataObject.BilibiliVideo;
import cn.kevinwang.model.dataObject.XhsNoteComment;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wang sheng hui
* @description 针对表【xhs_note_comment(小红书笔记评论)】的数据库操作Mapper
* @createDate 2024-02-11 18:57:04
* @Entity cn.kevinwang.model.dataObject.XhsNoteComment
*/
@Mapper
public interface XhsNoteCommentMapper extends BaseMapper<XhsNoteComment> {
    List<XhsNoteComment> selectUserInformationByNoteId(String noteId);

    String selectNoteIdByCommentId(String commentId);

    IPage<XhsNoteComment> selectCommentByVideoId(IPage<XhsNoteComment> page, @Param(Constants.WRAPPER) Wrapper<XhsNoteComment> queryWrapper);

}




