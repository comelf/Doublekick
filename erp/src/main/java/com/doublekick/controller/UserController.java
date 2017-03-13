package com.doublekick.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.model.UserDetail;
import com.doublekick.repository.AccountRepository;

@Controller
public class UserController {
	
	@Autowired
	AccountRepository accountRepo;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(){
		UserDetail userDetails =(UserDetail)SecurityContextHolder.getContext().getAuthentication().getDetails();
		System.out.println(userDetails.getAccount());
		
		return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage(HttpServletRequest request){
		System.out.println(request.getAttribute("fail"));
		return "account/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
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
	
	
}
