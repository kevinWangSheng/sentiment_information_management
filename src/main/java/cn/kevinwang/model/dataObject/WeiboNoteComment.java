package cn.kevinwang.model.dataObject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 微博帖子评论
 * @TableName weibo_note_comment
 */
@TableName(value ="weibo_note_comment")
public class WeiboNoteComment implements Serializable {
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
     * 用户性别
     */
    private String gender;

    /**
     * 用户主页地址
     */
    private String profileUrl;

    /**
     * 发布微博的地理信息
     */
    private String ipLocation;

    /**
     * 记录添加时间戳
     */
    private Long addTs;

    /**
     * 记录最后修改时间戳
     */
    private Long lastModifyTs;

    /**
     * 评论ID
     */
    private String commentId;

    /**
     * 帖子ID
     */
    private String noteId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论时间戳
     */
    private Long createTime;

    /**
     * 评论日期时间
     */
    private String createDateTime;

    /**
     * 评论点赞数量
     */
    private String commentLikeCount;

    /**
     * 评论回复数
     */
    private String subCommentCount;

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
    public void setUserId(String userId) {
        this.userId = userId;
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
     * 用户性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 用户性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 用户主页地址
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * 用户主页地址
     */
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    /**
     * 发布微博的地理信息
     */
    public String getIpLocation() {
        return ipLocation;
    }

    /**
     * 发布微博的地理信息
     */
    public void setIpLocation(String ipLocation) {
        this.ipLocation = ipLocation;
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
    public void setAddTs(Long addTs) {
        this.addTs = addTs;
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
    public void setLastModifyTs(Long lastModifyTs) {
        this.lastModifyTs = lastModifyTs;
    }

    /**
     * 评论ID
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * 评论ID
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * 帖子ID
     */
    public String getNoteId() {
        return noteId;
    }

    /**
     * 帖子ID
     */
    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    /**
     * 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 评论时间戳
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 评论时间戳
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 评论日期时间
     */
    public String getCreateDateTime() {
        return createDateTime;
    }

    /**
     * 评论日期时间
     */
    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**
     * 评论点赞数量
     */
    public String getCommentLikeCount() {
        return commentLikeCount;
    }

    /**
     * 评论点赞数量
     */
    public void setCommentLikeCount(String commentLikeCount) {
        this.commentLikeCount = commentLikeCount;
    }

    /**
     * 评论回复数
     */
    public String getSubCommentCount() {
        return subCommentCount;
    }

    /**
     * 评论回复数
     */
    public void setSubCommentCount(String subCommentCount) {
        this.subCommentCount = subCommentCount;
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
        WeiboNoteComment other = (WeiboNoteComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getProfileUrl() == null ? other.getProfileUrl() == null : this.getProfileUrl().equals(other.getProfileUrl()))
            && (this.getIpLocation() == null ? other.getIpLocation() == null : this.getIpLocation().equals(other.getIpLocation()))
            && (this.getAddTs() == null ? other.getAddTs() == null : this.getAddTs().equals(other.getAddTs()))
            && (this.getLastModifyTs() == null ? other.getLastModifyTs() == null : this.getLastModifyTs().equals(other.getLastModifyTs()))
            && (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getNoteId() == null ? other.getNoteId() == null : this.getNoteId().equals(other.getNoteId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateDateTime() == null ? other.getCreateDateTime() == null : this.getCreateDateTime().equals(other.getCreateDateTime()))
            && (this.getCommentLikeCount() == null ? other.getCommentLikeCount() == null : this.getCommentLikeCount().equals(other.getCommentLikeCount()))
            && (this.getSubCommentCount() == null ? other.getSubCommentCount() == null : this.getSubCommentCount().equals(other.getSubCommentCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getProfileUrl() == null) ? 0 : getProfileUrl().hashCode());
        result = prime * result + ((getIpLocation() == null) ? 0 : getIpLocation().hashCode());
        result = prime * result + ((getAddTs() == null) ? 0 : getAddTs().hashCode());
        result = prime * result + ((getLastModifyTs() == null) ? 0 : getLastModifyTs().hashCode());
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getNoteId() == null) ? 0 : getNoteId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateDateTime() == null) ? 0 : getCreateDateTime().hashCode());
        result = prime * result + ((getCommentLikeCount() == null) ? 0 : getCommentLikeCount().hashCode());
        result = prime * result + ((getSubCommentCount() == null) ? 0 : getSubCommentCount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(userId);
        sb.append(", nickname=").append(nickname);
        sb.append(", avatar=").append(avatar);
        sb.append(", gender=").append(gender);
        sb.append(", profile_url=").append(profileUrl);
        sb.append(", ip_location=").append(ipLocation);
        sb.append(", add_ts=").append(addTs);
        sb.append(", last_modify_ts=").append(lastModifyTs);
        sb.append(", comment_id=").append(commentId);
        sb.append(", note_id=").append(noteId);
        sb.append(", content=").append(content);
        sb.append(", create_time=").append(createTime);
        sb.append(", create_date_time=").append(createDateTime);
        sb.append(", comment_like_count=").append(commentLikeCount);
        sb.append(", sub_comment_count=").append(subCommentCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}