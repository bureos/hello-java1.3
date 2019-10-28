package demo.accountfeignconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/***
 * created by zhangyuxi on 2019年6月4日
 * 接口和feign不一致的情况,因为Feign的接口也实现了Base接口,所以仍能获取到.
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignConsumerBoot {
	public static void main(String[] args) {
		// SpringApplication.run(FeignConsumerBoot.class, args);
		new SpringApplicationBuilder(FeignConsumerBoot.class).profiles("feign-consumer").run(args);
	}
}
