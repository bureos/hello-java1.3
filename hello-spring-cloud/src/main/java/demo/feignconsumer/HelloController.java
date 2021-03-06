package demo.feignconsumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/hello999", method=RequestMethod.GET)
	public String consumer(@RequestParam("name") String name){
		return "hello "+name;
	}
	
}
