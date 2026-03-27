package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.controller;

import java.time.LocalDate;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.dao.PersonPanDao;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.entity.Pan;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.entity.Person;

/**
 * Hello world!
 */
public class InsertPersonPanController {

	public static void main(String[] args) {
		
		Pan pan = new Pan();
		
		pan.setId(433);
		pan.setPanNumber("XYZ675ER");
		pan.setDob(LocalDate.parse("1990-09-13"));
		
		Person person = new Person();
		
		person.setId(913);
		person.setName("Rohan");
		person.setEmail("rohan@gmail.com");
		person.setPan(pan);
		
		PersonPanDao dao=new PersonPanDao();
		
		dao.savePersonAndPanDao(person, pan);
	}

}
