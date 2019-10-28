package demo.feignconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignConsumerBoot {
	public static void main(String[] args) {
		// SpringApplication.run(FeignConsumerBoot.class, args);
		new SpringApplicationBuilder(FeignConsumerBoot.class).profiles("feign-consumer").run(args);
	}
}
