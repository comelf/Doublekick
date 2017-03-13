package com.doublekick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doublekick.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,  Integer>{

	Account findByLoginId(String loginId);

}
