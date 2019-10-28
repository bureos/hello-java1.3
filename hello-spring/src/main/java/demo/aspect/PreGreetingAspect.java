package demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PreGreetingAspect {
	
	@Before("execution(* *.aa*(..))")
	public void before(){
		System.out.println("how are you?");
	}
}

