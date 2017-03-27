package com.doublekick.entity.academy;

import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToMany;

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
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int gender;
	
	private String school;
	
	private Integer schoolYear;
	
	private Date birthday;
	
	private String homePhone;
	
	private String phone;
	
	private String address1;
	
	private String address2;
	
	private String motive;
	
	private String email;
	
	@OneToMany
	@MapKeyJoinColumn(name="relation")
	private Map<String, StudentFamily> family;
	
}
