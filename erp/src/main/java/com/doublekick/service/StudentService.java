package com.doublekick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doublekick.entity.academy.Student;
import com.doublekick.repository.AcademyStudentRepository;

@Service
public class StudentService {
	
	@Autowired
	AcademyStudentRepository studentRepo;

	public List<Student> getAllAcademyStudent(Integer branchId) {
		return studentRepo.findAllByAcademyBranchId(branchId);
	}
	
}
