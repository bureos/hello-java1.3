package demo.feignconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import demo.api.User;

/**
 * created by zhangyuxi on 2019年7月13日
 * 为了测试是否传实体可以用map接收
 */
@FeignClient("provider-one")
public interface HelloService2 {
	
	@RequestMapping(value="/hello-entity", method=RequestMethod.POST)
	String hello(@RequestBody User	user);
}
