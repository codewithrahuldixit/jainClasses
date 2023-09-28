package com.greatLearning.rahul.spring_data_jpa;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface CourseDataJpaRepository extends JpaRepository<Course, Integer>{
		public List<Course> findByAuthor(String name);
}

