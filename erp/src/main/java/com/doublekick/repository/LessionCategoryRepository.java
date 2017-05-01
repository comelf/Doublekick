package com.doublekick.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.academy.AcademyBranch;
import com.doublekick.entity.academy.LessionCategory;

@Repository
public interface LessionCategoryRepository extends JpaRepository<LessionCategory, Integer> {
	public List<LessionCategory> findAllByAcademyBranchId(Integer branchId);
	public LessionCategory findByTextKeyAndAcademyBranch(String textKey, AcademyBranch branchId);
}
