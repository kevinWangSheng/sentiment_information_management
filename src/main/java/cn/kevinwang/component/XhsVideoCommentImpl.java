package cn.kevinwang.component;

import cn.kevinwang.dao.XhsNoteCommentMapper;
import cn.kevinwang.model.dataObject.XhsNoteComment;
import cn.kevinwang.model.enums.VideoEnum;
import cn.kevinwang.model.mapper.CommentMapper;
import cn.kevinwang.model.mapper.UserMapper;
import cn.kevinwang.model.vo.UserVO;
import cn.kevinwang.model.vo.VideoCommentVO;
import cn.kevinwang.service.abstracts.VideoCommentAbstractService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wang
 * @create 2024-02-17-14:43
 */
@Component
public class XhsVideoCommentImpl extends VideoCommentAbstractService {
    @Resource
    private XhsNoteCommentMapper commentMapper;
    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl, String commentTime) {
        QueryWrapper<XhsNoteComment> wrapper = getQueryWrapper(videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, ipLocation, profileUrl, commentTime);
        Page<XhsNoteComment> page = commentMapper.selectPage(new Page<>(start, size), wrapper);
        List<VideoCommentVO> videoCommentVOS = CommentMapper.INSTANCE.xhs2VOs(page.getRecords());
        Page<VideoCommentVO> videoCommentVOPage = new Page<>(page.getCurrent(),page.getSize(), page.getTotal());
        videoCommentVOPage.setRecords(videoCommentVOS);
        return videoCommentVOPage;

    }

    @Override
    public QueryWrapper<XhsNoteComment> getQueryWrapper(String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl, String commentTime) {
        QueryWrapper<XhsNoteComment> queryWrapper = new QueryWrapper<>();

        queryWrapper.lambda().eq(StringUtils.isNotBlank(videoId),XhsNoteComment::getNoteId,videoId) // 视频id
                .eq(StringUtils.isNotBlank(commentId),XhsNoteComment::getCommentId,commentId)  // 评论id
                .likeRight(StringUtils.isNotBlank(searchContent),XhsNoteComment::getContent,searchContent) // 内容搜索
                .ge(StringUtils.isNotBlank(commentBeginTime),XhsNoteComment::getCreateTime,null != commentBeginTime ? new Date(commentBeginTime).getTime() : null) // 评论开始时间
                .le(StringUtils.isNotBlank(commentEndTime),XhsNoteComment::getCreateTime,null != commentEndTime ? new Date(commentEndTime).getTime() : null) // 评论结束时间
                .likeRight(StringUtils.isNotBlank(nickname),XhsNoteComment::getNickname,nickname) // 昵称搜索
                .ge(StringUtils.isNotBlank(commentTime),XhsNoteComment::getCreateTime,null != commentTime ? new Date(commentTime).getTime() : null); // 评论时间
        queryWrapper.lambda().select(XhsNoteComment::getNoteId,XhsNoteComment::getCommentId,XhsNoteComment::getContent,XhsNoteComment::getCreateTime,XhsNoteComment::getNickname,XhsNoteComment::getSubCommentCount);
        return queryWrapper;
    }

    @Override
    public List<UserVO> selectUserVO(String videoId) {
        if(StringUtils.isBlank(videoId)){
            return null;
        }
        return UserMapper.INSTANCE.xhs2VOS(commentMapper.selectUserInformationByNoteId(videoId));
    }

    @Override
    public List<String> selectIpLocation() {
        QueryWrapper<XhsNoteComment> wrapper = new QueryWrapper<>();
        wrapper.select("ip_location");
        return commentMapper.selectList(wrapper).stream().map(XhsNoteComment::getIpLocation).collect(Collectors.toList());
    }

    @Override
    public Long listCount() {
        return commentMapper.selectCount(null);
    }

    @Override
    public String getType() {
        return VideoEnum.xhs.name();
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByVideoId(Page page,String videoId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(StringUtils.isNotBlank(videoId),"note_id",videoId);
        IPage<XhsNoteComment> commentPage = commentMapper.selectCommentByVideoId(page,wrapper);
        List<VideoCommentVO> videoCommentVOS = CommentMapper.INSTANCE.xhs2VOs(commentPage.getRecords());
        Page<VideoCommentVO> resultPage = new Page<>(commentPage.getCurrent(),commentPage.getSize(),commentPage.getTotal());
        resultPage.setRecords(videoCommentVOS);
        return resultPage;
    }
}
