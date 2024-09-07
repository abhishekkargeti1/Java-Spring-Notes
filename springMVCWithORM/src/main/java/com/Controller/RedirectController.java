package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	/*
	 * @RequestMapping("/one") public String getView1() {
	 * System.out.println("Hello I am One Controller"); return "redirect:/enjoy"; }
	 */

	@RequestMapping("/one")
	public RedirectView getView1() {
		System.out.println("Hello I am One Controller");
		RedirectView reDirectView = new RedirectView();
		reDirectView.setUrl("enjoy");
		return reDirectView; 
		
	}
	@RequestMapping("/enjoy")
	public String getView2() {
		System.out.println("Hello I am Enjoy Controller");
		return "Form";
	}
}
