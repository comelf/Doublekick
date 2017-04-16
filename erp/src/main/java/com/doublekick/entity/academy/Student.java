package com.doublekick.entity.academy;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne
	@JoinColumn(name = "academyBranchId", nullable = false)
	private AcademyBranch academyBranch;
	
	@NotEmpty @Size(min=2, max=20, message="이름은 2자 이상 20자 이하이어야 합니다.")
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String gender;
	
	private String school;
	
	private Integer schoolYear;
	
	private Date birthdayDate;
	
	private Date joindayDate;
	
	@Pattern(regexp="^[0-9]\\d{1,2}-{0,1}\\d{3,4}-{0,1}\\d{4}$", message="전화번호 형식에 맞지 않습니다.")
	private String homePhone;
	
	@Pattern(regexp="^[0-9]\\d{1,2}-{0,1}\\d{3,4}-{0,1}\\d{4}$", message="전화번호 형식에 맞지 않습니다.")
	private String phone;
	
	private String address1;
	
	private String address2;
	
	private String motive;
	
	@Email(message="이메일 형식에 맞지 않습니다.")
	private String email;
	
	private String father;
	
	@Pattern(regexp="^[0-9]\\d{1,2}-{0,1}\\d{3,4}-{0,1}\\d{4}$|$", message="전화번호 형식에 맞지 않습니다.")
	private String fathersPhone;
	
	private String mother;
	
	@Pattern(regexp="^[0-9]\\d{1,2}-{0,1}\\d{3,4}-{0,1}\\d{4}$|$", message="전화번호 형식에 맞지 않습니다.")
	private String mothersPhone;
	
	@Transient
	@Pattern(regexp="^[0-9]\\d{3}-{1}\\d{2}-{1}\\d{2}$", message="날짜 형식에 맞지 않습니다.")
	private String birthday;
	
	@Transient
	@Pattern(regexp="^[0-9]\\d{3}-{1}\\d{2}-{1}\\d{2}$", message="날짜 형식에 맞지 않습니다.")
	private String joinday;
	
}
