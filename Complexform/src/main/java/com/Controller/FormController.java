package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Entities.User_Details;

@Controller
public class FormController {
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String getFormData(@ModelAttribute("alert") User_Details details,BindingResult result,Model model) {
		if(result.hasErrors()) {
			System.out.println("Result "+result);
			model.addAttribute("result",result);
			return "Form";
		}
		System.out.println("Hello I am FormData Handler");
		System.out.println(details);
		model.addAttribute("user",details);
		return "success";
	}
}
