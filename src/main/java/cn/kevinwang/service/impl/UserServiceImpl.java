package cn.kevinwang.service.impl;

import cn.kevinwang.component.factory.VideoCommentFactory;
import cn.kevinwang.component.factory.VideoFactory;
import cn.kevinwang.model.enums.VideoEnum;
import cn.kevinwang.model.vo.UserVO;
import cn.kevinwang.service.UserService;
import cn.kevinwang.service.VideoCommentService;
import cn.kevinwang.service.VideoService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wang
 * @create 2024-02-17-22:57
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private VideoCommentFactory commentFactory;
    @Override
    public List<UserVO> selectUserVO(String platfrom,String videoId) {
        return commentFactory.getVideoCommentService(platfrom).selectUserVO(videoId);
    }
}
