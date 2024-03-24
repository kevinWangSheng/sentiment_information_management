package cn.kevinwang.controller;

import cn.kevinwang.common.Result;
import cn.kevinwang.service.UserService;
import cn.kevinwang.service.VideoCommentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang
 * @create 2024-02-16-23:33
 */
@RestController
@RequestMapping("/videoComment")
public class VideoCommentController {

    @Resource
    private VideoCommentService commentService;

    @Resource
    private UserService userService;

    @GetMapping("/list")
    public Result list(String platfrom, @RequestParam(defaultValue = "0",required = false) Integer pageStart, @RequestParam(defaultValue = "10",required = false) Integer pageSize, String videoId, String commentId, String searchContent, String commentBeginTime, String commentEndTime, String nickname, String ipLocation, String profileUrl, String commentTime){
        return Result.success(commentService.selectVideoCommentByPage(platfrom, pageStart, pageSize, videoId, commentId, searchContent, commentBeginTime, commentEndTime, nickname, ipLocation, profileUrl, commentTime));
    }

    @GetMapping("/listCount")
    public Result listCount(String platfrom){
        return Result.success(commentService.listCount(platfrom));
    }

    @GetMapping("/user")
    public Result listUser(String platfrom,String videoId){
        return Result.success(userService.selectUserVO(platfrom,videoId));
    }

    @GetMapping("/commentAnalysis")
    public Result commentAnalysis(@RequestParam(value = "pageStart",required = false,defaultValue = "0") Integer pageStart,@RequestParam(value = "pageSize",required = false,defaultValue = "10") Integer pageSize,String platfrom, String videoId) throws Exception {
        return Result.success(commentService.commentAnalysis(pageStart,pageSize,platfrom, videoId));
    }

    @GetMapping("/getUser")
    public Result getUser(String platfrom){
        return Result.success(commentService.selectUserAnalyize(platfrom));
    }
}
