package com.greatLearning.rahul.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    
	//@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(101,"Sachin","Rahul"));
		repository.insert(new Course(102,"Arun","Rahul"));
		repository.insert(new Course(103,"Hemant","Rahul"));
		repository.insert(new Course(104,"Arun","Rahul"));
		//repository.deleteById(102);
		System.out.println(repository.findAll());
		
		
		
	}

}
