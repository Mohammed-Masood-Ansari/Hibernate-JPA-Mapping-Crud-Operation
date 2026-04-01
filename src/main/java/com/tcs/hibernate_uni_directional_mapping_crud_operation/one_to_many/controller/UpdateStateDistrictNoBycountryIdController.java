package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.controller;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.dao.CountryStateDao;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity.Country;

/**
 * UpdateStateDistrictNoBycountryIdController
 *
 * @author Mo Masood Ansari
 */
public class UpdateStateDistrictNoBycountryIdController {

	public static void main(String[] args) {
		
		Country country=new CountryStateDao()
		.updateStateNoOfDistrictByCountryIdDao(91, 403, 16);
		
		System.out.println("your updated data is...");
		
		System.out.println(country);
	}
}
