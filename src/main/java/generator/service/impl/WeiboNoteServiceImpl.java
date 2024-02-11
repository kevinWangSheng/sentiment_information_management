package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.WeiboNote;
import generator.service.WeiboNoteService;
import generator.mapper.WeiboNoteMapper;
import org.springframework.stereotype.Service;

/**
* @author wang sheng hui
* @description 针对表【weibo_note(微博帖子)】的数据库操作Service实现
* @createDate 2024-02-11 18:57:04
*/
@Service
public class WeiboNoteServiceImpl extends ServiceImpl<WeiboNoteMapper, WeiboNote>
    implements WeiboNoteService{

}




