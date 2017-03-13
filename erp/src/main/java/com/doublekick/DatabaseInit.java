package com.doublekick;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.doublekick.entity.Account;
import com.doublekick.entity.AccountStatus;
import com.doublekick.repository.AccountRepository;
import com.doublekick.repository.AccountStatusRepository;
import com.doublekick.util.PhPass;

public class DatabaseInit {

	@Autowired
	PhPass phPass;

	@Autowired
	AccountRepository accountRepo;

	@Autowired
	AccountStatusRepository accountStatusRepo;

	@PostConstruct
	public void init() {
		userStatusInit();
		userInti();
	}

	private void userStatusInit() {
		AccountStatus pending = accountStatusRepo.findByTextKey(AccountStatus.PENDING);
		if (pending == null) {
			pending = new AccountStatus(AccountStatus.PENDING, "Pending");
			accountStatusRepo.saveAndFlush(pending);
		}
		
		AccountStatus open = accountStatusRepo.findByTextKey(AccountStatus.OPEN);
		if (open == null) {
			open = new AccountStatus(AccountStatus.OPEN, "Open");
			accountStatusRepo.saveAndFlush(open);
		}
		
		AccountStatus close = accountStatusRepo.findByTextKey(AccountStatus.CLOSE);
		if (close == null) {
			close = new AccountStatus(AccountStatus.CLOSE, "Close");
			accountStatusRepo.saveAndFlush(close);
		}
		
	}

	private void userInti() {
		AccountStatus open = accountStatusRepo.findByTextKey(AccountStatus.OPEN);
		if(open != null){
			Account admin = accountRepo.findByLoginId("admin");
			 if(admin == null){
				 admin = new Account("admin", phPass.hashPassword("dddd"), "name", "admin@test.com", true, open);
				 accountRepo.saveAndFlush(admin);
			 }
		}
	}

}
