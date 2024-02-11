package generator.domain;

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
     * 用户性别
     */
    private String gender;

    /**
     * 用户主页地址
     */
    private String profile_url;

    /**
     * 发布微博的地理信息
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
     * 评论ID
     */
    private String comment_id;

    /**
     * 帖子ID
     */
    private String note_id;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论时间戳
     */
    private Long create_time;

    /**
     * 评论日期时间
     */
    private String create_date_time;

    /**
     * 评论点赞数量
     */
    private String comment_like_count;

    /**
     * 评论回复数
     */
    private String sub_comment_count;

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
    public String getProfile_url() {
        return profile_url;
    }

    /**
     * 用户主页地址
     */
    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }

    /**
     * 发布微博的地理信息
     */
    public String getIp_location() {
        return ip_location;
    }

    /**
     * 发布微博的地理信息
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
     * 评论ID
     */
    public String getComment_id() {
        return comment_id;
    }

    /**
     * 评论ID
     */
    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    /**
     * 帖子ID
     */
    public String getNote_id() {
        return note_id;
    }

    /**
     * 帖子ID
     */
    public void setNote_id(String note_id) {
        this.note_id = note_id;
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
    public Long getCreate_time() {
        return create_time;
    }

    /**
     * 评论时间戳
     */
    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    /**
     * 评论日期时间
     */
    public String getCreate_date_time() {
        return create_date_time;
    }

    /**
     * 评论日期时间
     */
    public void setCreate_date_time(String create_date_time) {
        this.create_date_time = create_date_time;
    }

    /**
     * 评论点赞数量
     */
    public String getComment_like_count() {
        return comment_like_count;
    }

    /**
     * 评论点赞数量
     */
    public void setComment_like_count(String comment_like_count) {
        this.comment_like_count = comment_like_count;
    }

    /**
     * 评论回复数
     */
    public String getSub_comment_count() {
        return sub_comment_count;
    }

    /**
     * 评论回复数
     */
    public void setSub_comment_count(String sub_comment_count) {
        this.sub_comment_count = sub_comment_count;
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
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getProfile_url() == null ? other.getProfile_url() == null : this.getProfile_url().equals(other.getProfile_url()))
            && (this.getIp_location() == null ? other.getIp_location() == null : this.getIp_location().equals(other.getIp_location()))
            && (this.getAdd_ts() == null ? other.getAdd_ts() == null : this.getAdd_ts().equals(other.getAdd_ts()))
            && (this.getLast_modify_ts() == null ? other.getLast_modify_ts() == null : this.getLast_modify_ts().equals(other.getLast_modify_ts()))
            && (this.getComment_id() == null ? other.getComment_id() == null : this.getComment_id().equals(other.getComment_id()))
            && (this.getNote_id() == null ? other.getNote_id() == null : this.getNote_id().equals(other.getNote_id()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getCreate_date_time() == null ? other.getCreate_date_time() == null : this.getCreate_date_time().equals(other.getCreate_date_time()))
            && (this.getComment_like_count() == null ? other.getComment_like_count() == null : this.getComment_like_count().equals(other.getComment_like_count()))
            && (this.getSub_comment_count() == null ? other.getSub_comment_count() == null : this.getSub_comment_count().equals(other.getSub_comment_count()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getProfile_url() == null) ? 0 : getProfile_url().hashCode());
        result = prime * result + ((getIp_location() == null) ? 0 : getIp_location().hashCode());
        result = prime * result + ((getAdd_ts() == null) ? 0 : getAdd_ts().hashCode());
        result = prime * result + ((getLast_modify_ts() == null) ? 0 : getLast_modify_ts().hashCode());
        result = prime * result + ((getComment_id() == null) ? 0 : getComment_id().hashCode());
        result = prime * result + ((getNote_id() == null) ? 0 : getNote_id().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getCreate_date_time() == null) ? 0 : getCreate_date_time().hashCode());
        result = prime * result + ((getComment_like_count() == null) ? 0 : getComment_like_count().hashCode());
        result = prime * result + ((getSub_comment_count() == null) ? 0 : getSub_comment_count().hashCode());
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
        sb.append(", gender=").append(gender);
        sb.append(", profile_url=").append(profile_url);
        sb.append(", ip_location=").append(ip_location);
        sb.append(", add_ts=").append(add_ts);
        sb.append(", last_modify_ts=").append(last_modify_ts);
        sb.append(", comment_id=").append(comment_id);
        sb.append(", note_id=").append(note_id);
        sb.append(", content=").append(content);
        sb.append(", create_time=").append(create_time);
        sb.append(", create_date_time=").append(create_date_time);
        sb.append(", comment_like_count=").append(comment_like_count);
        sb.append(", sub_comment_count=").append(sub_comment_count);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}