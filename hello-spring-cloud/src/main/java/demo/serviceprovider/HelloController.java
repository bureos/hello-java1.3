package demo.serviceprovider;

import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.api.User;
import demo.exception.MyException;
import demo.feignconsumer.HelloService;

@RestController
public class HelloController implements HelloService{
	private final Logger logger = LoggerFactory.getLogger(HelloController.class);

	//@RequestMapping("/hello1") // 可以不加,在HelloService里加就可以.
	public String hello(String name) {
//		if(true){
//			throw new MyException("S001", "错误");
//		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hello!"+name;
	}

	//@RequestMapping("/hello2")
	public User hello(@RequestParam("name") String name,@RequestParam("age")  Integer age) {
		return new User(name,age);
	}

	//@RequestMapping("/hello3")
	public String hello(@RequestBody User user) {
		return "hello "+user.getName()+","+user.getAge();
	}
	
	
	// 为熔断测试用
	@RequestMapping("/hello")
	public String hello123(){
		
		int sleepTime=new Random().nextInt(3000);
		/*logger.info("sleep time -> {}", sleepTime);
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		return "hello world!";
	}
	
	@RequestMapping("/hello-entity")
	public String helloEntity(@RequestBody Map<String,Object> mapIn){
		System.out.println(mapIn);
		return "read user ok";
	}
}


