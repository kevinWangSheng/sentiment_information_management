package cn.kevinwang.component.factory;

import cn.kevinwang.model.enums.VideoEnum;
import cn.kevinwang.service.VideoArr;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wang
 * @create 2024-02-14-11:48
 */
@Component
public class VideoFactory implements InitializingBean, ApplicationContextAware {

    private static final Map<String, VideoArr> VIDEO_SERVICE_MAP = new ConcurrentHashMap<>();
    ApplicationContext applicationContext;

    public VideoArr getVideoService(VideoEnum videoEnum){
        return VIDEO_SERVICE_MAP.get(videoEnum.name());
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        applicationContext.getBeansOfType(VideoArr.class).values().forEach(videoService -> {
            VIDEO_SERVICE_MAP.put(videoService.getType(),videoService);
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
