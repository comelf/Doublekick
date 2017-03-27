package com.doublekick.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.repository.AccountRepository;

@Controller
public class AmademyStudentController {
	
	@Autowired
	AccountRepository accountRepo;
	
	/*
	 * 학생관리 - 학생 조회
	 */
	@RequestMapping(value="/academy/student", method=RequestMethod.GET)
	public String academyStudent(HttpServletRequest request){
		return "academy/student/info";
	}
	
	/*
	 * 학생관리 - 수업관리
	 */
	@RequestMapping(value="/academy/student/lesson", method=RequestMethod.GET)
	public String academyStudentLesson(HttpServletRequest request){
		return "academy/student/lesson";
	}
	
	/*
	 * 학생관리 - 출결관리
	 */
	@RequestMapping(value="/academy/student/attendance", method=RequestMethod.GET)
	public String academyStudentAttendance(HttpServletRequest request){
		return "academy/student/attendance";
	}
	
	/*
	 * 학생관리 - 성적관리
	 */
	@RequestMapping(value="/academy/student/grade", method=RequestMethod.GET)
	public String academyStudentGrade(HttpServletRequest request){
		return "academy/student/grade";
	}
	
	/*
	 * 학생관리 - 단체처리
	 */
	@RequestMapping(value="/academy/student/group", method=RequestMethod.GET)
	public String academyStudentGroup(HttpServletRequest request){
		return "academy/student/group";
	}
	
	/*
	 * 학생관리 - 학생정보삭제
	 */
	@RequestMapping(value="/academy/student/management", method=RequestMethod.GET)
	public String academyStudentManagement(HttpServletRequest request){
		return "academy/student/management";
	}
	
	
	
	/*
	 *  포토 업로드 Test 임시 페이
	 */
	@RequestMapping(value="/academy/photo", method=RequestMethod.GET)
	public String photoUpload(HttpServletRequest request){
		return "academy/photoUpload";
	}
	
	
	
}
