package cn.kevinwang.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wang
 * @create 2024-02-14-17:42
 */

public class DateMapper {
    private static final SimpleDateFormat DATA_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    @Named("asTimeStamp")
    public long asTimeStamp(String createTime){
        try {
            return DATA_FORMAT.parse(createTime).getTime();
        }catch (Exception e){
            throw new RuntimeException("时间转换异常");
        }
    }

    @Named("asDateString")
    public String asDateString(Long timestamp){
        try {
            return DATA_FORMAT.format(new Date(timestamp * 1000));
        } catch (Exception e) {
            throw new RuntimeException("转化时间异常");
        }
    }

    @Named("asDateStringMicSec")
    public String asDateStringMicSec(Long timestamp){
        try {
            return DATA_FORMAT.format(new Date(timestamp));
        } catch (Exception e) {
            throw new RuntimeException("转化时间异常");
        }
    }
}
