package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * State
 *
 * @author Mo Masood Ansari
 */
@Entity
@Data
public class State {

	@Id
	private int id;
	private String name;
	private String capital;
	private int noOfDistrict;
	
	
}
