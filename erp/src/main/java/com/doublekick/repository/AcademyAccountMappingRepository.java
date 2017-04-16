package com.doublekick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.Account;
import com.doublekick.entity.academy.AcademyAccountMapping;

@Repository
public interface AcademyAccountMappingRepository extends JpaRepository<AcademyAccountMapping,  Integer>{

	AcademyAccountMapping findOneByAccount(Account account);

}
