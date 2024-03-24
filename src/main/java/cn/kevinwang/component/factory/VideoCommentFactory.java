package cn.kevinwang.component.factory;

import cn.kevinwang.service.VideoCommentArr;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wang
 * @create 2024-02-17-20:44
 */
@Component
public class VideoCommentFactory implements InitializingBean, ApplicationContextAware {
    private static final Map<String, VideoCommentArr> VIDEO_COMMENT_SERVICE_MAP = new HashMap<>();

    private ApplicationContext applicationContext;
    @Override
    public void afterPropertiesSet() throws Exception {
        applicationContext.getBeansOfType(VideoCommentArr.class).values().forEach(videoCommentService -> {
            VIDEO_COMMENT_SERVICE_MAP.put(videoCommentService.getType(),videoCommentService);
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public VideoCommentArr getVideoCommentService(String type){
        return VIDEO_COMMENT_SERVICE_MAP.get(type);
    }
}
