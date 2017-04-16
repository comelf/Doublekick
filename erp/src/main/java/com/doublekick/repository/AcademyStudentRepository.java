package com.doublekick.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.academy.Student;

@Repository
public interface AcademyStudentRepository extends JpaRepository<Student,  Integer>{

	@Query("select s from Student s where academyBranchId = :branchId")
	List<Student> findAllByAcademyBranchId(@Param("branchId")Integer branchId);

}
