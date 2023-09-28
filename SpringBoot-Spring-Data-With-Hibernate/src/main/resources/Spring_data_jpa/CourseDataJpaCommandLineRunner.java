package com.greatLearning.rahul.spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


public class CourseDataJpaCommandLineRunner implements CommandLineRunner {
    
//	@Autowired
//	private CourseJpaRepository repository;
	//@Autowired
	private CourseDataJpaRepository repository;
	//@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(101,"Sachin","Rahul"));
		repository.save(new Course(102,"Arun","Rahul"));
		repository.save(new Course(103,"Hemant","Rahul"));
		repository.save(new Course(104,"Arun","Rahul"));
		//repository.deleteById(102);
		System.out.println(repository.findAll());
		
		
		
	}

}
