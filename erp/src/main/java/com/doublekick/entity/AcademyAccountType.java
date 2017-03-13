package com.doublekick.entity;

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
	
	public static String OWNER ="owner";
	public static String TEACHER ="teacher";
	public static String MANAGER ="manager";
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private String textKey;

	@Column(nullable = false)
	private String name;
	
}
