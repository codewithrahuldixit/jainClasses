package com.rahul.springData_MongoDb.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rahul.springData_MongoDb.model.Student;

@Repository
@Transactional
public interface MongoDataJpaRepository extends MongoRepository<Student,Integer> {

}
