package demo.tools;

import java.lang.reflect.Field;
import java.util.Stack;

public class DtoDebug {
	public static void debug(Object o){
		if(o==null){
			return ;
		}
		System.out.println("Debug "+o.getClass().getSimpleName()+":");
		Stack<Class<?>> stack = new Stack<>();
		Class<?>clazz = o.getClass();
		while(clazz!=Object.class){
			stack.push(clazz);
			clazz = clazz.getSuperclass();
		}
		while(!stack.isEmpty()){
			Class<?>temp = stack.pop();
			Field[]fields=temp.getDeclaredFields();
			for(Field f:fields){
				f.setAccessible(true);
				if(f.getName().equals("serialVersionUID")){
					continue;
				}
				try {
					System.out.println(f.getName()+"->"+f.get(o));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			temp = temp.getSuperclass();
		}
	}
	
	public static void main(String[] args) {
	}
}
