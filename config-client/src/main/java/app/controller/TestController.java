package app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
	@Value("${from}")
	private String from;
	@Value("${tom}")
	private String tom;
	
	@RequestMapping("/from")
	public String from(){
		return from;
	}
	@RequestMapping("/tom")
	public String tom(){
		return tom;
	}
}
