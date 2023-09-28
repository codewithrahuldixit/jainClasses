package com.hbs.firstApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World!!!!!!!!!!!!!!!!";
	}
}
