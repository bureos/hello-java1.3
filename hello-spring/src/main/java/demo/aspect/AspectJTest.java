package demo.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectJTest {
    public static void main(String[] args) {
		
      	AnnotationConfigApplicationContext ac = 
    			new AnnotationConfigApplicationContext(AppConfig.class);
    	TestBean bean =  ac.getBean(TestBean.class);
    	System.out.println("------------");
    	bean.aa1();
    	System.out.println("------------");
    	bean.aa2();
    	System.out.println("------------");
    	bean.bb1();
    	System.out.println("------------");
    	bean.bb2();
    	System.out.println("------------");
    	
    	ac.close();
    	
    	
    	
	}
}
