package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("")
	public String getViews() {
		System.out.println("Hello i am HomeController");
		return "index";
	}
	
	
	@RequestMapping("/home")
	public String getHomeViews() {
		System.out.println("Hello i am HomeController");
		return "index";
	}
	@RequestMapping("/about")
	public String getAboutViews() {
		System.out.println("Hello i am HomeController");
		return "about";
	}
}
