package com.doublekick.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.academy.AcademyBranch;
import com.doublekick.entity.academy.AcademyLession;

@Repository
public interface AcademyLessionRepository extends JpaRepository<AcademyLession,  Integer>{
	
	public List<AcademyLession> findAllByAcademyBranchId(Integer branchId);
	public AcademyLession findByNameAndAcademyBranch(String name, AcademyBranch branch);
}
