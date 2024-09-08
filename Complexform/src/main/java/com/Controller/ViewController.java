package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping("")
	public String getDefaultView() {
		System.out.println("Hello I am Default View");
		return "index";
	}
	
	@RequestMapping("/form")
	public String getHome() {
		System.out.println("Hello I am Home Handler");
		return "Form";
	}

}
