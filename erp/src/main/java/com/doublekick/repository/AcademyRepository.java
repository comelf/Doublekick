package com.doublekick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.academy.Academy;

@Repository
public interface AcademyRepository extends JpaRepository<Academy,  Integer>{

	Academy findByDomain(String domain);

}
