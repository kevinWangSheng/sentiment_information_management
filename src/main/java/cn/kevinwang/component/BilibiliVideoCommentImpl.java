package cn.kevinwang.component;

import cn.kevinwang.dao.BilibiliVideoCommentMapper;
import cn.kevinwang.model.dataObject.BilibiliVideoComment;
import cn.kevinwang.model.enums.VideoEnum;
import cn.kevinwang.model.mapper.CommentMapper;
import cn.kevinwang.model.mapper.UserMapper;
import cn.kevinwang.model.vo.UserAnalyizeVO;
import cn.kevinwang.model.vo.UserVO;
import cn.kevinwang.model.vo.VideoCommentVO;
import cn.kevinwang.service.abstracts.VideoCommentAbstractService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wang
 * @create 2024-02-17-14:40
 */
@Component
public class BilibiliVideoCommentImpl extends VideoCommentAbstractService<BilibiliVideoComment> {
    @Resource
    private BilibiliVideoCommentMapper commentMapper;
    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl,String commentTime) {
        QueryWrapper<BilibiliVideoComment> wrapper = getQueryWrapper(videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, ipLocation, profileUrl, commentTime);
        Page<BilibiliVideoComment> page = commentMapper.selectPage(new Page<>(start, size), wrapper);
        List<VideoCommentVO> videoCommentVOS = CommentMapper.INSTANCE.bilibili2VOs(page.getRecords());
        Page<VideoCommentVO> videoCommentVOPage = new Page<>(page.getCurrent(),page.getSize(), page.getTotal());
        videoCommentVOPage.setRecords(videoCommentVOS);
        return videoCommentVOPage;

    }

    @Override
    public QueryWrapper<BilibiliVideoComment> getQueryWrapper(String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl,String commentTime) {
        QueryWrapper<BilibiliVideoComment> queryWrapper = new QueryWrapper<>();

        queryWrapper.lambda().eq(StringUtils.isNotBlank(videoId),BilibiliVideoComment::getVideoId,videoId) // 视频id
                .eq(StringUtils.isNotBlank(commentId),BilibiliVideoComment::getCommentId,commentId)  // 评论id
                .likeRight(StringUtils.isNotBlank(searchContent),BilibiliVideoComment::getContent,searchContent) // 内容搜索
                .ge(StringUtils.isNotBlank(commentBeginTime),BilibiliVideoComment::getCreateTime,commentBeginTime != null ? new Date(commentBeginTime).getTime()/1000 :null) // 评论开始时间
                .le(StringUtils.isNotBlank(commentEndTime),BilibiliVideoComment::getCreateTime,null != commentEndTime ? new Date(commentEndTime).getTime()/1000 : null) // 评论结束时间
                .likeRight(StringUtils.isNotBlank(nickname),BilibiliVideoComment::getNickname,nickname) // 昵称搜索
                .ge(StringUtils.isNotBlank(commentTime),BilibiliVideoComment::getCreateTime,null != commentTime ? new Date(commentTime).getTime()/1000:null); // 评论时间
        queryWrapper.lambda().select(BilibiliVideoComment::getVideoId,BilibiliVideoComment::getCommentId,BilibiliVideoComment::getContent,BilibiliVideoComment::getCreateTime,BilibiliVideoComment::getNickname,BilibiliVideoComment::getSubCommentCount);
        return queryWrapper;
    }

    @Override
    public List<UserVO> selectUserVO(String videoId) {
        if(StringUtils.isBlank(videoId)){
            return new ArrayList<>();
        }
        List<BilibiliVideoComment> bilibiliComments = commentMapper.selectUserInformationByVideoId(videoId);
        return UserMapper.INSTANCE.bilibili2VOS(bilibiliComments);
    }


    @Override
    public Long listCount() {
        return commentMapper.selectCount(null);
    }

    @Override
    public String getType() {
        return VideoEnum.bilibili.name();
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByVideoId(Page page, String videoId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(StringUtils.isNotBlank(videoId),"video_id",videoId);
        IPage<BilibiliVideoComment> commentPage = commentMapper.selectCommentByVideoId(page,wrapper);
        List<VideoCommentVO> videoCommentVOS = CommentMapper.INSTANCE.bilibili2VOs(commentPage.getRecords());
        Page<VideoCommentVO> resultPage = new Page<>(commentPage.getCurrent(),commentPage.getSize(),commentPage.getTotal());
        resultPage.setRecords(videoCommentVOS);
        return resultPage;
    }
}
