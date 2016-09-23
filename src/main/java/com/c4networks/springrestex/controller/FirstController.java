package com.c4networks.springrestex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/hello")
	public ModelAndView sayHelloToUser(){
		String message = "Welcome to your 1st Maven Spring project !";
		System.out.println("from controller");
		
		return new ModelAndView("Welcome", "message", message);
	}

}
