package com.spring.demo01;

import org.springframework.stereotype.Component;

@Component
public class Course {
	private long id;
	private String course;
	private String mentor;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(long id, String course, String mentor) {
		super();
		this.id = id;
		this.course = course;
		this.mentor = mentor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", mentor=" + mentor + "]";
	}

	
}
