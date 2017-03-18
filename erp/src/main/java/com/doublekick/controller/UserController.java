package com.doublekick.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.repository.AccountRepository;

@Controller
public class UserController {
	
	@Autowired
	AccountRepository accountRepo;
	
	@RequestMapping(value="/account/login", method=RequestMethod.GET)
	public String loginPage(HttpServletRequest request){
		return "account/login";
	}
	
	@RequestMapping(value="/account/login", method=RequestMethod.POST)
	public String loginFail(HttpServletRequest request, Model model){
		String account = request.getParameter("account");
		String error = (String) request.getAttribute("loginError");

		if(error != null && error.equals("badCredentials")){
			model.addAttribute("error", "아이디나 패스워드가 잘못되었습니다.");
		}else {
			model.addAttribute("error", "아이디를 찾을 수 없습니다.");
		}
		if(account != null){
			model.addAttribute("account", account);
		}
		return "account/login";
	}
	
	@RequestMapping(value="/account/create", method=RequestMethod.GET)
	public String accountCreate(HttpServletRequest request){
		return "account/create";
	}
	
	@RequestMapping(value="/account/create", method=RequestMethod.POST)
	public String accountNew(HttpServletRequest request){
		return "account/login";
	}
	
}
