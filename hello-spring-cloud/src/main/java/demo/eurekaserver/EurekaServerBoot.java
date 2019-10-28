package demo.eurekaserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  //服务注册中心
@SpringBootApplication
public class EurekaServerBoot {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerBoot.class).profiles("eureka-server").web(true).run(args);
		
	}
}
