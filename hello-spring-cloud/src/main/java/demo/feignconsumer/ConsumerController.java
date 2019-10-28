package demo.feignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.api.User;

@RestController
public class ConsumerController {
	@Autowired
	HelloService service;
	@Autowired
	HelloService2 service2;
	
	@RequestMapping(value="/consumer", method=RequestMethod.GET)
	public String consumer(@RequestParam("name") String name){
		return "hello "+name;
	}
	
	@RequestMapping(value="/feign-consumer1", method=RequestMethod.GET)
	public String helloConsumer(@RequestParam("name") String name){
		String result=null;
//		try{
			result=service.hello(name);
//		}catch(Exception e){
//			e.printStackTrace();
//			System.out.println(e.getClass());
//			System.out.println(e.getCause().getClass());
//		}
		
		return result;
	}
	@RequestMapping(value="/feign-consumer2", method=RequestMethod.GET)
	public User helloConsumer2(@RequestParam("name") String name, @RequestParam("age") Integer age){
		return service.hello(name, age);
	}
	@RequestMapping(value="/feign-consumer3", method=RequestMethod.POST)
	public String helloConsumer3(@RequestBody User user){
		return service.hello(user);
	}
	
	@RequestMapping(value="/feign-consumer4")
	public String helloConsumer4(){
		User user = new User();
		user.setAge(99);
		user.setName("testMap");
		return service2.hello(user);
	}
	
}
