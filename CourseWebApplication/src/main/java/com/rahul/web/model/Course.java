package com.rahul.web.model;


public class Course {
	
	private int radius;
	private String name;
	private String mentor;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int radius, String name, String mentor) {
		super();
		this.radius = radius;
		this.name = name;
		this.mentor = mentor;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	@Override
	public String toString() {
		return "Course [radius=" + radius + ", name=" + name + ", mentor=" + mentor + "]";
	}
	
}
