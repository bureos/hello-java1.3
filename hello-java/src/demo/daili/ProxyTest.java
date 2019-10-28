package demo.daili;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
    	
    	TargetIntf impl = (TargetIntf) Proxy.newProxyInstance(TargetIntf.class.getClassLoader(), 
    			new Class[]{TargetIntf.class}, 
    			new MyHandler(new TargetTest()));
    	System.out.println(impl.say("111"));
	}
}
