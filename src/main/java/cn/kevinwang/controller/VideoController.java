package cn.kevinwang.controller;

import cn.kevinwang.common.Result;
import cn.kevinwang.service.BilibiliVideoCommentService;
import cn.kevinwang.service.BilibiliVideoService;
import cn.kevinwang.service.VideoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Stack;

/**
 * @author wang
 * @create 2024-02-13-18:15
 */
@RequestMapping("/video")
@RestController
public class VideoController {
    @Resource
    private VideoService videoService;

    @GetMapping("/list")
    public Result list(Integer pageStart, Integer pageSize, String platfrom){
        return Result.success(videoService.getVideoListByPage(pageStart, pageSize, platfrom));
    }

    @GetMapping("/listAllCount")
    public Result listAllCount(String platfrom){
        return Result.success(videoService.getAllCount(platfrom));
    }

    @GetMapping("/analyizeTitle")
    public Result analyizeTitle(String platfrom) throws Exception {
        return Result.success(videoService.analyizeTitle(platfrom));
    }

    @GetMapping("/getTimeStatistics")
    public Result getTimeStatistics(String platfrom){
        return Result.success(videoService.statisticsCreateTime(platfrom));
    }

    @GetMapping("/users")
    public Result listUser(String platfrom){
        return Result.success(videoService.selectUserVO(platfrom));
    }

    @GetMapping("/getHotVideo")
    public Result getHotVideo(@RequestParam("platfrom") String platfrom, @RequestParam(value = "pageStart",defaultValue = "1",required = false)int pageStart, @RequestParam(value = "pageSize",defaultValue = "10",required = false) int pageSize){
        return Result.success(videoService.getHotVideo(platfrom,pageStart,pageSize));
    }

}
