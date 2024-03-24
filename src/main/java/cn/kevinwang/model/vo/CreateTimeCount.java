package cn.kevinwang.model.vo;

import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wang
 * @create 2024-02-16-18:28
 */
public class CreateTimeCount {

    private String createTime;

    private Long count;



    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public CreateTimeCount(String createTime, Long count) {
        this.createTime = createTime;
        this.count = count;
    }

    public CreateTimeCount(String createTime) {
        this.createTime = createTime;
    }

    public CreateTimeCount() {
    }

    public static List<CreateTimeCount> getStaticsCreateTime(List<Long> timeList, SimpleDateFormat simpleDateFormat) {
        List<Date> dateList = new ArrayList<>();
        for(Long time:timeList){
            dateList.add(new Date(time));
        }
        Map<String,Long> dateMap = new HashMap<>();
        for (Date date : dateList) {
            String yearAndMonth = simpleDateFormat.format(date);
            dateMap.put(yearAndMonth, dateMap.getOrDefault(yearAndMonth, 0L) + 1);
        }
        List<CreateTimeCount> createTimeCountList = new ArrayList<>();
        for (Map.Entry<String, Long> entry : dateMap.entrySet()) {
            createTimeCountList.add(new CreateTimeCount(entry.getKey(), entry.getValue()));
        }
        createTimeCountList.sort(Comparator.comparing(CreateTimeCount::getCreateTime));
        return createTimeCountList;
    }
}
