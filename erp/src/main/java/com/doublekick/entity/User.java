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
public class User {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(unique=true, nullable=false)
	private String loginId;
	private int crc;
	private String password;
	private String name;
	private String email;
	private Date createDate;
	
	@ManyToOne
	@JoinColumn(name="roleId", nullable=false)
	private UserRole role;
	
	@ManyToOne
	@JoinColumn(name="statusId", nullable=false)
	private UserStatus status;
	
	
}
