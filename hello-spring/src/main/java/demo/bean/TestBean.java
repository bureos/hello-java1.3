package demo.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
	@PostConstruct
    public void init(){
    	System.out.println("bean初始化");
    }
	
	
	@PreDestroy
	public void destroy(){
		System.out.println("bean销毁");
	}
	
}
