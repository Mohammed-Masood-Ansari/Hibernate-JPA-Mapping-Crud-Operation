package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.controller;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.dao.CountryStateDao;

/**
 * DeleteStateByStateIdController
 *
 * @author Mo Masood Ansari
 */
public class DeleteStateByStateIdController {

	public static void main(String[] args) {
		new CountryStateDao().deleteStateByStateIdDao(400);
	}
}
