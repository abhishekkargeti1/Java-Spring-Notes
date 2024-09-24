package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping("")
	public String DefaultHandler() {
		System.out.println("Hello I am Default Handler");
		return "index";
	}
	
	@RequestMapping("/form")
	public String FormHandler() {
		System.out.println("Hello I am Form Handler");
		return "Form";
	}
}
