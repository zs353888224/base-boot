package cn.wscq.name.config.system;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author shuai
 * @version 1.0
 * @description
 * @date 2017/12/8 14:40
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
