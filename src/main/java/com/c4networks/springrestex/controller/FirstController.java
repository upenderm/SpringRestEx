package com.c4networks.springrestex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.c4networks.springrestex.vo.UserDetail;

@Controller
public class FirstController {
	
	@Autowired
	private UserDetail userDetail;
	
	@RequestMapping("/hello")
	public ModelAndView sayHelloToUser(){
		String message = "This is a Spring with REST services application !";
		System.out.println("In sayHelloToUser()");
		
		return new ModelAndView("Welcome", "message", message);
	}
	
	@RequestMapping(value="/userPage", method=RequestMethod.GET)
	public ModelAndView displayUserPage(ModelAndView model){
		String message = "You are in display page !";
		System.out.println("In displayUserPage()");
//		model.addAttribute("userDetail", new UserDetail());
		return new ModelAndView("UserPage", "userDetail", new UserDetail());
	}
	
	@RequestMapping(value="/userFormSubmit", method=RequestMethod.GET)
	public ModelAndView saveUserDetails(){
		String message = "You are in display page !";
		System.out.println("In saveUserDetails()");
		System.out.println("user details"+userDetail);
		if(null!=userDetail){
			System.out.println(userDetail.getFirstName());
		}
		
		return new ModelAndView("UserPage", "message", message);
	}

}
