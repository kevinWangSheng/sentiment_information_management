package cn.kevinwang.model.mapper;

import cn.kevinwang.model.dataObject.*;
import cn.kevinwang.model.vo.VideoVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author wang
 * @create 2024-02-13-20:52
 */
@Mapper(uses = DateMapper.class)
public interface VideoMapper {
    VideoMapper INSTANCE = Mappers.getMapper(VideoMapper.class);

    @Mappings({
            @Mapping(source = "videoVO.id",target = "videoId"),
            @Mapping(source = "videoVO.type",target = "videoType"),
            @Mapping(source = "videoVO.playCount",target = "videoPlayCount"),
            @Mapping(source = "videoVO.commentCount",target = "videoComment"),
            @Mapping(source = "videoVO.danmakuCount",target = "videoDanmaku"),
            @Mapping(source = "createTime",target = "createTime",qualifiedByName = "asTimeStamp")
    })
    BilibiliVideo toBiliVideo(VideoVO videoVO);


    @Mappings({
            @Mapping(source = "videoVO.id",target = "awemeId"),
            @Mapping(source = "videoVO.type",target = "awemeType"),
            @Mapping(source = "videoVO.videoUrl",target = "awemeUrl"),
            @Mapping(source = "createTime",target = "createTime",qualifiedByName = "asTimeStamp")
    })
    DouyinAweme toDouyinAweme(VideoVO videoVO);

    @Mappings({
            @Mapping(source = "videoVO.id",target = "videoId"),
            @Mapping(source = "videoVO.type",target = "videoType"),
            @Mapping(source = "videoVO.playCount",target = "viewdCount"),
            @Mapping(source = "createTime",target = "createTime",qualifiedByName = "asTimeStamp")
    })
    KuaishouVideo toKuaishouVideo(VideoVO videoVO);

    @Mappings({
            @Mapping(source = "videoVO.videoUrl",target = "noteUrl"),
            @Mapping(source = "videoVO.id",target = "noteId"),
            @Mapping(source = "videoVO.title",target = "content"),
            @Mapping(source = "videoVO.commentCount",target = "commentsCount"),
            @Mapping(source = "videoVO.shareCount",target = "sharedCount"),
            @Mapping(target = "createTime",qualifiedByName = "asTimeStamp")
    })
    WeiboNote toWeiboNote(VideoVO videoVO);

    @Mappings({
            @Mapping(source = "videoVO.videoUrl",target = "noteUrl"),
            @Mapping(source = "videoVO.id",target = "noteId"),
            @Mapping(source = "createTime",target = "time",qualifiedByName = "asTimeStamp")
    })
    XhsNote toXhsNote(VideoVO videoVO);
}
