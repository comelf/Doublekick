package com.doublekick.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.R;
import com.doublekick.entity.academy.AcademyBranch;
import com.doublekick.interceptor.BadAcademyAccessExection;
import com.doublekick.repository.AccountRepository;

@Controller
public class AcademySystemController {
	
	@Autowired
	AccountRepository accountRepo;
	
	
	@RequestMapping(value="/academy", method=RequestMethod.GET)
	public String academyMain(HttpServletRequest request, HttpSession session) throws BadAcademyAccessExection{
		
		//설정이나세팅이 완료된경우
		if(true){
			
		}
		
		AcademyBranch branch =  (AcademyBranch) session.getAttribute(R.CURRENT_ACADEMY_BRANCH);
		if(branch == null){
			throw new BadAcademyAccessExection();
		}
		
		return "redirect:/academy/"+branch.getId()+"/student";
	}
	
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
