package com.doublekick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.repository.AccountRepository;

@Controller
public class LandingPageController {
	
	@Autowired
	AccountRepository accountRepo;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(){
		
		return "index";
	}
	
	
}
