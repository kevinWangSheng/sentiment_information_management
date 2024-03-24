package cn.kevinwang.model.vo;

/**
 * @author wang
 * @create 2024-02-25-22:51
 */
public class UserAnalyizeVO {
    private String ipLocation;

    private Long count;

    public UserAnalyizeVO() {
    }

    public UserAnalyizeVO(String ipLocation, Long count) {
        this.ipLocation = ipLocation;
        this.count = count;
    }

    public String getIpLocation() {
        return ipLocation;
    }

    public void setIpLocation(String ipLocation) {
        this.ipLocation = ipLocation;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
