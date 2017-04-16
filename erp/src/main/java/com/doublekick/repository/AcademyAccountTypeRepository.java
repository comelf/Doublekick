package com.doublekick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.academy.AcademyAccountType;

@Repository
public interface AcademyAccountTypeRepository extends JpaRepository<AcademyAccountType,  Integer>{

	AcademyAccountType findByTextKey(String textKey);

}
