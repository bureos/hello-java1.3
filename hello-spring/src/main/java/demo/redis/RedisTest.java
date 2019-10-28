package demo.redis;

import redis.clients.jedis.Jedis;

public class RedisTest {
    public static void main(String[] args) {
    	String redisHost = "localhost";
	    int redisPort = 6379;
		Jedis jedis = new Jedis(redisHost, redisPort);
//		jedis.auth("czmbnk$2018");
		jedis.set("name2", "222");
		System.out.println(jedis.get("name1"));
		jedis.close();
    	
	}
}
