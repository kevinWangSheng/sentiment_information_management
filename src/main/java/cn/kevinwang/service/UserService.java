package cn.kevinwang.service;

import cn.kevinwang.model.vo.UserVO;

import java.util.List;

/**
 * @author wang
 * @create 2024-02-17-22:57
 */
public interface UserService {
    List<UserVO> selectUserVO(String platfrom,String videoId);
}
