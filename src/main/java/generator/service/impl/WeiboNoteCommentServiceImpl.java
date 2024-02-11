package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.WeiboNoteComment;
import generator.service.WeiboNoteCommentService;
import generator.mapper.WeiboNoteCommentMapper;
import org.springframework.stereotype.Service;

/**
* @author wang sheng hui
* @description 针对表【weibo_note_comment(微博帖子评论)】的数据库操作Service实现
* @createDate 2024-02-11 18:57:04
*/
@Service
public class WeiboNoteCommentServiceImpl extends ServiceImpl<WeiboNoteCommentMapper, WeiboNoteComment>
    implements WeiboNoteCommentService{

}




