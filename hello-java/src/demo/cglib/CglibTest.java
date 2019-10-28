package demo.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibTest {
    public static void main(String[] args) {
    	  Enhancer enhancer = new Enhancer();
    	  enhancer.setSuperclass(TargetTest.class);
	  	  enhancer.setCallback(new MyInterceptor());
	  	  TargetTest result= (TargetTest)enhancer.create();
	  	  result.say();
	}
}
