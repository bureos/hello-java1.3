package demo.redisspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import redis.clients.jedis.JedisShardInfo;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory redisConnectionFactory() {
		JedisShardInfo config = new JedisShardInfo("localhost", 6379);
		return new JedisConnectionFactory(config);
	}
	
	@Bean
	public StringRedisTemplate stringRedisTemplate(){
		StringRedisTemplate redisTemplate = new StringRedisTemplate();
		redisTemplate.setConnectionFactory(redisConnectionFactory());
		return redisTemplate;
	}
	
	@Bean
	public RedisTemplate redisTemplate(){
		RedisTemplate redisTemplate = new RedisTemplate();
		redisTemplate.setConnectionFactory(redisConnectionFactory());
		return redisTemplate;
	}
}