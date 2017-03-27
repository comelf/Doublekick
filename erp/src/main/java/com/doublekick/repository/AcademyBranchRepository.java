package com.doublekick.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.academy.Academy;
import com.doublekick.entity.academy.AcademyBranch;

@Repository
public interface AcademyBranchRepository extends JpaRepository<AcademyBranch,  Integer>{

	List<AcademyBranch> findAllByAcademy(Academy academy);

	AcademyBranch findOneByAcademyAndHead(Academy academy, boolean b);

}
