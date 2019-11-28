package com.ust.hwithjpa.manytoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "course")
public class Course {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "course")
	private List<Student> student;
	
	

}
