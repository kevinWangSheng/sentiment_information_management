package cn.kevinwang.model.vo;

import java.io.Serializable;

/**
 * @author wang
 * @create 2024-02-13-18:22
 */

public class VideoVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nickname;
    private String id; // 视频id

    private String title; // 视频标题

    private String type; // 视频类型

    private String desc; // 视频描述

    private String createTime; // 创建时间

    private Long likedCount;   // 点赞数

    private Long playCount;   // 播放数

    private Long commentCount; // 评论数

    private String videoUrl;  // 视频地址

    private Long shareCount;   // 分享数

    private Long collectedCount; // 收藏数

    private Long danmakuCount; // 弹幕数

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getLikedCount() {
        return likedCount;
    }

    public void setLikedCount(Long likedCount) {
        this.likedCount = likedCount;
    }

    public Long getPlayCount() {
        return playCount;
    }

    public void setPlayCount(Long playCount) {
        this.playCount = playCount;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Long getShareCount() {
        return shareCount;
    }

    public void setShareCount(Long shareCount) {
        this.shareCount = shareCount;
    }

    public Long getCollectedCount() {
        return collectedCount;
    }

    public Long getDanmakuCount() {
        return danmakuCount;
    }

    public void setDanmakuCount(Long danmakuCount) {
        this.danmakuCount = danmakuCount;
    }

    public void setCollectedCount(Long collectedCount) {


        this.collectedCount = collectedCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
