package com.rahul.springData_MongoDb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rahul.springData_MongoDb.model.Student;

@Component
public class MongoCommandLineRunner implements CommandLineRunner {

	@Autowired
	BussinessService<Student> service;
	
	@Override
	public void run(String... args) throws Exception {
		service.save(new Student(101,"Rahul Kumar Dixit", 9015088066L,"Prateek Grand City"));
		service.save(new Student(102,"Hemant Kumar", 9899187232L,"Gaur Atulyam"));
		System.out.println("Inserted");
		System.out.println(service.getAll());
		
	}

}
