package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.controller;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.dao.PersonPanDao;

/**
 * DeletePanControllerByPanId
 *
 * @author Mo Masood Ansari
 */
public class DeletePanControllerByPanId {

	public static void main(String[] args) {
		
		boolean b=new PersonPanDao().deletePersonById(913);
	}
}
