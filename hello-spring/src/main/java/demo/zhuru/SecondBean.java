package demo.zhuru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondBean {
   @Autowired
   FirstBean firstBean;
	
   public void test(){
	   System.out.println(firstBean);
   }
}