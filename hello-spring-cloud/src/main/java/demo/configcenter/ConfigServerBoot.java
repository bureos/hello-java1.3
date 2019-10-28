package demo.configcenter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerBoot {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerBoot.class).profiles("config-server").run(args);
	}
}
