package com.ust.hwithjpa.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pencil")
public class Pencil {
	@Id
	@Column
	private int id;
	@Column
	private String color;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bid",nullable = false)
	
	private PencilBox pencilbox;

}
