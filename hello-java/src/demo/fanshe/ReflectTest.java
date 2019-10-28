package demo.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflectTest {
    public static void main(String[] args) {
    	
    	// 遍历属性
		Field[]fiedls = ComplexType.class.getDeclaredFields();
		for(Field f:fiedls){
			System.out.println("-----------------");
			System.out.println("属性名:"+f.getName());
			System.out.println("属性类型:"+f.getType());
			System.out.println("属性访问类型："+Modifier.toString(f.getModifiers()));
		}
    	// 遍历方法
		Method[]methods = ComplexType.class.getDeclaredMethods();
		for(Method m:methods){
			System.out.println("------------------");
			System.out.println("方法名:"+m.getName());
			System.out.println("方法返回类型："+m.getReturnType());
			System.out.println("方法参数列表：");
			if(m.getParameterCount()>0){
				for(Parameter p:m.getParameters()){
					System.out.println(p.getName()+","+p.getType()+",");
				}
			}
		}
    	// 遍历构造方法
		Constructor<?>[] ctors= ComplexType.class.getConstructors();
    	for(Constructor<?> c:ctors){
    		System.out.println("----------------");
    		System.out.println("构造方法参数列表:");
    		if(c.getParameterCount()>0){
				for(Parameter p:c.getParameters()){
					System.out.println(p.getName()+","+p.getType()+",");
				}
			}
    	}
	}
}
