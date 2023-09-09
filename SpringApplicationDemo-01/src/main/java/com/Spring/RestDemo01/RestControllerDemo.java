package com.Spring.RestDemo01;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		return Arrays.asList(
				new Student(01,"Rahul","Computer Science"),
				new Student(02,"Shakshi","Java Spring Boot")
				);
	}

}
