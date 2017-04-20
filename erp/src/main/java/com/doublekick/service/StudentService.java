package com.doublekick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doublekick.entity.academy.AcademyBranch;
import com.doublekick.entity.academy.Student;
import com.doublekick.repository.AcademyStudentRepository;

@Service
public class StudentService {
	
	@Autowired
	AcademyStudentRepository studentRepo;

	public List<Student> getAllAcademyStudent(Integer branchId) {
		System.out.println(branchId);
		List<Student> students = studentRepo.findAllByAcademyBranchId(branchId);
		if(students!= null){
			System.out.println(students.size());
		}
		return students;
	}

	@Transactional
	public Student addStudentWithBranch(Student student) {
		try {
			return studentRepo.saveAndFlush(student);
		} catch (Exception e) {
		}
		return null;
	}
	
}
