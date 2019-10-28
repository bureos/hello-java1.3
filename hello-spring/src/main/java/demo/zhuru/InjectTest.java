package demo.zhuru;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectTest {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ac = 
    			new AnnotationConfigApplicationContext(AppConfig.class);
    	ac.getBean(SecondBean.class).test();
    	
    	ac.close();
    	
	}
}
