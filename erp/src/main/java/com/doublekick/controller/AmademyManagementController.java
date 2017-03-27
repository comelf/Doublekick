package com.doublekick.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.repository.AccountRepository;

@Controller
public class AmademyManagementController {
	
	@Autowired
	AccountRepository accountRepo;
	
	/*
	 * 학원관리 - 수업관리
	 */
	@RequestMapping(value="/academy/management/lession", method=RequestMethod.GET)
	public String academyManagementLession(HttpServletRequest request){
		return "academy/management/lession";
	}
	
	/*
	 * 학원관리 - 패키지관리
	 */
	@RequestMapping(value="/academy/management/package", method=RequestMethod.GET)
	public String academyManagementPackage(HttpServletRequest request){
		return "academy/management/package";
	}
	
	/*
	 * 학원관리 - 강사관리
	 */
	@RequestMapping(value="/academy/management/teacher", method=RequestMethod.GET)
	public String academyManagementTeacher(HttpServletRequest request){
		return "academy/management/teacher";
	}
	
	/*
	 * 학원관리 - 연습실현황
	 */
	@RequestMapping(value="/academy/management/room", method=RequestMethod.GET)
	public String academyManagementRoom(HttpServletRequest request){
		return "academy/management/room";
	}

	/*
	 * 학원관리 - 스케줄관리
	 */
	@RequestMapping(value="/academy/management/schedule", method=RequestMethod.GET)
	public String academyManagementSchedule(HttpServletRequest request){
		return "academy/student";
	}
	
}
