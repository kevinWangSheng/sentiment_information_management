package cn.kevinwang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wang
 * @create 2024-02-18-20:53
 */
@Configuration
public class RedisConfig {

    @Value("${spring.data.redis.cluster.nodes}")
    private String clusterNode;
    @Value("${spring.data.redis.password}")
    private String password;
    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){
        RedisClusterConfiguration clusterConfiguration = new RedisClusterConfiguration();
        Set<RedisNode> nodes = new HashSet<>();
        for(String str:clusterNode.split(",")){
            int index = str.indexOf(':');
            nodes.add(new RedisNode(str.substring(0,index),Integer.parseInt(str.substring(index+1))));
        }
        clusterConfiguration.setClusterNodes(nodes);
        clusterConfiguration.setPassword(password);

        JedisConnectionFactory factory = new JedisConnectionFactory(clusterConfiguration);
        factory.setDatabase(0);
        factory.setUsePool(true);
        return factory;
    }

    @Bean
    public RedisTemplate<String,Object> redisTemplate(){
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //这个地方有一个问题，这种序列化器会将value序列化成对象存储进redis中，如果
        //你想取出value，然后进行自增的话，这种序列化器是不可以的，因为对象不能自增；
        //需要改成StringRedisSerializer序列化器。
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        redisTemplate.setEnableTransactionSupport(false);
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }


}
