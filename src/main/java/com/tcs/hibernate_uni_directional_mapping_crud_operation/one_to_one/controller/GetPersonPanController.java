package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.controller;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.dao.PersonPanDao;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.entity.Pan;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.entity.Person;

/**
 * GetPersonPanController
 *
 * @author Mo Masood Ansari
 */
public class GetPersonPanController {

	public static void main(String[] args) {
		
		Person person=new PersonPanDao().getPersonPanByPersonIdDao(913);
	
		System.out.println(person.getId());
		
		Pan pan=person.getPan();
		
		System.out.println(pan.getPanNumber());
		
	}
}
