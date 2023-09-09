package com.spring.demo01;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(
				new Course(9,"Spring Boot","Rahul"),
				new Course(10,"Spring Framework","Rahul"),
				new Course(11,"DevOps","Rahul")
				);
				
	}
}
