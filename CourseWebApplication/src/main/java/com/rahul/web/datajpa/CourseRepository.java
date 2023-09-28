package com.rahul.web.datajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rahul.web.model.Course;

@Repository
@Transactional
public interface CourseRepository  extends JpaRepository<Course, Integer>{
	public List<Course> findByMentor(String name);
}