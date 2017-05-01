package com.doublekick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doublekick.entity.academy.AcademyLession;
import com.doublekick.entity.academy.LessionCategory;
import com.doublekick.repository.AcademyLessionRepository;
import com.doublekick.repository.LessionCategoryRepository;

@Service
public class LessionService {

	@Autowired
	AcademyLessionRepository lessionRepo;

	@Autowired
	LessionCategoryRepository categoryRepo;
	
	public List<AcademyLession> getAllAcademyLession(Integer branchId) {
		List<AcademyLession> lessions = lessionRepo.findAllByAcademyBranchId(branchId);
		return lessions;
	}

	public List<LessionCategory> getAllAcademyLessionCategory(Integer branchId) {
		List<LessionCategory> category = categoryRepo.findAllByAcademyBranchId(branchId);
		return category;
	}

}
