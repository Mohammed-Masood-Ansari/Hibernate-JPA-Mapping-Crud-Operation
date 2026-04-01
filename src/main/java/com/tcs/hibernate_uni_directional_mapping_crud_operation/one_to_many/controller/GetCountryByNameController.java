package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.controller;

import java.util.List;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.dao.CountryStateDao;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity.Country;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity.State;

/**
 * GetCountryByNameController
 *
 * @author Mo Masood Ansari
 */
public class GetCountryByNameController {

	public static void main(String[] args) {
		
		Country country=new CountryStateDao()
				.getCountryByCountryNameDao("INDIA");
		
		List<State> states = country.getStates();
		
		boolean b=true;
		
		for (State state : states) {
			
			if(b) {
				System.out.println("country Name = "+country.getName());
				b=false;
			}
			
			System.out.println("stateName = "+state.getName());
		}
	}
}
