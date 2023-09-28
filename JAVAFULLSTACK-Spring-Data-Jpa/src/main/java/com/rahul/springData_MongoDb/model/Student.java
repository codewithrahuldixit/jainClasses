package com.rahul.springData_MongoDb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	@Id
	private Integer sid;
	private String sname;
	private Long contact;
	private String address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer sid, String sname, Long contact, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.contact = contact;
		this.address = address;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", contact=" + contact + ", address=" + address + "]";
	}
	
	
}
