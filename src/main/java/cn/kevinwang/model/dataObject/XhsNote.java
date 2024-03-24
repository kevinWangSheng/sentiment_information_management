package cn.kevinwang.model.dataObject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 小红书笔记
 * @TableName xhs_note
 */
@TableName(value ="xhs_note")
public class XhsNote implements Serializable {
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
     * 笔记ID
     */
    private String noteId;

    /**
     * 笔记类型(normal | video)
     */
    private String type;

    /**
     * 笔记标题
     */
    private String title;

    /**
     * 笔记描述
     */
    private String desc;

    /**
     * 笔记发布时间戳
     */
    private Long time;

    /**
     * 笔记最后更新时间戳
     */
    private Long lastUpdateTime;

    /**
     * 笔记点赞数
     */
    private String likedCount;

    /**
     * 笔记收藏数
     */
    private String collectedCount;

    /**
     * 笔记评论数
     */
    private String commentCount;

    /**
     * 笔记分享数
     */
    private String shareCount;

    /**
     * 笔记封面图片列表
     */
    private String imageList;

    /**
     * 笔记详情页的URL
     */
    private String noteUrl;

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
     * 笔记ID
     */
    public String getNoteId() {
        return noteId;
    }

    /**
     * 笔记ID
     */
    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    /**
     * 笔记类型(normal | video)
     */
    public String getType() {
        return type;
    }

    /**
     * 笔记类型(normal | video)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 笔记标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 笔记标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 笔记描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 笔记描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 笔记发布时间戳
     */
    public Long getTime() {
        return time;
    }

    /**
     * 笔记发布时间戳
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * 笔记最后更新时间戳
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 笔记最后更新时间戳
     */
    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 笔记点赞数
     */
    public String getLikedCount() {
        return likedCount;
    }

    /**
     * 笔记点赞数
     */
    public void setLikedCount(String likedCount) {
        this.likedCount = likedCount;
    }

    /**
     * 笔记收藏数
     */
    public String getCollectedCount() {
        return collectedCount;
    }

    /**
     * 笔记收藏数
     */
    public void setCollectedCount(String collectedCount) {
        this.collectedCount = collectedCount;
    }

    /**
     * 笔记评论数
     */
    public String getCommentCount() {
        return commentCount;
    }

    /**
     * 笔记评论数
     */
    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 笔记分享数
     */
    public String getShareCount() {
        return shareCount;
    }

    /**
     * 笔记分享数
     */
    public void setShareCount(String shareCount) {
        this.shareCount = shareCount;
    }

    /**
     * 笔记封面图片列表
     */
    public String getImageList() {
        return imageList;
    }

    /**
     * 笔记封面图片列表
     */
    public void setImageList(String imageList) {
        this.imageList = imageList;
    }

    /**
     * 笔记详情页的URL
     */
    public String getNoteUrl() {
        return noteUrl;
    }

    /**
     * 笔记详情页的URL
     */
    public void setNoteUrl(String noteUrl) {
        this.noteUrl = noteUrl;
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
        XhsNote other = (XhsNote) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getIpLocation() == null ? other.getIpLocation() == null : this.getIpLocation().equals(other.getIpLocation()))
            && (this.getAddTs() == null ? other.getAddTs() == null : this.getAddTs().equals(other.getAddTs()))
            && (this.getLastModifyTs() == null ? other.getLastModifyTs() == null : this.getLastModifyTs().equals(other.getLastModifyTs()))
            && (this.getNoteId() == null ? other.getNoteId() == null : this.getNoteId().equals(other.getNoteId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getLikedCount() == null ? other.getLikedCount() == null : this.getLikedCount().equals(other.getLikedCount()))
            && (this.getCollectedCount() == null ? other.getCollectedCount() == null : this.getCollectedCount().equals(other.getCollectedCount()))
            && (this.getCommentCount() == null ? other.getCommentCount() == null : this.getCommentCount().equals(other.getCommentCount()))
            && (this.getShareCount() == null ? other.getShareCount() == null : this.getShareCount().equals(other.getShareCount()))
            && (this.getImageList() == null ? other.getImageList() == null : this.getImageList().equals(other.getImageList()))
            && (this.getNoteUrl() == null ? other.getNoteUrl() == null : this.getNoteUrl().equals(other.getNoteUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getIpLocation() == null) ? 0 : getIpLocation().hashCode());
        result = prime * result + ((getAddTs() == null) ? 0 : getAddTs().hashCode());
        result = prime * result + ((getLastModifyTs() == null) ? 0 : getLastModifyTs().hashCode());
        result = prime * result + ((getNoteId() == null) ? 0 : getNoteId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getLikedCount() == null) ? 0 : getLikedCount().hashCode());
        result = prime * result + ((getCollectedCount() == null) ? 0 : getCollectedCount().hashCode());
        result = prime * result + ((getCommentCount() == null) ? 0 : getCommentCount().hashCode());
        result = prime * result + ((getShareCount() == null) ? 0 : getShareCount().hashCode());
        result = prime * result + ((getImageList() == null) ? 0 : getImageList().hashCode());
        result = prime * result + ((getNoteUrl() == null) ? 0 : getNoteUrl().hashCode());
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
        sb.append(", ip_location=").append(ipLocation);
        sb.append(", add_ts=").append(addTs);
        sb.append(", last_modify_ts=").append(lastModifyTs);
        sb.append(", note_id=").append(noteId);
        sb.append(", type=").append(type);
        sb.append(", title=").append(title);
        sb.append(", desc=").append(desc);
        sb.append(", time=").append(time);
        sb.append(", last_update_time=").append(lastUpdateTime);
        sb.append(", liked_count=").append(likedCount);
        sb.append(", collected_count=").append(collectedCount);
        sb.append(", comment_count=").append(commentCount);
        sb.append(", share_count=").append(shareCount);
        sb.append(", image_list=").append(imageList);
        sb.append(", note_url=").append(noteUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}