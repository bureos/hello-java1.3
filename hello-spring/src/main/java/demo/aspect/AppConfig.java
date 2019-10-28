package demo.aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages="demo.aspect")
@Import({PreGreetingAspect.class})
@EnableAspectJAutoProxy // 必须添加
public class AppConfig {
   
}
