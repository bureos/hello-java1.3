package demo.configcenter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerLocalBoot {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerLocalBoot.class)
		   .profiles("config-server-local").run(args);
	}
}
