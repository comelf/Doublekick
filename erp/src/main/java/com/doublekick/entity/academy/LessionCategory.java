package com.doublekick.entity.academy;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class LessionCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String textKey;
	
	@ManyToOne
	@JoinColumn(name = "academyBranchId", nullable = false)
	private AcademyBranch academyBranch;
	
	@NotEmpty @Size(min=2, max=20, message="이름은 2자 이상 20자 이하이어야 합니다.")
	@Column(nullable = false)
	private String name;
	
	public LessionCategory(String textKey, String name, AcademyBranch branch) {
		this.textKey = textKey;
		this.name = name;
		this.academyBranch = branch;
	}

}
