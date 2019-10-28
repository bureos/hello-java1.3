package demo.serviceprovider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProviderBoot {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceProviderBoot.class).profiles("service-provider").run(args);
	}
}
