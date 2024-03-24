package cn.kevinwang.model.dto;

/**
 * @author wang
 * @create 2024-02-17-14:33
 */
public class VideoCommentDto {
    private String videoId;

    private String commentId;

    private String searchContent;

    private String commentTime;

    private Long subCommentCount;

    private String nickname;

    private String commentBeginTime;

    private String commentEndTime;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public Long getSubCommentCount() {
        return subCommentCount;
    }

    public void setSubCommentCount(Long subCommentCount) {
        this.subCommentCount = subCommentCount;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCommentBeginTime() {
        return commentBeginTime;
    }

    public void setCommentBeginTime(String commentBeginTime) {
        this.commentBeginTime = commentBeginTime;
    }

    public String getCommentEndTime() {
        return commentEndTime;
    }

    public void setCommentEndTime(String commentEndTime) {
        this.commentEndTime = commentEndTime;
    }
}
