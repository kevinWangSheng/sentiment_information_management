package cn.kevinwang.dao;

import cn.kevinwang.model.dataObject.BilibiliVideo;
import cn.kevinwang.model.dataObject.BilibiliVideoComment;
import cn.kevinwang.model.dataObject.KuaishouVideoComment;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author wang sheng hui
* @description 针对表【kuaishou_video_comment(快手视频评论)】的数据库操作Mapper
* @createDate 2024-02-11 18:57:04
* @Entity cn.kevinwang.model.dataObject.KuaishouVideoComment
*/
@Mapper
public interface KuaishouVideoCommentMapper extends BaseMapper<KuaishouVideoComment> {
    List<KuaishouVideoComment> selectUserInformationByVideoId(String videoId);

    String selectVideoIdByCommentId(String commentId);

    IPage<KuaishouVideoComment> selectCommentByVideoId(IPage<KuaishouVideoComment> page, @Param(Constants.WRAPPER) Wrapper<KuaishouVideoComment> queryWrapper);
}




