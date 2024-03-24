package cn.kevinwang.model.mapper;

import cn.kevinwang.model.dataObject.*;
import cn.kevinwang.model.vo.VideoVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author wang
 * @create 2024-02-14-0:00
 */
@Mapper(uses = DateMapper.class)
public interface OtherVideoMapper {
    OtherVideoMapper INSTANCE = Mappers.getMapper(OtherVideoMapper.class);

    @Mappings({
            @Mapping(source = "bilibiliVideo.videoId",target = "id"),
            @Mapping(source = "bilibiliVideo.videoType",target = "type"),
            @Mapping(source = "bilibiliVideo.videoPlayCount",target = "playCount"),
            @Mapping(source = "bilibiliVideo.videoComment",target = "commentCount"),
            @Mapping(source = "bilibiliVideo.videoDanmaku",target = "danmakuCount"),
            @Mapping(source = "createTime",target = "createTime",qualifiedByName = "asDateString")
    })
    VideoVO bili2Video(BilibiliVideo bilibiliVideo);


    @Mappings({
            @Mapping(source = "douyinAweme.awemeId",target = "id"),
            @Mapping(source = "douyinAweme.awemeType",target = "type"),
            @Mapping(source = "douyinAweme.awemeUrl",target = "videoUrl"),
            @Mapping(source = "createTime",target = "createTime",qualifiedByName = "asDateString" )
    })
    VideoVO douyin2Aweme(DouyinAweme douyinAweme);

    @Mappings({
            @Mapping(source = "kuaishouVideo.videoId",target = "id"),
            @Mapping(source = "kuaishouVideo.videoType",target = "type"),
            @Mapping(source = "kuaishouVideo.viewdCount",target = "playCount"),
            @Mapping(source = "createTime",target = "createTime",qualifiedByName = "asDateString")
    })
    VideoVO kuaishou2Video(KuaishouVideo kuaishouVideo);

    @Mappings({
            @Mapping(source = "weiboNote.noteUrl",target = "videoUrl"),
            @Mapping(source = "weiboNote.noteId",target = "id"),
            @Mapping(source = "weiboNote.content",target = "title"),
            @Mapping(source = "weiboNote.commentsCount",target = "commentCount"),
            @Mapping(source = "weiboNote.sharedCount",target = "shareCount"),
            @Mapping(source = "createTime",target = "createTime",qualifiedByName = "asDateString")
    })
    VideoVO weibo2Note(WeiboNote weiboNote);

    @Mappings({
            @Mapping(source = "xhsNote.noteUrl",target = "videoUrl"),
            @Mapping(source = "xhsNote.noteId",target = "id"),
            @Mapping(source = "time",target = "createTime",qualifiedByName = "asDateString")
    })
    VideoVO xhsNote2Video(XhsNote xhsNote);

    List<VideoVO> bili2Video(List<BilibiliVideo> bilibiliVideos);

    List<VideoVO> douyin2Aweme(List<DouyinAweme> douyinAwemes);

    List<VideoVO> kuaishou2Video(List<KuaishouVideo> kuaishouVideos);

    List<VideoVO> weibo2Note(List<WeiboNote> weiboNotes);

    List<VideoVO> xhsNote2Video(List<XhsNote> xhsNotes);
}
