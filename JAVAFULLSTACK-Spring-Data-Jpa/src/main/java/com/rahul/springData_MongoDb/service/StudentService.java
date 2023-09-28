package com.rahul.springData_MongoDb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.springData_MongoDb.model.Student;

@Service
public class StudentService implements BussinessService <Student>{
	
	@Autowired
	private MongoDataJpaRepository repository;
	@Override
	public List<Student> getAll() {
		
		return repository.findAll();
	}

	@Override
	public List<Student> getByName() {
           return null;
	}

	@Override
	public Student getById(Integer sid) {
		
		return repository.findById(sid).get();
	}

	@Override
	public List<Student> getByAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Student object) {
		repository.save(object);		
	}

}
