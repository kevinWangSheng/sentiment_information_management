package cn.kevinwang.model.dataObject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * B站视频
 * @TableName bilibili_video
 */
@TableName(value ="bilibili_video")
public class BilibiliVideo implements Serializable {
    /**
     * 自增ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像地址
     */
    private String avatar;

    /**
     * 记录添加时间戳
     */
    private Long addTs;

    /**
     * 记录最后修改时间戳
     */
    private Long lastModifyTs;

    /**
     * 视频ID
     */
    private String videoId;

    /**
     * 视频类型
     */
    private String videoType;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 视频描述
     */
    private String desc;

    /**
     * 视频发布时间戳
     */
    private Long createTime;

    /**
     * 视频点赞数
     */
    private String likedCount;

    /**
     * 视频播放数量
     */
    private String videoPlayCount;

    /**
     * 视频弹幕数量
     */
    private String videoDanmaku;

    /**
     * 视频评论数量
     */
    private String videoComment;

    /**
     * 视频详情URL
     */
    private String videoUrl;

    /**
     * 视频封面图 URL
     */
    private String videoCoverUrl;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户ID
     */
    public void setUserId(String user_id) {
        this.userId = user_id;
    }

    /**
     * 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 用户头像地址
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 用户头像地址
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 记录添加时间戳
     */
    public Long getAddTs() {
        return addTs;
    }

    /**
     * 记录添加时间戳
     */
    public void setAddTs(Long add_ts) {
        this.addTs = add_ts;
    }

    /**
     * 记录最后修改时间戳
     */
    public Long getLastModifyTs() {
        return lastModifyTs;
    }

    /**
     * 记录最后修改时间戳
     */
    public void setLastModifyTs(Long last_modify_ts) {
        this.lastModifyTs = last_modify_ts;
    }

    /**
     * 视频ID
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * 视频ID
     */
    public void setVideoId(String video_id) {
        this.videoId = video_id;
    }

    /**
     * 视频类型
     */
    public String getVideoType() {
        return videoType;
    }

    /**
     * 视频类型
     */
    public void setVideoType(String video_type) {
        this.videoType = video_type;
    }

    /**
     * 视频标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 视频标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 视频描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 视频描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 视频发布时间戳
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 视频发布时间戳
     */
    public void setCreateTime(Long create_time) {
        this.createTime = create_time;
    }

    /**
     * 视频点赞数
     */
    public String getLikedCount() {
        return likedCount;
    }

    /**
     * 视频点赞数
     */
    public void setLikedCount(String liked_count) {
        this.likedCount = liked_count;
    }

    /**
     * 视频播放数量
     */
    public String getVideoPlayCount() {
        return videoPlayCount;
    }

    /**
     * 视频播放数量
     */
    public void setVideoPlayCount(String video_play_count) {
        this.videoPlayCount = video_play_count;
    }

    /**
     * 视频弹幕数量
     */
    public String getVideoDanmaku() {
        return videoDanmaku;
    }

    /**
     * 视频弹幕数量
     */
    public void setVideoDanmaku(String video_danmaku) {
        this.videoDanmaku = video_danmaku;
    }

    /**
     * 视频评论数量
     */
    public String getVideoComment() {
        return videoComment;
    }

    /**
     * 视频评论数量
     */
    public void setVideoComment(String video_comment) {
        this.videoComment = video_comment;
    }

    /**
     * 视频详情URL
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 视频详情URL
     */
    public void setVideoUrl(String video_url) {
        this.videoUrl = video_url;
    }

    /**
     * 视频封面图 URL
     */
    public String getVideoCoverUrl() {
        return videoCoverUrl;
    }

    /**
     * 视频封面图 URL
     */
    public void setVideoCoverUrl(String video_cover_url) {
        this.videoCoverUrl = video_cover_url;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BilibiliVideo other = (BilibiliVideo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getAddTs() == null ? other.getAddTs() == null : this.getAddTs().equals(other.getAddTs()))
            && (this.getLastModifyTs() == null ? other.getLastModifyTs() == null : this.getLastModifyTs().equals(other.getLastModifyTs()))
            && (this.getVideoId() == null ? other.getVideoId() == null : this.getVideoId().equals(other.getVideoId()))
            && (this.getVideoType() == null ? other.getVideoType() == null : this.getVideoType().equals(other.getVideoType()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLikedCount() == null ? other.getLikedCount() == null : this.getLikedCount().equals(other.getLikedCount()))
            && (this.getVideoPlayCount() == null ? other.getVideoPlayCount() == null : this.getVideoPlayCount().equals(other.getVideoPlayCount()))
            && (this.getVideoDanmaku() == null ? other.getVideoDanmaku() == null : this.getVideoDanmaku().equals(other.getVideoDanmaku()))
            && (this.getVideoComment() == null ? other.getVideoComment() == null : this.getVideoComment().equals(other.getVideoComment()))
            && (this.getVideoUrl() == null ? other.getVideoUrl() == null : this.getVideoUrl().equals(other.getVideoUrl()))
            && (this.getVideoCoverUrl() == null ? other.getVideoCoverUrl() == null : this.getVideoCoverUrl().equals(other.getVideoCoverUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getAddTs() == null) ? 0 : getAddTs().hashCode());
        result = prime * result + ((getLastModifyTs() == null) ? 0 : getLastModifyTs().hashCode());
        result = prime * result + ((getVideoId() == null) ? 0 : getVideoId().hashCode());
        result = prime * result + ((getVideoType() == null) ? 0 : getVideoType().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLikedCount() == null) ? 0 : getLikedCount().hashCode());
        result = prime * result + ((getVideoPlayCount() == null) ? 0 : getVideoPlayCount().hashCode());
        result = prime * result + ((getVideoDanmaku() == null) ? 0 : getVideoDanmaku().hashCode());
        result = prime * result + ((getVideoComment() == null) ? 0 : getVideoComment().hashCode());
        result = prime * result + ((getVideoUrl() == null) ? 0 : getVideoUrl().hashCode());
        result = prime * result + ((getVideoCoverUrl() == null) ? 0 : getVideoCoverUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", nickname=").append(nickname);
        sb.append(", avatar=").append(avatar);
        sb.append(", addTs=").append(addTs);
        sb.append(", lastModifyTs=").append(lastModifyTs);
        sb.append(", videoId=").append(videoId);
        sb.append(", videoType=").append(videoType);
        sb.append(", title=").append(title);
        sb.append(", desc=").append(desc);
        sb.append(", createTime=").append(createTime);
        sb.append(", likedCount=").append(likedCount);
        sb.append(", videoPlayCount=").append(videoPlayCount);
        sb.append(", videoDanmaku=").append(videoPlayCount);
        sb.append(", videoComment=").append(videoComment);
        sb.append(", videoUrl=").append(videoUrl);
        sb.append(", videoCoverUrl=").append(videoCoverUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}