package com.doublekick.entity.academy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class SalaryType {
	
	public static String FIXED = "fixed";
	public static String CHANGE = "change";
	public static String MIXED = "mixed";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(nullable = false)
	private String textKey;

	@Column(nullable = false)
	private String name;
	
	public SalaryType(String textKey, String name){
		this.textKey = textKey;
		this.name = name;
	}
	
}
