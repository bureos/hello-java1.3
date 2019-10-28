package demo.jiandan;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProvider {
	public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = 
        		new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
		ac.start();
		System.out.println("dubbo provider started");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("dubbo provider exit");
		ac.close();
	}
}
