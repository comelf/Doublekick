package com.doublekick.entity.academy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.doublekick.entity.Account;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AcademyAccountMapping {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne
	@JoinColumn(name = "academyBranchId", nullable = false)
	private AcademyBranch academyBranch;

	@ManyToOne
	@JoinColumn(name = "accountId", nullable = false)
	private Account account;

	@ManyToOne
	@JoinColumn(name = "accountTypeId", nullable = false)
	AcademyAccountType accountType;

	@ManyToOne
	@JoinColumn(name = "academyTypeId", nullable = false)
	AcademyType academyType;

	@Override
	public String toString() {
		return "AcademyAccountMapping [academyBranch=" + academyBranch + ", account=" + account + ", accountType="
				+ accountType + ", academyType=" + academyType + "]";
	}

}
