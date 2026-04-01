package com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * University
 *
 * @author Mo Masood Ansari
 */
@Entity
@Data
public class University {

	@Id
	private int id;
	private String name;
	private String email;
	private String address;
	
	
}
