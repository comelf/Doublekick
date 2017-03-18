package com.doublekick.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.repository.AccountRepository;

@Controller
public class AmademyController {
	
	@Autowired
	AccountRepository accountRepo;
	
	@RequestMapping(value="/academy/student", method=RequestMethod.GET)
	public String loginPage(HttpServletRequest request){
		return "academy/student";
	}
	
}
