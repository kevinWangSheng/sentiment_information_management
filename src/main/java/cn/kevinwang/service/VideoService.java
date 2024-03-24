package cn.kevinwang.service;

import cn.kevinwang.model.vo.CreateTimeCount;
import cn.kevinwang.model.vo.TitleAnalyize;
import cn.kevinwang.model.vo.UserVO;
import cn.kevinwang.model.vo.VideoVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.IOException;
import java.util.List;

/**
 * @author wang
 * @create 2024-02-14-11:57
 */
public interface VideoService {
    IPage<VideoVO> getVideoListByPage(Integer start, Integer size,String platfrom);

    Long getAllCount(String platfrom);

    List<TitleAnalyize> analyizeTitle(String platfrom) throws IOException;

    List<String> getAllTitles();

    List<CreateTimeCount> statisticsCreateTime(String platfrom);

    List<UserVO> selectUserVO(String platfrom);

    Page<VideoVO> getHotVideo(String platfrom, int pageStart, int pageSize);
}
