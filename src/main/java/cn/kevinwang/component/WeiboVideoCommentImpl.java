package cn.kevinwang.component;

import cn.kevinwang.dao.BilibiliVideoCommentMapper;
import cn.kevinwang.dao.WeiboNoteCommentMapper;
import cn.kevinwang.model.dataObject.BilibiliVideoComment;
import cn.kevinwang.model.dataObject.WeiboNoteComment;
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wang
 * @create 2024-02-17-14:42
 */
@Component
public class WeiboVideoCommentImpl extends VideoCommentAbstractService {
    @Resource
    private WeiboNoteCommentMapper commentMapper;
    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl,String commentTime) {
        QueryWrapper<WeiboNoteComment> wrapper = getQueryWrapper(videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, ipLocation, profileUrl, commentTime);
        Page<WeiboNoteComment> page = commentMapper.selectPage(new Page<>(start, size), wrapper);
        List<VideoCommentVO> videoCommentVOS = CommentMapper.INSTANCE.weibo2VOs(page.getRecords());
        Page<VideoCommentVO> videoCommentVOPage = new Page<>(page.getCurrent(),page.getSize(), page.getTotal());
        videoCommentVOPage.setRecords(videoCommentVOS);
        return videoCommentVOPage;

    }

    @Override
    public QueryWrapper<WeiboNoteComment> getQueryWrapper(String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl,String commentTime) {
        QueryWrapper<WeiboNoteComment> queryWrapper = new QueryWrapper<>();

        queryWrapper.lambda().eq(StringUtils.isNotBlank(videoId),WeiboNoteComment::getNoteId,videoId) // 视频id
                .eq(StringUtils.isNotBlank(commentId),WeiboNoteComment::getCommentId,commentId)  // 评论id
                .likeRight(StringUtils.isNotBlank(searchContent),WeiboNoteComment::getContent,searchContent) // 内容搜索
                .ge(StringUtils.isNotBlank(commentBeginTime),WeiboNoteComment::getCreateTime,null != commentBeginTime ? new Date(commentBeginTime).getTime()/1000 : null) // 评论开始时间
                .le(StringUtils.isNotBlank(commentEndTime),WeiboNoteComment::getCreateTime,null != commentEndTime ? new Date(commentEndTime).getTime()/1000 : null) // 评论结束时间
                .likeRight(StringUtils.isNotBlank(nickname),WeiboNoteComment::getNickname,nickname) // 昵称搜索
                .ge(StringUtils.isNotBlank(commentTime),WeiboNoteComment::getCreateTime,null != commentTime ? new Date(commentTime).getTime()/1000 : null); // 评论时间
        queryWrapper.lambda().select(WeiboNoteComment::getNoteId,WeiboNoteComment::getCommentId,WeiboNoteComment::getContent,WeiboNoteComment::getCreateTime,WeiboNoteComment::getNickname,WeiboNoteComment::getSubCommentCount);
        return queryWrapper;
    }

    @Override
    public List<UserVO> selectUserVO(String videoId) {
        if(StringUtils.isBlank(videoId)){
            return new ArrayList<>();
        }
        List<WeiboNoteComment> commentList = commentMapper.selectUserInformationByNoteId(videoId);
        return UserMapper.INSTANCE.weibo2VOS(commentList);
    }

    @Override
    public List<String> selectIpLocation() {
        QueryWrapper<WeiboNoteComment> wrapper = new QueryWrapper<>();
        wrapper.select("ip_location");
        return commentMapper.selectList(wrapper).stream().map(WeiboNoteComment::getIpLocation).collect(Collectors.toList());
    }

    @Override
    public Long listCount() {
        return commentMapper.selectCount(null);
    }

    @Override
    public String getType() {
        return VideoEnum.weibo.name();
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByVideoId(Page page,String videoId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(StringUtils.isNotBlank(videoId),"note_id",videoId);
        IPage<WeiboNoteComment> commentPage = commentMapper.selectCommentByVideoId(page,wrapper);
        List<VideoCommentVO> videoCommentVOS = CommentMapper.INSTANCE.weibo2VOs(commentPage.getRecords());
        Page<VideoCommentVO> pageResult = new Page<>(commentPage.getCurrent(),commentPage.getSize(),commentPage.getTotal());
        pageResult.setRecords(videoCommentVOS);
        return pageResult;
    }
}
