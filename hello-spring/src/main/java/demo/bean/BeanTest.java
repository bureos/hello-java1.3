package demo.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ac = 
    			new AnnotationConfigApplicationContext(AppConfig.class);
    	System.out.println(ac.getBean(TestBean.class));
    	ac.close();
    	
	}
}
