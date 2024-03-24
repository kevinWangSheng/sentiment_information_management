package cn.kevinwang.service;

import cn.kevinwang.model.vo.UserAnalyizeVO;
import cn.kevinwang.model.vo.VideoCommentVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @author wang
 * @create 2024-02-17-20:41
 */
public interface VideoCommentService {
    IPage<VideoCommentVO> selectVideoCommentByPage(String platfrom,Integer start,Integer size, String videoId,String commentId,String searchContent,String commentBeginTime,String commentEndTime,String nickname,String ipLocation,String profileUrl,String commentTime);

    IPage<VideoCommentVO> commentAnalysis(Integer pageStart, Integer pageSize, String platfrom, String videoId) throws Exception;

    Long listCount(String platfrom);

    List<UserAnalyizeVO> selectUserAnalyize(String platfrom);
}
