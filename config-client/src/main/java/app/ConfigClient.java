package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ConfigClient {
	public static void main(String[] args) {
	    
		new SpringApplicationBuilder(ConfigClient.class).web(true).run(args);
	}
}
