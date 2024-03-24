package cn.kevinwang.model.mapper;

import cn.kevinwang.model.dataObject.*;
import cn.kevinwang.model.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author wang
 * @create 2024-02-17-22:46
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


    @Mapping(target = "platform", constant = "b站")
    UserVO bilibili2VO(BilibiliVideoComment comment);

    @Mapping(target = "platform", constant = "b站")
    List<UserVO> bilibili2VOS(List<BilibiliVideoComment> commentList);


    @Mapping(target = "platform", constant = "抖音")
    UserVO douyin2VO(DouyinAwemeComment comment);

    @Mapping(target = "platform", constant = "抖音")
    List<UserVO> douyin2VOS(List<DouyinAwemeComment> commentList );

    @Mapping(target = "platform", constant = "快手")
    UserVO kuaishou2VO(KuaishouVideoComment comment);

    @Mapping(target = "platform", constant = "快手")
    List<UserVO> kuaishou2VOS(List<KuaishouVideoComment> commentList );

    @Mapping(target = "platform", constant = "微博")
    UserVO weibo2VO(WeiboNoteComment comment);
    @Mapping(target = "platform", constant = "微博")
    List<UserVO> weibo2VOS(List<WeiboNoteComment> commentList );

    @Mapping(target = "platform", constant = "小红书")
    UserVO xhs2VO(XhsNoteComment comment);
    @Mapping(target = "platform", constant = "小红书")
    List<UserVO> xhs2VOS(List<XhsNoteComment> commentList );

    @Mapping(target = "platform", constant = "b站")
    UserVO bilibiliVideo2VO(BilibiliVideo video);
    @Mapping(target = "platform", constant = "b站")
    List<UserVO> bilibiliVideo2VOS(List<BilibiliVideo> commentList );

    @Mapping(target = "platform", constant = "快手")
    UserVO kuaishouVideo2VO(KuaishouVideo video);
    @Mapping(target = "platform", constant = "快手")
    List<UserVO> kuaishouVideo2VOS(List<KuaishouVideo> commentList );

    @Mapping(target = "platform", constant = "抖音")
    UserVO douyinVideo2VO(DouyinAweme video);
    @Mapping(target = "platform", constant = "抖音")
    List<UserVO> douyinVideo2VOS(List<DouyinAweme> commentList );

    @Mapping(target = "platform", constant = "微博")
    UserVO weiboNote2VO(WeiboNote vidoe);
    @Mapping(target = "platform", constant = "微博")
    List<UserVO> weiboNote2VOS(List<WeiboNote> commentList );

    @Mapping(target = "platform", constant = "小红书")
    UserVO xhsNote2VO(XhsNote video);

    @Mapping(target = "platform", constant = "小红书")
    List<UserVO> xhsNote2VOS(List<XhsNote> commentList );
}
