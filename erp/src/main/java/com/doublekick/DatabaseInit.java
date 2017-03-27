package com.doublekick;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.doublekick.entity.Account;
import com.doublekick.entity.AccountStatus;
import com.doublekick.entity.academy.Academy;
import com.doublekick.entity.academy.AcademyBranch;
import com.doublekick.repository.AcademyBranchRepository;
import com.doublekick.repository.AcademyRepository;
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

	@Autowired
	AcademyRepository academyRepo;

	@Autowired
	AcademyBranchRepository academyBranchRepo;

	
	@PostConstruct
	public void init() {
		userStatusInit();
		defaultAcademy();
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
	
	private void defaultAcademy() {
		Academy academy = academyRepo.findByDomain("admin");
		if(academy == null){
				academy = new Academy("Admin", "admin");
				academyRepo.saveAndFlush(academy);
		}
		List<AcademyBranch> branchList = academyBranchRepo.findAllByAcademy(academy);
		if(branchList == null || branchList.size() ==0){
			AcademyBranch branch = AcademyBranch.createHeadAcademyBranch(academy, "admin", "admin", "02");
			academyBranchRepo.saveAndFlush(branch);
		}
	}

	private void userInti() {
		AccountStatus open = accountStatusRepo.findByTextKey(AccountStatus.OPEN);
		
		Academy academy = academyRepo.findByDomain("admin");
		AcademyBranch branch = academyBranchRepo.findOneByAcademyAndHead(academy, true);
		
		if(open != null && academy != null && branch != null){
			Account admin = accountRepo.findByLoginId("admin");
			 if(admin == null){
				 admin = new Account("admin", phPass.hashPassword("dddd"), "name", "admin@test.com", true, open, branch);
				 accountRepo.saveAndFlush(admin);
			 }
		}else{
			System.err.println("Don't create Admin!!");
		}
	}

}
