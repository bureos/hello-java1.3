package demo.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
        System.out.println("arg0:"+arg0.getClass());
		System.out.println("方法名:"+arg1.getName());
		System.out.println("arg3 name:"+arg3.getSuperName());
		System.out.println("arg3 index:"+arg3.getSuperIndex());
		
		Object result = arg3.invokeSuper(arg0, arg2);
		return result;
	}
    
}
