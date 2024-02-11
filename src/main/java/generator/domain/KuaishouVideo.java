package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 快手视频
 * @TableName kuaishou_video
 */
@TableName(value ="kuaishou_video")
public class KuaishouVideo implements Serializable {
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
    private String video_id;

    /**
     * 视频类型
     */
    private String video_type;

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
     * 视频浏览数量
     */
    private String viewd_count;

    /**
     * 视频详情URL
     */
    private String video_url;

    /**
     * 视频封面图 URL
     */
    private String video_cover_url;

    /**
     * 视频播放 URL
     */
    private String video_play_url;

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
    public String getVideo_id() {
        return video_id;
    }

    /**
     * 视频ID
     */
    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    /**
     * 视频类型
     */
    public String getVideo_type() {
        return video_type;
    }

    /**
     * 视频类型
     */
    public void setVideo_type(String video_type) {
        this.video_type = video_type;
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
     * 视频浏览数量
     */
    public String getViewd_count() {
        return viewd_count;
    }

    /**
     * 视频浏览数量
     */
    public void setViewd_count(String viewd_count) {
        this.viewd_count = viewd_count;
    }

    /**
     * 视频详情URL
     */
    public String getVideo_url() {
        return video_url;
    }

    /**
     * 视频详情URL
     */
    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    /**
     * 视频封面图 URL
     */
    public String getVideo_cover_url() {
        return video_cover_url;
    }

    /**
     * 视频封面图 URL
     */
    public void setVideo_cover_url(String video_cover_url) {
        this.video_cover_url = video_cover_url;
    }

    /**
     * 视频播放 URL
     */
    public String getVideo_play_url() {
        return video_play_url;
    }

    /**
     * 视频播放 URL
     */
    public void setVideo_play_url(String video_play_url) {
        this.video_play_url = video_play_url;
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
        KuaishouVideo other = (KuaishouVideo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getAdd_ts() == null ? other.getAdd_ts() == null : this.getAdd_ts().equals(other.getAdd_ts()))
            && (this.getLast_modify_ts() == null ? other.getLast_modify_ts() == null : this.getLast_modify_ts().equals(other.getLast_modify_ts()))
            && (this.getVideo_id() == null ? other.getVideo_id() == null : this.getVideo_id().equals(other.getVideo_id()))
            && (this.getVideo_type() == null ? other.getVideo_type() == null : this.getVideo_type().equals(other.getVideo_type()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getLiked_count() == null ? other.getLiked_count() == null : this.getLiked_count().equals(other.getLiked_count()))
            && (this.getViewd_count() == null ? other.getViewd_count() == null : this.getViewd_count().equals(other.getViewd_count()))
            && (this.getVideo_url() == null ? other.getVideo_url() == null : this.getVideo_url().equals(other.getVideo_url()))
            && (this.getVideo_cover_url() == null ? other.getVideo_cover_url() == null : this.getVideo_cover_url().equals(other.getVideo_cover_url()))
            && (this.getVideo_play_url() == null ? other.getVideo_play_url() == null : this.getVideo_play_url().equals(other.getVideo_play_url()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getAdd_ts() == null) ? 0 : getAdd_ts().hashCode());
        result = prime * result + ((getLast_modify_ts() == null) ? 0 : getLast_modify_ts().hashCode());
        result = prime * result + ((getVideo_id() == null) ? 0 : getVideo_id().hashCode());
        result = prime * result + ((getVideo_type() == null) ? 0 : getVideo_type().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getLiked_count() == null) ? 0 : getLiked_count().hashCode());
        result = prime * result + ((getViewd_count() == null) ? 0 : getViewd_count().hashCode());
        result = prime * result + ((getVideo_url() == null) ? 0 : getVideo_url().hashCode());
        result = prime * result + ((getVideo_cover_url() == null) ? 0 : getVideo_cover_url().hashCode());
        result = prime * result + ((getVideo_play_url() == null) ? 0 : getVideo_play_url().hashCode());
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
        sb.append(", add_ts=").append(add_ts);
        sb.append(", last_modify_ts=").append(last_modify_ts);
        sb.append(", video_id=").append(video_id);
        sb.append(", video_type=").append(video_type);
        sb.append(", title=").append(title);
        sb.append(", desc=").append(desc);
        sb.append(", create_time=").append(create_time);
        sb.append(", liked_count=").append(liked_count);
        sb.append(", viewd_count=").append(viewd_count);
        sb.append(", video_url=").append(video_url);
        sb.append(", video_cover_url=").append(video_cover_url);
        sb.append(", video_play_url=").append(video_play_url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}