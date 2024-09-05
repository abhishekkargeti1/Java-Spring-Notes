package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entities.userDetails;
import com.Service.UserServiceImp;

@Controller
public class MainController {
	
	@Autowired
	private UserServiceImp userService;
	
	
	@RequestMapping("")
	public String getView() {
		return "index";
	}

	@RequestMapping("/form")
	public String getFormView() {
		return "Form";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String getData(@RequestParam("user_name") String name, @RequestParam("user_address") String address,
			@RequestParam("user_email") String email,@RequestParam("user_password")String password) {
				System.out.println("Name " +name);
				System.out.println("Address " +address);
				System.out.println("Email " +email);
				System.out.println("Password " +password );
				userDetails details = new userDetails(name,address,email,password);
				System.out.println("MainController details "+details);
				userService.createuser(details);
		return "success";
				
	}
}
