package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entities.User_details;

@Controller
public class MainController {

	@RequestMapping("")
	public String getView() {
		System.out.println("Hello i am First Controller");
		return "index";
	}

	@RequestMapping("/home")
	public String getHome() {
		System.out.println("Hello i am Home Controller");
		return "Home";
	}

	@RequestMapping("/about")
	public String getAbout() {
		System.out.println("Hello i am About Controller");
		return "About";
	}

	@RequestMapping("/form")
	public String getFeedbackForm() {
		System.out.println("Hello I am FeedbackForm Controller");
		return "FeedbackForm";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("user_name") String name, @RequestParam("user_address") String address,
			@RequestParam("user_email") String email, @RequestParam("user_password") String password, Model model) {
		System.out.println("Hello I am HandlerForm Controller");

		System.out.println("User name " + name);
		System.out.println("User address " + address);
		System.out.println("User email " + email);
		System.out.println("User password " + password);

		model.addAttribute("Name", name);
		model.addAttribute("Address", address);
		model.addAttribute("Email", email);
		model.addAttribute("Password", password);

		return "success";
	}

	@RequestMapping("/form2")
	public String getForm2() {
		return "FeedBackForm2";
	}

	/*
	 * @RequestMapping(path = "/processform1", method = RequestMethod.POST) public
	 * String handlerForm1(@RequestParam("user_name") String
	 * name, @RequestParam("user_address") String address,
	 * 
	 * @RequestParam("user_email") String email ,@RequestParam("user_password")
	 * String password,Model model) {
	 * 
	 * User_details details = new User_details(name,address,email,password);
	 * model.addAttribute("User_details",details); return "success"; }
	 */
	
	
	@RequestMapping(path = "/processform1", method = RequestMethod.POST)
	public String handlerForm1(@ModelAttribute User_details user,Model model) {
		
		System.out.println(user);	
		model.addAttribute("user",user);
		return "success";
	}

}
