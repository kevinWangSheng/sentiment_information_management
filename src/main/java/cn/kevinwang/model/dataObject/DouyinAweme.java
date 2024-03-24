package cn.kevinwang.model.dataObject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 抖音视频
 * @TableName douyin_aweme
 */
@TableName(value ="douyin_aweme")
public class DouyinAweme implements Serializable {
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
     * 视频ID
     */
    private String awemeId;

    /**
     * 视频类型
     */
    private String awemeType;

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
     * 视频评论数
     */
    private String commentCount;

    /**
     * 视频分享数
     */
    private String shareCount;

    /**
     * 视频收藏数
     */
    private String collectedCount;

    /**
     * 视频详情页URL
     */
    private String awemeUrl;

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
    public String getUser_signature() {
        return userSignature;
    }

    /**
     * 用户签名
     */
    public void setUser_signature(String user_signature) {
        this.userSignature = user_signature;
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
     * 视频类型
     */
    public String getAwemeType() {
        return awemeType;
    }

    /**
     * 视频类型
     */
    public void setAwemeType(String awemeType) {
        this.awemeType = awemeType;
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
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
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
    public void setLikedCount(String likedCount) {
        this.likedCount = likedCount;
    }

    /**
     * 视频评论数
     */
    public String getCommentCount() {
        return commentCount;
    }

    /**
     * 视频评论数
     */
    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 视频分享数
     */
    public String getShareCount() {
        return shareCount;
    }

    /**
     * 视频分享数
     */
    public void setShareCount(String shareCount) {
        this.shareCount = shareCount;
    }

    /**
     * 视频收藏数
     */
    public String getCollectedCount() {
        return collectedCount;
    }

    /**
     * 视频收藏数
     */
    public void setCollectedCount(String collectedCount) {
        this.collectedCount = collectedCount;
    }

    /**
     * 视频详情页URL
     */
    public String getAwemeUrl() {
        return awemeUrl;
    }

    /**
     * 视频详情页URL
     */
    public void setAwemeUrl(String awemeUrl) {
        this.awemeUrl = awemeUrl;
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
        DouyinAweme other = (DouyinAweme) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSecUid() == null ? other.getSecUid() == null : this.getSecUid().equals(other.getSecUid()))
            && (this.getShortUserId() == null ? other.getShortUserId() == null : this.getShortUserId().equals(other.getShortUserId()))
            && (this.getUserUniqueId() == null ? other.getUserUniqueId() == null : this.getUserUniqueId().equals(other.getUserUniqueId()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getUser_signature() == null ? other.getUser_signature() == null : this.getUser_signature().equals(other.getUser_signature()))
            && (this.getIpLocation() == null ? other.getIpLocation() == null : this.getIpLocation().equals(other.getIpLocation()))
            && (this.getAddTs() == null ? other.getAddTs() == null : this.getAddTs().equals(other.getAddTs()))
            && (this.getLastModifyTs() == null ? other.getLastModifyTs() == null : this.getLastModifyTs().equals(other.getLastModifyTs()))
            && (this.getAwemeId() == null ? other.getAwemeId() == null : this.getAwemeId().equals(other.getAwemeId()))
            && (this.getAwemeType() == null ? other.getAwemeType() == null : this.getAwemeType().equals(other.getAwemeType()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLikedCount() == null ? other.getLikedCount() == null : this.getLikedCount().equals(other.getLikedCount()))
            && (this.getCommentCount() == null ? other.getCommentCount() == null : this.getCommentCount().equals(other.getCommentCount()))
            && (this.getShareCount() == null ? other.getShareCount() == null : this.getShareCount().equals(other.getShareCount()))
            && (this.getCollectedCount() == null ? other.getCollectedCount() == null : this.getCollectedCount().equals(other.getCollectedCount()))
            && (this.getAwemeUrl() == null ? other.getAwemeUrl() == null : this.getAwemeUrl().equals(other.getAwemeUrl()));
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
        result = prime * result + ((getUser_signature() == null) ? 0 : getUser_signature().hashCode());
        result = prime * result + ((getIpLocation() == null) ? 0 : getIpLocation().hashCode());
        result = prime * result + ((getAddTs() == null) ? 0 : getAddTs().hashCode());
        result = prime * result + ((getLastModifyTs() == null) ? 0 : getLastModifyTs().hashCode());
        result = prime * result + ((getAwemeId() == null) ? 0 : getAwemeId().hashCode());
        result = prime * result + ((getAwemeType() == null) ? 0 : getAwemeType().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLikedCount() == null) ? 0 : getLikedCount().hashCode());
        result = prime * result + ((getCommentCount() == null) ? 0 : getCommentCount().hashCode());
        result = prime * result + ((getShareCount() == null) ? 0 : getShareCount().hashCode());
        result = prime * result + ((getCollectedCount() == null) ? 0 : getCollectedCount().hashCode());
        result = prime * result + ((getAwemeUrl() == null) ? 0 : getAwemeUrl().hashCode());
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
        sb.append(", aweme_id=").append(awemeId);
        sb.append(", aweme_type=").append(awemeType);
        sb.append(", title=").append(title);
        sb.append(", desc=").append(desc);
        sb.append(", create_time=").append(createTime);
        sb.append(", liked_count=").append(likedCount);
        sb.append(", comment_count=").append(commentCount);
        sb.append(", share_count=").append(shareCount);
        sb.append(", collected_count=").append(collectedCount);
        sb.append(", aweme_url=").append(awemeUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }
}