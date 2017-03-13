package com.doublekick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.AccountStatus;

@Repository
public interface AccountStatusRepository extends JpaRepository<AccountStatus,  Integer>{

	AccountStatus findByTextKey(String textKey);

}
