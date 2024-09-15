package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping("")
	public String getDefaultView() {
		System.out.println("Hello I am Default Handler");
		return "index";
	}
	@RequestMapping("/upload")
	public String getForm(){
		System.out.println("Hello I am Upload Handler");
		return "Uploadpage";
	}
}
