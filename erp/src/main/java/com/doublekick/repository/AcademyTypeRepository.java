package com.doublekick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.academy.AcademyType;

@Repository
public interface AcademyTypeRepository extends JpaRepository<AcademyType,  Integer>{

	AcademyType findByTextKey(String textKey);

}
