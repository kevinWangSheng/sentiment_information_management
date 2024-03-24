package cn.kevinwang.dao;

import cn.kevinwang.model.dataObject.BilibiliVideo;
import cn.kevinwang.model.dataObject.BilibiliVideoComment;
import cn.kevinwang.model.vo.VideoCommentVO;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wang sheng hui
* @description 针对表【bilibili_video_comment(B 站视频评论)】的数据库操作Mapper
* @createDate 2024-02-11 18:57:04
* @Entity cn.kevinwang.model.dataObject.BilibiliVideoComment
*/
@Mapper
public interface BilibiliVideoCommentMapper extends BaseMapper<BilibiliVideoComment> {
    List<BilibiliVideoComment> selectUserInformationByVideoId(@Param("videoId")String videoId);

    String selectVideoIdByCommentId(@Param("commentId")String commentId);

    IPage<BilibiliVideoComment> selectCommentByVideoId(IPage<BilibiliVideoComment> page, @Param(Constants.WRAPPER) Wrapper<BilibiliVideoComment> queryWrapper);
}




