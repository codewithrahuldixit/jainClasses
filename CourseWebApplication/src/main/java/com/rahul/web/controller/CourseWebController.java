package com.rahul.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rahul.web.datajpa.CourseRepository;

@Controller
public class CourseWebController {


	
	@RequestMapping(value = "welcome")
	public String getWelcomePage() {
		
		return "welcome";
	}
	@RequestMapping(value = "register")
	public String getRegisterPage() {
				return "register";
	}
	@RequestMapping(value = "login")
	public String getLoginPage() {
			return "login";
	}
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login() {
		
			return "login";
	}

}
