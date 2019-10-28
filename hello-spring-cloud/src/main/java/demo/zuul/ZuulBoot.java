package demo.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
// @SpringCloudApplication  // 默认开启熔断
@SpringBootApplication
public class ZuulBoot {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulBoot.class).profiles("zuul").run(args);
	}
	
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
}
