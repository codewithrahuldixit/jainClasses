package com.rahul.springData_MongoDb.service;

import java.util.List;

public interface BussinessService <T>{
	void save(T object);
	List<T> getAll();
	List<T> getByName();
	T getById(Integer sid);
	List<T> getByAddress();
}
