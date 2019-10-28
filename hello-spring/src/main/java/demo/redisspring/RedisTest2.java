package demo.redisspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 序列化方式不一样 
 * @author Administrator
 *
 */
public class RedisTest2 {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ac = 
    			new AnnotationConfigApplicationContext(RedisConfig.class);
    	RedisTemplate restTemplate = ac.getBean("redisTemplate", RedisTemplate.class);
    	// restTemplate.opsForValue().set("name2", "aaabbb");
    	System.out.println(restTemplate.opsForValue().get("name1"));
    	ac.close();
	}
}
