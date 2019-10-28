package demo.jiandan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConsumer {
	public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = 
        		new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
		ac.start();
		HelloService helloService = ac.getBean(HelloService.class);
		System.err.println(helloService.hello("world"));
		ac.stop();
		ac.close();
	}
}