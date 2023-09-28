package com.greatLearning.rahul.springjpa;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

//@Repository
//@Transactional
public class CourseJpaRepository {
	@Autowired
	private EntityManager entityManager;
	public void insert(Course course) {
		entityManager.merge(course);
	}
	public Course findById(int id) {
		return entityManager.find(Course.class,id);
	}
	public List<Course> findAll(){
		return entityManager.createNativeQuery("select * from Course ",Course.class).getResultList();
	}
	
}
