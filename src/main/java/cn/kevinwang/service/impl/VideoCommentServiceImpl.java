package cn.kevinwang.service.impl;

import cn.hutool.json.JSONUtil;
import cn.kevinwang.common.Constance;
import cn.kevinwang.component.factory.VideoCommentFactory;
import cn.kevinwang.model.enums.VideoEnum;
import cn.kevinwang.model.vo.UserAnalyizeVO;
import cn.kevinwang.model.vo.VideoCommentVO;
import cn.kevinwang.service.VideoCommentService;
import cn.kevinwang.util.HttpUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wang
 * @create 2024-02-17-20:44
 */
@Service
public class VideoCommentServiceImpl implements VideoCommentService {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private VideoCommentFactory commentFactory;
    @Override
    public IPage<VideoCommentVO> selectVideoCommentByPage(String platfrom, Integer start, Integer size, String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl, String commentTime) {
        IPage<VideoCommentVO> resultPage = null;
        if(StringUtils.isBlank(platfrom)){
            for(VideoEnum videoEnum:VideoEnum.values()){
                if(null == resultPage){
                    resultPage = commentFactory.getVideoCommentService(videoEnum.name()).selectVideoCommentByPage(start, size, videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, ipLocation, profileUrl, commentTime);
                }else{
                    resultPage.getRecords().addAll(commentFactory.getVideoCommentService(videoEnum.name()).selectVideoCommentByPage(start, size, videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, ipLocation, profileUrl, commentTime).getRecords());
                }
            }
        }else{
            return commentFactory.getVideoCommentService(platfrom).selectVideoCommentByPage(start, size, videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, ipLocation, profileUrl, commentTime);
        }
        return resultPage;
    }

    @Override
    public IPage<VideoCommentVO> commentAnalysis(Integer pageStart,Integer pageSize,String platfrom, String videoId) throws Exception {
        IPage<VideoCommentVO> ipage = commentFactory.getVideoCommentService(VideoEnum.get(platfrom).name()).selectVideoCommentByVideoId(new Page(pageStart,pageSize),videoId);
        // 对评论信息进行检测
        for(VideoCommentVO videoCommentVO:ipage.getRecords()){
            String param = "text=" + URLEncoder.encode(videoCommentVO.getCommentContent(), "utf-8");
            String accessToken = (String) redisTemplate.opsForValue().get(Constance.CommentAnalyize.Access_Token_Key);
            if(StringUtils.isBlank(accessToken)){
                accessToken = HttpUtil.getAccessToken();
                redisTemplate.opsForValue().set(Constance.CommentAnalyize.Access_Token_Key, accessToken);
            }
            String result = HttpUtil.post(Constance.CommentAnalyize.BAIDU_URL, accessToken, param);
            Integer conclusionType = (Integer) JSONUtil.parseObj(result).get("conclusionType");
            if(null!= conclusionType && conclusionType != 1){
                Object data = JSONUtil.parseObj(result).get("data");
                if(data == null){
                    continue;
                }
                Object firstUnPassword = JSONUtil.parseArray(data).get(0);
                String msg = (String) JSONUtil.parseObj(firstUnPassword).get("msg");
                videoCommentVO.setMsg(msg);
                videoCommentVO.setMsgType(2); // 表示不合规
            }
        }
        return ipage;
    }

    @Override
    public Long listCount(String platfrom) {
        if(StringUtils.isBlank(platfrom)){
            return 0L;
        }
        return commentFactory.getVideoCommentService(platfrom).listCount();
    }

    @Override
    public List<UserAnalyizeVO> selectUserAnalyize(String platfrom) {
        if(StringUtils.isBlank(platfrom)){
            return new ArrayList<>();
        }
        return commentFactory.getVideoCommentService(platfrom).selectUserAnalyize();
    }


}
