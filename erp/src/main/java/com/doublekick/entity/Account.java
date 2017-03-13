package com.doublekick.entity;

import java.util.Date;

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
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(unique = true, nullable = false)
	private String loginId;
	private String password;
	private String name;
	private String email;
	private Date createDate;
	private boolean admin = false;

	@ManyToOne
	@JoinColumn(name = "accountStatusId", nullable = false)
	private AccountStatus status;

	public Account(String loginId, String hashPassword, String name, String email, boolean isAdmin, AccountStatus status) {
		this.loginId = loginId;
		this.password = hashPassword;
		this.name = name;
		this.email = email;
		this.admin = isAdmin;
		this.status = status;
		this.createDate = new Date();
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", loginId=" + loginId + ", password=" + password + ", name=" + name + ", email="
				+ email + "]";
	}

}
