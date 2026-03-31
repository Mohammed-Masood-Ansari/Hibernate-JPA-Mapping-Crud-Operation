package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

/**
 * Country
 *
 * @author Mo Masood Ansari
 */
@Entity
@Data
public class Country {

	@Id
	private int id;
	private String name;
	private String capital;
	
	@OneToMany(cascade = CascadeType.PERSIST )
	private List<State> states;
}
