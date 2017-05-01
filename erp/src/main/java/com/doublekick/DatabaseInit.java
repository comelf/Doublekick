package com.doublekick;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.doublekick.entity.Account;
import com.doublekick.entity.AccountStatus;
import com.doublekick.entity.academy.Academy;
import com.doublekick.entity.academy.AcademyAccountMapping;
import com.doublekick.entity.academy.AcademyAccountType;
import com.doublekick.entity.academy.AcademyBranch;
import com.doublekick.entity.academy.AcademyLession;
import com.doublekick.entity.academy.AcademyType;
import com.doublekick.entity.academy.LessionCategory;
import com.doublekick.entity.academy.Student;
import com.doublekick.repository.AcademyAccountMappingRepository;
import com.doublekick.repository.AcademyAccountTypeRepository;
import com.doublekick.repository.AcademyBranchRepository;
import com.doublekick.repository.AcademyLessionRepository;
import com.doublekick.repository.AcademyRepository;
import com.doublekick.repository.AcademyStudentRepository;
import com.doublekick.repository.AcademyTypeRepository;
import com.doublekick.repository.AccountRepository;
import com.doublekick.repository.AccountStatusRepository;
import com.doublekick.repository.LessionCategoryRepository;
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
	
	@Autowired
	AcademyStudentRepository studentRepo;
	
	@Autowired
	LessionCategoryRepository lessionCategoryRepo;
	
	@Autowired
	AcademyLessionRepository lessionRepo;
	
	
	@PostConstruct
	public void init() {
		userStatusInit();
		academyTypeInit();
		accountTypeInit();
		defaultAcademy();
		userInti();
		
		studentListInit();
		lessionListInit();
	}

	private void lessionListInit() {
		Academy academy = academyRepo.findByDomain("admin");
		AcademyBranch branch = academyBranchRepo.findOneByAcademyAndHead(academy, true);
		
		if(branch == null){
			System.out.println("Database init :  academy Branch is NULL!!");
			return;
		}
		LessionCategory category1 = lessionCategoryRepo.findByTextKeyAndAcademyBranch("test1", branch);
		if(category1 == null){
			category1 = new LessionCategory("test1","보컬", branch);
			lessionCategoryRepo.saveAndFlush(category1);
		}
		LessionCategory category2 = lessionCategoryRepo.findByTextKeyAndAcademyBranch("test2", branch);
		if(category2 == null){
			category2 = new LessionCategory("test2","오디션", branch);
			lessionCategoryRepo.saveAndFlush(category2);
		}
		LessionCategory category3 = lessionCategoryRepo.findByTextKeyAndAcademyBranch("test3", branch);
		if(category3 == null){
			category3 = new LessionCategory("test3","댄스", branch);
			lessionCategoryRepo.saveAndFlush(category3);
		}
		
		AcademyLession lession1 = lessionRepo.findByNameAndAcademyBranch("보컬A", branch);
		if(lession1 == null){
			lession1 = new AcademyLession();
			lession1.setLessionCategory(category1);
			lession1.setCreateDate(new Date());
			lession1.setAcademyBranch(branch);
			lession1.setName("보컬A");
			lession1.setLessionTime(2);
			lession1.setLessionMethod("group");
			lession1.setLessionFee(20000);
			lessionRepo.saveAndFlush(lession1);
		}
		
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
	
	private static String[] studentName = {"이지훈","황보잎새","송남주","조재인","한여름","오채민","최영실","문정웅","왕샛별","노해인","소진성","차훈","대정순","하솔길","조택수","소준탁","박남주","오미경","천정희","표유리","주규식","구채아","조미영","최상혁","우기민","정성희","남다영","윤늘찬","심해성","권주혁","류기철","권승범"};
	private static String[] schoolName = {"일번고등학교","이번중학교","삼번초등학교","사번대학교","오번중학교","육번고등학교","칠번초등학교","팔번고등학교","구번고등학교","십번중학교","십일번대학교"};
	private static String[] names = {"정한울","우하은","하종호","방유비","황보대한","김나정","길용주","배경윤","신의찬","천도담","손하정","왕산새","장지헌","천범석","최율","고태식","소건태","김진규","주정희","노철수","류규현","길원준","대인화","손연지","신선희","황보혜은","한리내","구성현","신희연","장연성","노경화","손남주","소미라","박솔희","임요환","양승리","임자철","주희선","유영수","하선미","허채민","문태연","박순자","왕나림","진승권"};
	
	private void studentListInit() {
		Academy academy = academyRepo.findByDomain("admin");
		AcademyBranch branch = academyBranchRepo.findOneByAcademyAndHead(academy, true);
		
		if(branch == null){
			System.out.println("Database init :  academy Branch is NULL!!");
			return;
		}
		System.out.println(branch.getId());
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			Student student = new Student();
			student.setAcademyBranch(branch);
			student.setName(studentName[i]);
			student.setGender(rand.nextInt(1) == 1 ? "male" : "female");
			student.setSchool(schoolName[rand.nextInt(10)]);
			student.setSchoolYear(rand.nextInt(2) +1);
			student.setBirthdayDate(new Date());
			student.setJoindayDate(new Date());
			student.setHomePhone("02-123-4567");
			student.setPhone("010-0101-1010");
			student.setAddress1("서울 강남구 중앙동");
			student.setAddress2("123-456번지");
			student.setEmail("test@test.com");
			student.setFather(names[rand.nextInt(20)]);
			student.setMother(names[rand.nextInt(20)]);
			student.setMothersPhone("010-123-4567");
			student.setFathersPhone("010-567-8910");
			studentRepo.saveAndFlush(student);
		}
		
	}

}
