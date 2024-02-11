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
    private String user_id;

    /**
     * 用户sec_uid
     */
    private String sec_uid;

    /**
     * 用户短ID
     */
    private String short_user_id;

    /**
     * 用户唯一ID
     */
    private String user_unique_id;

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
    private String user_signature;

    /**
     * 评论时的IP地址
     */
    private String ip_location;

    /**
     * 记录添加时间戳
     */
    private Long add_ts;

    /**
     * 记录最后修改时间戳
     */
    private Long last_modify_ts;

    /**
     * 视频ID
     */
    private String aweme_id;

    /**
     * 视频类型
     */
    private String aweme_type;

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
    private Long create_time;

    /**
     * 视频点赞数
     */
    private String liked_count;

    /**
     * 视频评论数
     */
    private String comment_count;

    /**
     * 视频分享数
     */
    private String share_count;

    /**
     * 视频收藏数
     */
    private String collected_count;

    /**
     * 视频详情页URL
     */
    private String aweme_url;

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
    public String getUser_id() {
        return user_id;
    }

    /**
     * 用户ID
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * 用户sec_uid
     */
    public String getSec_uid() {
        return sec_uid;
    }

    /**
     * 用户sec_uid
     */
    public void setSec_uid(String sec_uid) {
        this.sec_uid = sec_uid;
    }

    /**
     * 用户短ID
     */
    public String getShort_user_id() {
        return short_user_id;
    }

    /**
     * 用户短ID
     */
    public void setShort_user_id(String short_user_id) {
        this.short_user_id = short_user_id;
    }

    /**
     * 用户唯一ID
     */
    public String getUser_unique_id() {
        return user_unique_id;
    }

    /**
     * 用户唯一ID
     */
    public void setUser_unique_id(String user_unique_id) {
        this.user_unique_id = user_unique_id;
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
        return user_signature;
    }

    /**
     * 用户签名
     */
    public void setUser_signature(String user_signature) {
        this.user_signature = user_signature;
    }

    /**
     * 评论时的IP地址
     */
    public String getIp_location() {
        return ip_location;
    }

    /**
     * 评论时的IP地址
     */
    public void setIp_location(String ip_location) {
        this.ip_location = ip_location;
    }

    /**
     * 记录添加时间戳
     */
    public Long getAdd_ts() {
        return add_ts;
    }

    /**
     * 记录添加时间戳
     */
    public void setAdd_ts(Long add_ts) {
        this.add_ts = add_ts;
    }

    /**
     * 记录最后修改时间戳
     */
    public Long getLast_modify_ts() {
        return last_modify_ts;
    }

    /**
     * 记录最后修改时间戳
     */
    public void setLast_modify_ts(Long last_modify_ts) {
        this.last_modify_ts = last_modify_ts;
    }

    /**
     * 视频ID
     */
    public String getAweme_id() {
        return aweme_id;
    }

    /**
     * 视频ID
     */
    public void setAweme_id(String aweme_id) {
        this.aweme_id = aweme_id;
    }

    /**
     * 视频类型
     */
    public String getAweme_type() {
        return aweme_type;
    }

    /**
     * 视频类型
     */
    public void setAweme_type(String aweme_type) {
        this.aweme_type = aweme_type;
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
    public Long getCreate_time() {
        return create_time;
    }

    /**
     * 视频发布时间戳
     */
    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    /**
     * 视频点赞数
     */
    public String getLiked_count() {
        return liked_count;
    }

    /**
     * 视频点赞数
     */
    public void setLiked_count(String liked_count) {
        this.liked_count = liked_count;
    }

    /**
     * 视频评论数
     */
    public String getComment_count() {
        return comment_count;
    }

    /**
     * 视频评论数
     */
    public void setComment_count(String comment_count) {
        this.comment_count = comment_count;
    }

    /**
     * 视频分享数
     */
    public String getShare_count() {
        return share_count;
    }

    /**
     * 视频分享数
     */
    public void setShare_count(String share_count) {
        this.share_count = share_count;
    }

    /**
     * 视频收藏数
     */
    public String getCollected_count() {
        return collected_count;
    }

    /**
     * 视频收藏数
     */
    public void setCollected_count(String collected_count) {
        this.collected_count = collected_count;
    }

    /**
     * 视频详情页URL
     */
    public String getAweme_url() {
        return aweme_url;
    }

    /**
     * 视频详情页URL
     */
    public void setAweme_url(String aweme_url) {
        this.aweme_url = aweme_url;
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
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getSec_uid() == null ? other.getSec_uid() == null : this.getSec_uid().equals(other.getSec_uid()))
            && (this.getShort_user_id() == null ? other.getShort_user_id() == null : this.getShort_user_id().equals(other.getShort_user_id()))
            && (this.getUser_unique_id() == null ? other.getUser_unique_id() == null : this.getUser_unique_id().equals(other.getUser_unique_id()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getUser_signature() == null ? other.getUser_signature() == null : this.getUser_signature().equals(other.getUser_signature()))
            && (this.getIp_location() == null ? other.getIp_location() == null : this.getIp_location().equals(other.getIp_location()))
            && (this.getAdd_ts() == null ? other.getAdd_ts() == null : this.getAdd_ts().equals(other.getAdd_ts()))
            && (this.getLast_modify_ts() == null ? other.getLast_modify_ts() == null : this.getLast_modify_ts().equals(other.getLast_modify_ts()))
            && (this.getAweme_id() == null ? other.getAweme_id() == null : this.getAweme_id().equals(other.getAweme_id()))
            && (this.getAweme_type() == null ? other.getAweme_type() == null : this.getAweme_type().equals(other.getAweme_type()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getLiked_count() == null ? other.getLiked_count() == null : this.getLiked_count().equals(other.getLiked_count()))
            && (this.getComment_count() == null ? other.getComment_count() == null : this.getComment_count().equals(other.getComment_count()))
            && (this.getShare_count() == null ? other.getShare_count() == null : this.getShare_count().equals(other.getShare_count()))
            && (this.getCollected_count() == null ? other.getCollected_count() == null : this.getCollected_count().equals(other.getCollected_count()))
            && (this.getAweme_url() == null ? other.getAweme_url() == null : this.getAweme_url().equals(other.getAweme_url()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getSec_uid() == null) ? 0 : getSec_uid().hashCode());
        result = prime * result + ((getShort_user_id() == null) ? 0 : getShort_user_id().hashCode());
        result = prime * result + ((getUser_unique_id() == null) ? 0 : getUser_unique_id().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getUser_signature() == null) ? 0 : getUser_signature().hashCode());
        result = prime * result + ((getIp_location() == null) ? 0 : getIp_location().hashCode());
        result = prime * result + ((getAdd_ts() == null) ? 0 : getAdd_ts().hashCode());
        result = prime * result + ((getLast_modify_ts() == null) ? 0 : getLast_modify_ts().hashCode());
        result = prime * result + ((getAweme_id() == null) ? 0 : getAweme_id().hashCode());
        result = prime * result + ((getAweme_type() == null) ? 0 : getAweme_type().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getLiked_count() == null) ? 0 : getLiked_count().hashCode());
        result = prime * result + ((getComment_count() == null) ? 0 : getComment_count().hashCode());
        result = prime * result + ((getShare_count() == null) ? 0 : getShare_count().hashCode());
        result = prime * result + ((getCollected_count() == null) ? 0 : getCollected_count().hashCode());
        result = prime * result + ((getAweme_url() == null) ? 0 : getAweme_url().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", sec_uid=").append(sec_uid);
        sb.append(", short_user_id=").append(short_user_id);
        sb.append(", user_unique_id=").append(user_unique_id);
        sb.append(", nickname=").append(nickname);
        sb.append(", avatar=").append(avatar);
        sb.append(", user_signature=").append(user_signature);
        sb.append(", ip_location=").append(ip_location);
        sb.append(", add_ts=").append(add_ts);
        sb.append(", last_modify_ts=").append(last_modify_ts);
        sb.append(", aweme_id=").append(aweme_id);
        sb.append(", aweme_type=").append(aweme_type);
        sb.append(", title=").append(title);
        sb.append(", desc=").append(desc);
        sb.append(", create_time=").append(create_time);
        sb.append(", liked_count=").append(liked_count);
        sb.append(", comment_count=").append(comment_count);
        sb.append(", share_count=").append(share_count);
        sb.append(", collected_count=").append(collected_count);
        sb.append(", aweme_url=").append(aweme_url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}