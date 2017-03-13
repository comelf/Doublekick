package com.doublekick.entity;

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
public class AcademyAccountMapping {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="academyId", nullable=false)
	private Academy academy;
	
	@ManyToOne
	@JoinColumn(name="accountId", nullable=false)
	private Account account;
	
	@ManyToOne
	@JoinColumn(name="typeId", nullable=false)
	AcademyAccountType type;
	
}
