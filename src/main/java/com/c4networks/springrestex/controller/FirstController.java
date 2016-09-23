package com.c4networks.springrestex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	@RequestMapping("/hello")
	public String sayHelloToUser(){
		
		return "Welcome";
	}

}
