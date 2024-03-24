package cn.kevinwang.model.mapper;

import cn.kevinwang.model.dataObject.*;
import cn.kevinwang.model.vo.VideoCommentVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author wang
 * @create 2024-02-17-15:21
 */
@Mapper(uses = DateMapper.class)
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    @Mappings({
            @Mapping(source = "comment.content",target = "commentContent"),
            @Mapping(source = "comment.createTime",target = "commentTime",qualifiedByName = "asDateString"),
            @Mapping(source = "comment.avatar",target = "profileUrl"),
            @Mapping(target = "platfrom",constant = "B站")
    })
    VideoCommentVO bilibili2VO(BilibiliVideoComment comment);

    @Mappings({
            @Mapping(source = "comment.awemeId",target = "videoId"),
            @Mapping(source = "comment.content",target = "commentContent"),
            @Mapping(source = "comment.createTime",target = "commentTime",qualifiedByName = "asDateString"),
            @Mapping(source = "comment.avatar",target = "profileUrl"),
            @Mapping(target = "platfrom",constant = "抖音")
    })
    VideoCommentVO douyin2VO(DouyinAwemeComment comment);


    @Mappings({
            @Mapping(source = "comment.content",target = "commentContent"),
            @Mapping(source = "comment.createTime",target = "commentTime",qualifiedByName = "asDateStringMicSec"),
            @Mapping(source = "comment.avatar",target = "profileUrl"),
            @Mapping(target = "platfrom",constant = "快手"),
            @Mapping(target = "subCommentCount",qualifiedByName = "noneToLong")
    })
    VideoCommentVO kuaishou2VO(KuaishouVideoComment comment);

    @Mappings({
            @Mapping(source = "comment.noteId",target = "videoId"),
            @Mapping(source = "comment.content",target = "commentContent"),
            @Mapping(source = "comment.createTime",target = "commentTime",qualifiedByName = "asDateString"),
            @Mapping(target = "platfrom",constant = "微博")
    })
    VideoCommentVO weibo2VO(WeiboNoteComment comment);

    @Mappings({
            @Mapping(source = "comment.noteId",target = "videoId"),
            @Mapping(source = "comment.content",target = "commentContent"),
            @Mapping(source = "comment.createTime",target = "commentTime",qualifiedByName = "asDateStringMicSec"),
            @Mapping(source = "comment.avatar",target = "profileUrl"),
            @Mapping(target = "platfrom",constant = "小红书")
    })
    VideoCommentVO xhs2VO(XhsNoteComment comment);


    List<VideoCommentVO> bilibili2VOs(List<BilibiliVideoComment> commentList);

    List<VideoCommentVO> douyin2VOs(List<DouyinAwemeComment> commentList);

    List<VideoCommentVO> kuaishou2VOs(List<KuaishouVideoComment> commentList);

    List<VideoCommentVO> weibo2VOs(List<WeiboNoteComment> commentList);

    List<VideoCommentVO> xhs2VOs(List<XhsNoteComment> commentList);

    @Named("noneToLong")
    default Long noneToLong(String subCommentCount) {
        if ("None".equals(subCommentCount)) {
            return 0L; // 返回默认值0
        }
        try {
            return Long.parseLong(subCommentCount);
        } catch (NumberFormatException e) {
            return 0L; // 如果转换失败，返回默认值0
        }
    }
}
