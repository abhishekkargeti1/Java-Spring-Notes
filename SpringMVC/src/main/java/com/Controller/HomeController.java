package com.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("")
	public String getHome() {
		return "index";
	}
	@RequestMapping("/home")
	public String getIndex(Model model) {
		System.out.println("Hello I am Home Controller");
		model.addAttribute("name","Abhishek Kargeti");
		model.addAttribute("age",22);
		
		List<String> details= new ArrayList<String>();
		details.add("Abhishek");
		details.add("Nikhil");
		details.add("Meenakshi");
		details.add("Rajendra");
		model.addAttribute("details",details);
		return "index";
	}
	@RequestMapping("/about")
	public String getAbout() {
		System.out.println("Hello I am About Controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView getHelp() {
		System.out.println("Hello I am Help Controller");
		ModelAndView mv = new ModelAndView();
		mv.addObject("Name","Abhishek");
		mv.setViewName("help");
		return mv;
	}
}
