package cn.kevinwang.dao;

import cn.kevinwang.model.dataObject.BilibiliVideo;
import cn.kevinwang.model.dataObject.BilibiliVideoComment;
import cn.kevinwang.model.dataObject.WeiboNoteComment;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wang sheng hui
* @description 针对表【weibo_note_comment(微博帖子评论)】的数据库操作Mapper
* @createDate 2024-02-11 18:57:04
* @Entity cn.kevinwang.model.dataObject.WeiboNoteComment
*/
@Mapper
public interface WeiboNoteCommentMapper extends BaseMapper<WeiboNoteComment> {
    List<WeiboNoteComment> selectUserInformationByNoteId(String noteId);

    String selectNoteIdByCommentId(String commentId);

    IPage<WeiboNoteComment> selectCommentByVideoId(IPage<WeiboNoteComment> page, @Param(Constants.WRAPPER) Wrapper<WeiboNoteComment> queryWrapper);
}




