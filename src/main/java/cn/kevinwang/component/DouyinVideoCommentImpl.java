package cn.kevinwang.component;

import cn.kevinwang.dao.DouyinAwemeCommentMapper;
import cn.kevinwang.model.dataObject.BilibiliVideoComment;
import cn.kevinwang.model.dataObject.DouyinAwemeComment;
import cn.kevinwang.model.enums.VideoEnum;
import cn.kevinwang.model.mapper.CommentMapper;
import cn.kevinwang.model.mapper.UserMapper;
import cn.kevinwang.model.vo.UserAnalyizeVO;
import cn.kevinwang.model.vo.UserVO;
import cn.kevinwang.model.vo.VideoCommentVO;
import cn.kevinwang.service.abstracts.VideoCommentAbstractService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
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
 * @create 2024-02-17-14:41
 */
@Component
public class DouyinVideoCommentImpl extends VideoCommentAbstractService<DouyinAwemeComment> {
    @Resource
    private DouyinAwemeCommentMapper commentMapper;
    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(Integer start, Integer size, String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl, String commentTime) {
        QueryWrapper<DouyinAwemeComment> wrapper = getQueryWrapper(videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, ipLocation, profileUrl, commentTime);
        Page<DouyinAwemeComment> page = commentMapper.selectPage(new Page<>(start, size), wrapper);
        List<VideoCommentVO> videoCommentVOS = CommentMapper.INSTANCE.douyin2VOs(page.getRecords());
        Page<VideoCommentVO> videoCommentVOPage = new Page<>(page.getCurrent(),page.getSize(), page.getTotal());
        videoCommentVOPage.setRecords(videoCommentVOS);
        return videoCommentVOPage;
    }

    @Override
    public QueryWrapper<DouyinAwemeComment> getQueryWrapper(String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl, String commentTime) {
        QueryWrapper<DouyinAwemeComment> queryWrapper = new QueryWrapper<>();

        queryWrapper.lambda().eq(StringUtils.isNotBlank(videoId),DouyinAwemeComment::getAwemeId,videoId) // 视频id
                .eq(StringUtils.isNotBlank(commentId),DouyinAwemeComment::getCommentId,commentId)  // 评论id
                .likeRight(StringUtils.isNotBlank(searchContent),DouyinAwemeComment::getContent,searchContent) // 内容搜索
                .ge(StringUtils.isNotBlank(commentBeginTime),DouyinAwemeComment::getCreateTime,null != commentBeginTime ? new Date(commentBeginTime).getTime()/1000:null) // 评论开始时间
                .le(StringUtils.isNotBlank(commentEndTime),DouyinAwemeComment::getCreateTime,null != commentEndTime ? new Date(commentEndTime).getTime()/1000 : null) // 评论结束时间
                .likeRight(StringUtils.isNotBlank(nickname),DouyinAwemeComment::getNickname,nickname) // 昵称搜索
                .ge(StringUtils.isNotBlank(commentTime),DouyinAwemeComment::getCreateTime,null != commentTime ? new Date(commentTime).getTime()/1000 : null); // 评论时间
        queryWrapper.lambda().select(DouyinAwemeComment::getAwemeId,DouyinAwemeComment::getCommentId,DouyinAwemeComment::getContent,DouyinAwemeComment::getCreateTime,DouyinAwemeComment::getNickname,DouyinAwemeComment::getSubCommentCount);
        return queryWrapper;
    }

    @Override
    public List<UserVO> selectUserVO(String videoId) {
        if(StringUtils.isBlank(videoId)){
            return new ArrayList<>();
        }
        List<DouyinAwemeComment> douyinCommentList = commentMapper.selectUserInformationByVideoId(videoId);
        return UserMapper.INSTANCE.douyin2VOS(douyinCommentList);
    }

    @Override
    public List<String> selectIpLocation() {
        QueryWrapper<DouyinAwemeComment> wrapper = new QueryWrapper<>();
        wrapper.select("ip_location");
        List<DouyinAwemeComment> commentList = commentMapper.selectList(wrapper);
        return commentList.stream().map(DouyinAwemeComment::getIpLocation).collect(Collectors.toList());
    }

    @Override
    public Long listCount() {
        return commentMapper.selectCount(null);
    }

    @Override
    public String getType() {
        return VideoEnum.douyin.name();
    }

    @Override
    public IPage<VideoCommentVO> selectVideoCommentByVideoId(Page page,String videoId) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq(StringUtils.isNotBlank(videoId),"aweme_id",videoId);
        IPage<DouyinAwemeComment> commentIPage = commentMapper.selectCommentByVideoId(page,wrapper);
        List<VideoCommentVO> videoCommentVOS = CommentMapper.INSTANCE.douyin2VOs(commentIPage.getRecords());
        Page<VideoCommentVO> resultPage = new Page<>(commentIPage.getCurrent(),commentIPage.getSize(),commentIPage.getTotal());
        resultPage.setRecords(videoCommentVOS);
        return resultPage;
    }
}
