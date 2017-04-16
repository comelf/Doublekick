package com.doublekick;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.doublekick.entity.Account;
import com.doublekick.entity.AccountStatus;
import com.doublekick.entity.academy.Academy;
import com.doublekick.entity.academy.AcademyAccountMapping;
import com.doublekick.entity.academy.AcademyAccountType;
import com.doublekick.entity.academy.AcademyBranch;
import com.doublekick.entity.academy.AcademyType;
import com.doublekick.repository.AcademyAccountMappingRepository;
import com.doublekick.repository.AcademyAccountTypeRepository;
import com.doublekick.repository.AcademyBranchRepository;
import com.doublekick.repository.AcademyRepository;
import com.doublekick.repository.AcademyTypeRepository;
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

	@Autowired
	AcademyAccountMappingRepository aamRepo;
	
	@Autowired
	AcademyAccountTypeRepository academyAccountTypeRepo;
	
	@Autowired
	AcademyTypeRepository academyTypeRepo;
	
	@PostConstruct
	public void init() {
		userStatusInit();
		academyTypeInit();
		accountTypeInit();
		defaultAcademy();
		userInti();
	}

	private void accountTypeInit() {
		AcademyAccountType accountType0 = academyAccountTypeRepo.findByTextKey(AcademyAccountType.ADMIN);
		if(accountType0 == null){
			accountType0 = new AcademyAccountType(AcademyAccountType.ADMIN, "Admin");
			academyAccountTypeRepo.saveAndFlush(accountType0);
		}
		
		AcademyAccountType accountType1 = academyAccountTypeRepo.findByTextKey(AcademyAccountType.OWNER);
		if(accountType1 == null){
			accountType1 = new AcademyAccountType(AcademyAccountType.OWNER, "Owner");
			academyAccountTypeRepo.saveAndFlush(accountType1);
		}
		
		AcademyAccountType accountType2 = academyAccountTypeRepo.findByTextKey(AcademyAccountType.MANAGER);
		if(accountType2 == null){
			accountType2 = new AcademyAccountType(AcademyAccountType.MANAGER, "Manager");
			academyAccountTypeRepo.saveAndFlush(accountType2);
		}
		
		AcademyAccountType accountType3 = academyAccountTypeRepo.findByTextKey(AcademyAccountType.TEACHER);
		if(accountType3 == null){
			accountType3 = new AcademyAccountType(AcademyAccountType.TEACHER, "Teacher");
			academyAccountTypeRepo.saveAndFlush(accountType3);
		}
	}

	private void academyTypeInit() {
		AcademyType academyType1 = academyTypeRepo.findByTextKey(AcademyType.MUSIC);
		if(academyType1 == null){
			academyType1 = new AcademyType(AcademyType.MUSIC, "Music");
			academyTypeRepo.saveAndFlush(academyType1);
		}
		
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
		Account admin = accountRepo.findByLoginId("admin");
		if(open != null && academy != null && branch != null){
			 if(admin == null){
				 admin = new Account("admin", phPass.hashPassword("dddd"), "name", "admin@test.com", true, open, branch);
				 accountRepo.saveAndFlush(admin);
			 }
		}else{
			System.err.println("Don't create Admin!!");
		}
		
		AcademyAccountMapping aam = aamRepo.findOneByAccount(admin);
		AcademyType academyType = academyTypeRepo.findByTextKey(AcademyType.MUSIC);
		AcademyAccountType accountType = academyAccountTypeRepo.findByTextKey(AcademyAccountType.ADMIN);
		
		if( aam == null ){
			aam = new AcademyAccountMapping();
			aam.setAcademyBranch(branch);
			aam.setAccount(admin);
			aam.setAcademyType(academyType);
			aam.setAccountType(accountType);
			aamRepo.saveAndFlush(aam);
		}
	}

}
