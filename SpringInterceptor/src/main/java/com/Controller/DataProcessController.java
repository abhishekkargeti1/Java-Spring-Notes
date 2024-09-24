package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataProcessController {
	
	@RequestMapping("/processform")
	public String dataProcess(@RequestParam("username")String name,Model model) {
		System.out.println("Hello I am DataProcess Handler");
		model.addAttribute("Msg",name);
		return "success";
	}
}
