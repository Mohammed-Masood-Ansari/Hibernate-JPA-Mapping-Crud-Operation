package com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_many.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Subject
 *
 * @author Mo Masood Ansari
 */
@Data
@Entity
public class Subject {

	@Id
	private int id;
	private String name;
	private String author;
	
}
