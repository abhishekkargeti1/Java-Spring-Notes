package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

		@RequestMapping("")
		public String DefaultHandler() {
			return "index";
		}
		
		@RequestMapping("/home")
		public String HomeHandler() {
			return "Home";
		}
		
		@RequestMapping("/user/{id}/{name}")
		public String getUser_details(@PathVariable("id") int id,@PathVariable("name") String name ) {
			System.out.println(id);
			System.out.println(name);
			String s1 = null;
			System.out.println(s1.length());
			return "Home";
		}
		
		@ExceptionHandler({Exception.class})
		public String ExceptionHndler() {
			return "error_page";
		}
		
		
		
}
