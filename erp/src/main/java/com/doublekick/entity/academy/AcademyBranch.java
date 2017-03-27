package com.doublekick.entity.academy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AcademyBranch {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="academyId", nullable=false)
	private Academy academy;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String location;
	
	@Column
	private String telephone;
	
	@Column
	private boolean head = false;

	public AcademyBranch(Academy academy, String name, String location, String telephone) {
		this.academy = academy;
		this.name = name;
		this.location = location;
		this.telephone = telephone;
	}
	
	public static AcademyBranch createHeadAcademyBranch(Academy academy, String name, String location, String telephone){
		AcademyBranch branch = new AcademyBranch(academy, name, location, telephone);
		branch.setHead(true);
		return branch;
	}
	
}
