package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name = "voterid")
public class Voterid {
	@Id
	@Column
	private int Vid;
	@Column
	private String Vname;
	@Exclude
	@OneToOne(mappedBy = "voterid")
	private Person person;
	
	

	

}
