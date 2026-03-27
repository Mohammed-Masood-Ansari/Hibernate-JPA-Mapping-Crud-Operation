package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Pan
 *
 * @author Mo Masood Ansari
 */
@Entity
@Data
public class Pan {

	@Id
	private int id;
	private String panNumber;
	private LocalDate dob;
}
