package cn.kevinwang.service;

import cn.kevinwang.model.vo.UserVO;
import cn.kevinwang.model.vo.VideoVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
 * @author wang
 * @create 2024-02-13-18:21
 */
public interface VideoArr {
    IPage<VideoVO> list(Page page);

    String getType();

    Long getCount();

    List<String> listTitle(String title);

    List<Long> getCreateTimeList();

    List<UserVO> selectUserVO();

    Page<VideoVO> listByHot(Page page);
}
