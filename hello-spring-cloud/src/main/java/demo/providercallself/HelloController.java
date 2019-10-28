package demo.providercallself;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.api.User;
import demo.feignconsumer.HelloService;

@RestController
public class HelloController implements HelloService{
	private final Logger logger = Logger.getLogger(getClass());

	@RequestMapping("/hello1")
	public String hello(@RequestParam("name") String name) {
		
		return "hello!"+name;
	}

	@RequestMapping("/hello2")
	public User hello(@RequestParam("name") String name,@RequestParam("age")  Integer age) {
		return new User(name,age);
	}

	@RequestMapping("/hello3")
	public String hello(@RequestBody User user) {
		return "hello "+user.getName()+","+user.getAge();
	}
}
