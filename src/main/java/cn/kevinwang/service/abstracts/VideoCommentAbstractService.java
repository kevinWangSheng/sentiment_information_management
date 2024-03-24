package cn.kevinwang.service.abstracts;

import cn.kevinwang.model.vo.UserAnalyizeVO;
import cn.kevinwang.model.vo.UserVO;
import cn.kevinwang.model.vo.VideoCommentVO;
import cn.kevinwang.service.VideoCommentArr;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wang
 * @create 2024-02-17-13:22
 */
public abstract class VideoCommentAbstractService<T> implements VideoCommentArr<T> {


    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl) {
        return selectVideoCommentByPage(start, size, videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, ipLocation, profileUrl, null);
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation) {
        return selectVideoCommentByPage(start, size, videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, ipLocation, null,null);
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname) {
        return selectVideoCommentByPage(start, size, videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, null,null,null);
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime) {
        return selectVideoCommentByPage(start, size, videoId, commentId, searchContent, commentBeginTime, commentEndTime, null,null,null,null);
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId, String commentId, String searchContent) {
        return selectVideoCommentByPage(start, size, videoId, commentId, searchContent, null,null,null,null,null,null);
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId, String commentId) {
        return selectVideoCommentByPage(start, size, videoId, commentId, null,null,null,null,null,null,null);
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByVideoId(Integer start, Integer size, String videoId) {
        return selectVideoCommentByPage(start, size, videoId, null,null,null,null,null,null,null,null);
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size) {
        return selectVideoCommentByPage(start, size, null,null,null,null,null,null,null,null,null);
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByCommentId(Integer start, Integer size, String commentId) {
        return selectVideoCommentByPage(start, size, null,commentId,null,null,null,null,null,null,null);
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String searchContext) {
        return selectVideoCommentByPage(start, size, null,null,searchContext,null,null,null,null,null,null);
    }

    @Override
    public List<UserVO> selectUserVO(String videoId) {
        return null;
    }

    @Override
    public List<String> selectIpLocation() {
        return null;
    }

    @Override
    public List<UserAnalyizeVO> selectUserAnalyize() {
        List<String> ipLocations = selectIpLocation();
        if(ipLocations == null){
            return null;
        }
        Map<String, Long> ipLocationMap = ipLocations.stream().collect(Collectors.groupingBy(ipLocation -> ipLocation, Collectors.counting()));
        return ipLocationMap.entrySet().stream().map(entry -> new UserAnalyizeVO(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }
}
