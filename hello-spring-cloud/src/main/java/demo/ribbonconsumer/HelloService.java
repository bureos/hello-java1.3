package demo.ribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
   @Autowired
   RestTemplate restTemplate;
   
   public String helloService(){
	   return restTemplate.getForEntity("http://provider-one/hello", 
			   String.class).getBody();
   }
	
   public String helloFallback(){
	   return "error";
   }
	
}
