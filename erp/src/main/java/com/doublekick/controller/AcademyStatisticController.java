package com.doublekick.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.repository.AccountRepository;

@Controller
public class AcademyStatisticController {
	
	@Autowired
	AccountRepository accountRepo;
	
	/*
	 * 통계분석 - 종합현황
	 */
	@RequestMapping(value="/academy/statistic/total", method=RequestMethod.GET)
	public String academyManagementLession(HttpServletRequest request){
		return "academy/student";
	}
	
	/*
	 * 통계분석 - 지점별현황
	 */
	@RequestMapping(value="/academy/statistic/branch", method=RequestMethod.GET)
	public String academyManagementTeacher(HttpServletRequest request){
		return "academy/student";
	}
	
	/*
	 * 통계분석 - 지점별비교
	 */
	@RequestMapping(value="/academy/statistic/branch/comparison", method=RequestMethod.GET)
	public String academyManagementRoom(HttpServletRequest request){
		return "academy/student";
	}
	
}
