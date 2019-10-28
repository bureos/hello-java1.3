package demo.accountfeignconsumer;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import demo.api.User;

public interface HelloService {

	String hello(@RequestParam("name") String name);
	
	User hello(@RequestParam("name") String name,@RequestParam("age") Integer age);
	
	String hello(@RequestBody User	user);
}
