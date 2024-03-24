package cn.kevinwang.model.dataObject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 抖音视频评论
 * @TableName douyin_aweme_comment
 */
@TableName(value ="douyin_aweme_comment")
public class DouyinAwemeComment implements Serializable {
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
     * 用户sec_uid
     */
    private String secUid;

    /**
     * 用户短ID
     */
    private String shortUserId;

    /**
     * 用户唯一ID
     */
    private String userUniqueId;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像地址
     */
    private String avatar;

    /**
     * 用户签名
     */
    private String userSignature;

    /**
     * 评论时的IP地址
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
     * 视频ID
     */
    private String awemeId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论时间戳
     */
    private Long createTime;

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
     * 用户sec_uid
     */
    public String getSecUid() {
        return secUid;
    }

    /**
     * 用户sec_uid
     */
    public void setSecUid(String secUid) {
        this.secUid = secUid;
    }

    /**
     * 用户短ID
     */
    public String getShortUserId() {
        return shortUserId;
    }

    /**
     * 用户短ID
     */
    public void setShortUserId(String shortUserId) {
        this.shortUserId = shortUserId;
    }

    /**
     * 用户唯一ID
     */
    public String getUserUniqueId() {
        return userUniqueId;
    }

    /**
     * 用户唯一ID
     */
    public void setUserUniqueId(String userUniqueId) {
        this.userUniqueId = userUniqueId;
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
     * 用户签名
     */
    public String getUserSignature() {
        return userSignature;
    }

    /**
     * 用户签名
     */
    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    /**
     * 评论时的IP地址
     */
    public String getIpLocation() {
        return ipLocation;
    }

    /**
     * 评论时的IP地址
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
     * 视频ID
     */
    public String getAwemeId() {
        return awemeId;
    }

    /**
     * 视频ID
     */
    public void setAwemeId(String awemeId) {
        this.awemeId = awemeId;
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
        DouyinAwemeComment other = (DouyinAwemeComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSecUid() == null ? other.getSecUid() == null : this.getSecUid().equals(other.getSecUid()))
            && (this.getShortUserId() == null ? other.getShortUserId() == null : this.getShortUserId().equals(other.getShortUserId()))
            && (this.getUserUniqueId() == null ? other.getUserUniqueId() == null : this.getUserUniqueId().equals(other.getUserUniqueId()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getUserSignature() == null ? other.getUserSignature() == null : this.getUserSignature().equals(other.getUserSignature()))
            && (this.getIpLocation() == null ? other.getIpLocation() == null : this.getIpLocation().equals(other.getIpLocation()))
            && (this.getAddTs() == null ? other.getAddTs() == null : this.getAddTs().equals(other.getAddTs()))
            && (this.getLastModifyTs() == null ? other.getLastModifyTs() == null : this.getLastModifyTs().equals(other.getLastModifyTs()))
            && (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getAwemeId() == null ? other.getAwemeId() == null : this.getAwemeId().equals(other.getAwemeId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSubCommentCount() == null ? other.getSubCommentCount() == null : this.getSubCommentCount().equals(other.getSubCommentCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getSecUid() == null) ? 0 : getSecUid().hashCode());
        result = prime * result + ((getShortUserId() == null) ? 0 : getShortUserId().hashCode());
        result = prime * result + ((getUserUniqueId() == null) ? 0 : getUserUniqueId().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getUserSignature() == null) ? 0 : getUserSignature().hashCode());
        result = prime * result + ((getIpLocation() == null) ? 0 : getIpLocation().hashCode());
        result = prime * result + ((getAddTs() == null) ? 0 : getAddTs().hashCode());
        result = prime * result + ((getLastModifyTs() == null) ? 0 : getLastModifyTs().hashCode());
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getAwemeId() == null) ? 0 : getAwemeId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
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
        sb.append(", sec_uid=").append(secUid);
        sb.append(", short_user_id=").append(shortUserId);
        sb.append(", user_unique_id=").append(userUniqueId);
        sb.append(", nickname=").append(nickname);
        sb.append(", avatar=").append(avatar);
        sb.append(", user_signature=").append(userSignature);
        sb.append(", ip_location=").append(ipLocation);
        sb.append(", add_ts=").append(addTs);
        sb.append(", last_modify_ts=").append(lastModifyTs);
        sb.append(", comment_id=").append(commentId);
        sb.append(", aweme_id=").append(awemeId);
        sb.append(", content=").append(content);
        sb.append(", create_time=").append(createTime);
        sb.append(", sub_comment_count=").append(subCommentCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}