package generator.domain;

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
    private String user_id;

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
     * 笔记ID
     */
    private String note_id;

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
    private Long last_update_time;

    /**
     * 笔记点赞数
     */
    private String liked_count;

    /**
     * 笔记收藏数
     */
    private String collected_count;

    /**
     * 笔记评论数
     */
    private String comment_count;

    /**
     * 笔记分享数
     */
    private String share_count;

    /**
     * 笔记封面图片列表
     */
    private String image_list;

    /**
     * 笔记详情页的URL
     */
    private String note_url;

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
     * 笔记ID
     */
    public String getNote_id() {
        return note_id;
    }

    /**
     * 笔记ID
     */
    public void setNote_id(String note_id) {
        this.note_id = note_id;
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
    public Long getLast_update_time() {
        return last_update_time;
    }

    /**
     * 笔记最后更新时间戳
     */
    public void setLast_update_time(Long last_update_time) {
        this.last_update_time = last_update_time;
    }

    /**
     * 笔记点赞数
     */
    public String getLiked_count() {
        return liked_count;
    }

    /**
     * 笔记点赞数
     */
    public void setLiked_count(String liked_count) {
        this.liked_count = liked_count;
    }

    /**
     * 笔记收藏数
     */
    public String getCollected_count() {
        return collected_count;
    }

    /**
     * 笔记收藏数
     */
    public void setCollected_count(String collected_count) {
        this.collected_count = collected_count;
    }

    /**
     * 笔记评论数
     */
    public String getComment_count() {
        return comment_count;
    }

    /**
     * 笔记评论数
     */
    public void setComment_count(String comment_count) {
        this.comment_count = comment_count;
    }

    /**
     * 笔记分享数
     */
    public String getShare_count() {
        return share_count;
    }

    /**
     * 笔记分享数
     */
    public void setShare_count(String share_count) {
        this.share_count = share_count;
    }

    /**
     * 笔记封面图片列表
     */
    public String getImage_list() {
        return image_list;
    }

    /**
     * 笔记封面图片列表
     */
    public void setImage_list(String image_list) {
        this.image_list = image_list;
    }

    /**
     * 笔记详情页的URL
     */
    public String getNote_url() {
        return note_url;
    }

    /**
     * 笔记详情页的URL
     */
    public void setNote_url(String note_url) {
        this.note_url = note_url;
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
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getIp_location() == null ? other.getIp_location() == null : this.getIp_location().equals(other.getIp_location()))
            && (this.getAdd_ts() == null ? other.getAdd_ts() == null : this.getAdd_ts().equals(other.getAdd_ts()))
            && (this.getLast_modify_ts() == null ? other.getLast_modify_ts() == null : this.getLast_modify_ts().equals(other.getLast_modify_ts()))
            && (this.getNote_id() == null ? other.getNote_id() == null : this.getNote_id().equals(other.getNote_id()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getLast_update_time() == null ? other.getLast_update_time() == null : this.getLast_update_time().equals(other.getLast_update_time()))
            && (this.getLiked_count() == null ? other.getLiked_count() == null : this.getLiked_count().equals(other.getLiked_count()))
            && (this.getCollected_count() == null ? other.getCollected_count() == null : this.getCollected_count().equals(other.getCollected_count()))
            && (this.getComment_count() == null ? other.getComment_count() == null : this.getComment_count().equals(other.getComment_count()))
            && (this.getShare_count() == null ? other.getShare_count() == null : this.getShare_count().equals(other.getShare_count()))
            && (this.getImage_list() == null ? other.getImage_list() == null : this.getImage_list().equals(other.getImage_list()))
            && (this.getNote_url() == null ? other.getNote_url() == null : this.getNote_url().equals(other.getNote_url()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getIp_location() == null) ? 0 : getIp_location().hashCode());
        result = prime * result + ((getAdd_ts() == null) ? 0 : getAdd_ts().hashCode());
        result = prime * result + ((getLast_modify_ts() == null) ? 0 : getLast_modify_ts().hashCode());
        result = prime * result + ((getNote_id() == null) ? 0 : getNote_id().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getLast_update_time() == null) ? 0 : getLast_update_time().hashCode());
        result = prime * result + ((getLiked_count() == null) ? 0 : getLiked_count().hashCode());
        result = prime * result + ((getCollected_count() == null) ? 0 : getCollected_count().hashCode());
        result = prime * result + ((getComment_count() == null) ? 0 : getComment_count().hashCode());
        result = prime * result + ((getShare_count() == null) ? 0 : getShare_count().hashCode());
        result = prime * result + ((getImage_list() == null) ? 0 : getImage_list().hashCode());
        result = prime * result + ((getNote_url() == null) ? 0 : getNote_url().hashCode());
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
        sb.append(", nickname=").append(nickname);
        sb.append(", avatar=").append(avatar);
        sb.append(", ip_location=").append(ip_location);
        sb.append(", add_ts=").append(add_ts);
        sb.append(", last_modify_ts=").append(last_modify_ts);
        sb.append(", note_id=").append(note_id);
        sb.append(", type=").append(type);
        sb.append(", title=").append(title);
        sb.append(", desc=").append(desc);
        sb.append(", time=").append(time);
        sb.append(", last_update_time=").append(last_update_time);
        sb.append(", liked_count=").append(liked_count);
        sb.append(", collected_count=").append(collected_count);
        sb.append(", comment_count=").append(comment_count);
        sb.append(", share_count=").append(share_count);
        sb.append(", image_list=").append(image_list);
        sb.append(", note_url=").append(note_url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}