package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.Dao;
import com.entities.Details;

@Controller
public class DataProcessController {
	
	@Autowired	
	Dao dao;
	
	@RequestMapping(value="/submitData",method = RequestMethod.GET)
	public String getData(@ModelAttribute Details details) {
		System.out.println("Details are "+details);
		dao.insertData(details);
		return "";
	}
}
