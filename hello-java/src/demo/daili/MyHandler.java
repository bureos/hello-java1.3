package demo.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler{
	private TargetIntf target;
	public MyHandler(TargetIntf impl){
		target = impl;
	}
    
	@Override
	public Object invoke(Object proxy, Method arg1, Object[] arg2) throws Throwable {
        System.out.println("方法名:"+arg1.getName());
		if(arg2!=null){
			System.out.println("方法参数");
			for(Object a:arg2){
				System.out.println(a);
			}
		}
		System.out.println(proxy.getClass());
		Object result = arg1.invoke(target, arg2);
		return result;
	}

}
