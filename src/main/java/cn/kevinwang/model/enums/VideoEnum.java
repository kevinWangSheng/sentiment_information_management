package cn.kevinwang.model.enums;

/**
 * @author wang
 * @create 2024-02-13-18:17
 */
public enum VideoEnum {
    bilibili("bilibili"),
    weibo("weibo"),
    douyin("douyin"),
    kuaishou("kuaishou"),
    xhs("xhs");

    private String videoName;

    public static VideoEnum get(String videoName) {
        for (VideoEnum video : VideoEnum.values()) {
            if (video.videoName.equals(videoName)) {
                return video;
            }
        }
        return null;
    }

    VideoEnum(String videoName) {
        this.videoName = videoName;
    }


    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
}
