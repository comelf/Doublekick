package com.doublekick.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.repository.AccountRepository;

@Controller
public class AcademyPaymentController {
	
	@Autowired
	AccountRepository accountRepo;
	
	/*
	 * 수납관리 - 학생 조회
	 */
	@RequestMapping(value="/academy/payment", method=RequestMethod.GET)
	public String academyPayment(HttpServletRequest request){
		return "academy/student";
	}
	
	/*
	 * 수납관리 - 수업관리
	 */
	@RequestMapping(value="/academy/default", method=RequestMethod.GET)
	public String academyDefault(HttpServletRequest request){
		return "academy/student";
	}
	
	/*
	 * 수납관리 - 출결관리
	 */
	@RequestMapping(value="/academy/accounting", method=RequestMethod.GET)
	public String academyStudentAttendance(HttpServletRequest request){
		return "academy/student";
	}
	
}
