package com.doublekick.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.repository.AccountRepository;

@Controller
public class AmademySystemController {
	
	@Autowired
	AccountRepository accountRepo;
	
	/*
	 * 시스템 - 공지사항
	 */
	@RequestMapping(value="/academy/notice", method=RequestMethod.GET)
	public String academyManagementLession(HttpServletRequest request){
		return "academy/student";
	}
	
	/*
	 * 시스템 - 시스템설정
	 */
	@RequestMapping(value="/academy/config", method=RequestMethod.GET)
	public String academyManagementTeacher(HttpServletRequest request){
		return "academy/student";
	}
	
	/*
	 * 시스템 - 시스템로그 
	 */
	@RequestMapping(value="/academy/syslog", method=RequestMethod.GET)
	public String academyManagementRoom(HttpServletRequest request){
		return "academy/student";
	}
	
}
