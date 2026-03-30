package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

/**
 * Person
 *
 * @author Mo Masood Ansari
 */
@Entity
@Data
public class Person {

	@Id
	private int id;
	private String name;
	@Column(unique = true)
	private String email;
	
	@OneToOne(cascade =CascadeType.ALL)
	private Pan pan;
}
