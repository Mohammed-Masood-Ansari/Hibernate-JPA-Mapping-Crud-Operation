package com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_many.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

/**
 * Student
 *
 * @author Mo Masood Ansari
 */
@Data
@Entity
public class Student {

	@Id
	private int id;
	
	private String name;
	
	@Column(unique = true)
	private String email;
	
	@UpdateTimestamp
	private LocalDateTime registrationDateTime;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Subject> subjects;
}
