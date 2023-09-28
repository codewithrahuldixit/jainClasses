package com.rahul.web.datajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rahul.web.model.Course;

@Component
public class CourseData {
	
	@Autowired
	private CourseRepository repository;
	
	public Course getCourseByID(int id) {
		return repository.findById(id).get();
	}
	
	public List<Course> getAllCourse() {
		return  repository.findAll();
	}

	public List<Course> getAllByAuthor(String mentor){
		return repository.findByMentor(mentor);
	}

	
}
