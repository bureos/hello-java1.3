package mzyx.resttemplate;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestRule {
    
	@Test
	public void test1(){
        String url = "http://10.1.40.158:8080/RuleISSUE/rule/executeRule/service";
		RestTemplate rest = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		//设置请求格式
        headers.setContentType(MediaType.parseMediaType("application/json; charset=UTF-8"));
        //设置响应格式
        headers.add(HttpHeaders.ACCEPT, MediaType.ALL_VALUE);
        Map<String,String> map = new HashMap<>();
        map.put("req", "{}");//"{\"req\":{}}"
        HttpEntity<Object> formEntity = new HttpEntity<>("{\"req\":{}}", headers);
        
        Object res = rest.postForObject(url, formEntity, Object.class);
		System.out.println(res);
	}
}
