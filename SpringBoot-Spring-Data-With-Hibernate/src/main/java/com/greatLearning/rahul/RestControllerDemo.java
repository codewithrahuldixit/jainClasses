package com.greatLearning.rahul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

	@RequestMapping("/hello")
	public String name() {
		return "Hello";
	}
}
