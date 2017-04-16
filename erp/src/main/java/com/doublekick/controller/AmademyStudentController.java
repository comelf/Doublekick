package com.doublekick.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doublekick.entity.academy.Student;
import com.doublekick.service.StudentService;

@Controller
public class AmademyStudentController {
	
	@Autowired
	StudentService studentService;
	
	
	
	/*
	 * 학생관리 - 학생 조회
	 */
	@RequestMapping(value="/academy/{branchId}/student", method=RequestMethod.GET)
	public String academyStudent(@PathParam("branchId")Integer branchId, HttpServletRequest request){
		
		List<Student> studentList = studentService.getAllAcademyStudent(branchId);
		
		return "academy/student/info";
	}
	
	/*
	 * 학생관리 - 수업관리
	 */
	@RequestMapping(value="/academy/{branchId}/student/lesson", method=RequestMethod.GET)
	public String academyStudentLesson(HttpServletRequest request){
		return "academy/student/lesson";
	}
	
	/*
	 * 학생관리 - 출결관리
	 */
	@RequestMapping(value="/academy/{branchId}/student/attendance", method=RequestMethod.GET)
	public String academyStudentAttendance(HttpServletRequest request){
		return "academy/student/attendance";
	}
	
	/*
	 * 학생관리 - 성적관리
	 */
	@RequestMapping(value="/academy/{branchId}/student/grade", method=RequestMethod.GET)
	public String academyStudentGrade(HttpServletRequest request){
		return "academy/student/grade";
	}
	
	/*
	 * 학생관리 - 단체처리
	 */
	@RequestMapping(value="/academy/{branchId}/student/group", method=RequestMethod.GET)
	public String academyStudentGroup(HttpServletRequest request){
		return "academy/student/group";
	}
	
	/*
	 * 학생관리 - 학생정보삭제
	 */
	@RequestMapping(value="/academy/{branchId}/student/management", method=RequestMethod.GET)
	public String academyStudentManagement(HttpServletRequest request){
		return "academy/student/management";
	}
	
	
	/*
	 * 학생관리 - 학생 추가
	 */
	@RequestMapping(value="/academy/{branchId}/student/add", method=RequestMethod.GET)
	public String academyStudentAdd(@PathParam("branchId")Integer branchId, Model model, HttpServletRequest request){
		model.addAttribute("student", new Student());
		return "academy/student/add";
	}
	
	
	/*
	 *  포토 업로드 Test 임시 페이
	 */
	@RequestMapping(value="/academy/photo", method=RequestMethod.GET)
	public String photoUpload(HttpServletRequest request){
		return "academy/photoUpload";
	}
	
	
	
}
