package cn.kevinwang.service;

import cn.kevinwang.model.vo.UserAnalyizeVO;
import cn.kevinwang.model.vo.UserVO;
import cn.kevinwang.model.vo.VideoCommentVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
 * @author wang
 * @create 2024-02-17-13:22
 */
public interface VideoCommentArr<T> {

    String getType();
    IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId,String commentId,String searchContent,String commentBeginTime,String commentEndTime,String nickname,String ipLocation,String profileUrl,String commentTime);

    QueryWrapper<T> getQueryWrapper(String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl,String commentTime);
    IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId,String commentId,String searchContent,String commentBeginTime,String commentEndTime,String nickname,String ipLocation,String profileUrl);

    IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId,String commentId,String searchContent,String commentBeginTime,String commentEndTime,String nickname,String ipLocation);


    IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId,String commentId,String searchContent,String commentBeginTime,String commentEndTime,String nickname);


    IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId,String commentId,String searchContent,String commentBeginTime,String commentEndTime);

    IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId,String commentId,String searchContent);


    IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId,String commentId);


    IPage<VideoCommentVO> selectVideoCommentByVideoId(Integer start, Integer size, String videoId);

    IPage<VideoCommentVO> selectVideoCommentByVideoId(Page page, String videoId);


    IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size);

    IPage<VideoCommentVO> selectVideoCommentByCommentId(Integer start, Integer size,String commentId);

    IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size,String searchContext);


    List<UserVO> selectUserVO(String videoId);

    List<String> selectIpLocation();

    List<UserAnalyizeVO> selectUserAnalyize();

    Long listCount();
}
