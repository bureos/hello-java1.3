package demo.redisspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisTest {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ac = 
    			new AnnotationConfigApplicationContext(RedisConfig.class);
    	StringRedisTemplate restTemplate = ac.getBean(StringRedisTemplate.class);
    	System.out.println(restTemplate.opsForValue().get("name2"));
    	ac.close();
	}
}
