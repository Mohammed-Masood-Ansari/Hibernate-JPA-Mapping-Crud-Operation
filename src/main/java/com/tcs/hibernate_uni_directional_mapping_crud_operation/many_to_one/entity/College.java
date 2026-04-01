package com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

/**
 * College
 *
 * @author Mo Masood Ansari
 */
@Entity
@Data
public class College {

	@Id
	private int id;
	private String name;
	private String email;
	private String Type;
	private String address;
	
	@ManyToOne
	private University university;
}
