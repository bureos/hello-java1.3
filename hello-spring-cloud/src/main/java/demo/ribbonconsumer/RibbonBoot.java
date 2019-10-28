package demo.ribbonconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@EnableCircuitBreaker
//@EnableDiscoveryClient 允许别人发现你
@SpringBootApplication
public class RibbonBoot {
	
	@Bean
	@LoadBalanced
    RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(RibbonBoot.class).profiles("ribbon").run(args);
	}
	
}
