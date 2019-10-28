package demo.providercallself;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	//the provider call itself
	//this situation, the provider import the HelloService without the @FeignClient Annotation
	//and append the @FeignClient to HelloService becomes HelloServiceFeign interface.
	//so if the client and provider is seperate, the @FeignClient anno can put on HelloService interface.
	@Autowired
	HelloServiceFeign service;
	
	@RequestMapping(value="/feign-consumer4", method=RequestMethod.GET)
	public String helloConsumer1(@RequestParam("name")String name){
		return service.hello(name);
	}
	
}
