package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	
	@RequestMapping("/")
	public String getDefaultView() {
		System.out.println("Hello Default View");
		return "index";
	}
	
	
	
}
