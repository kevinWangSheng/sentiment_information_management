package cn.kevinwang.model.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @create 2024-02-16-16:25
 */
public class TitleAnalyize {
    private String title;

    private Integer count;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public TitleAnalyize(String title, Integer count) {
        this.title = title;
        this.count = count;
    }

    public TitleAnalyize() {
    }

    public static List<TitleAnalyize> map2List(Map<String, Integer> wordFrequency) {
        if(null == wordFrequency || 0 == wordFrequency.size()){
            return null;
        }
        List<TitleAnalyize> titleAnalyizes = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if(entry.getKey().length()<=1 || entry.getValue()<2){
                continue;
            }
            titleAnalyizes.add(new TitleAnalyize(entry.getKey(),entry.getValue()));
        }
        titleAnalyizes.sort((o1, o2) -> o2.getCount()-o1.getCount());
        return titleAnalyizes;
    }
}
