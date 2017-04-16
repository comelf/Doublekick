package com.doublekick.entity.academy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AcademyAccountType {
	
	public static final String ADMIN = "admin";
	public static final String OWNER ="owner";
	public static final String TEACHER ="teacher";
	public static final String MANAGER ="manager";
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private String textKey;

	@Column(nullable = false)
	private String name;
	
	public AcademyAccountType(String textKey, String name) {
		this.textKey = textKey;
		this.name = name;
	}
}
