package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.controller;

import java.util.List;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.dao.CountryStateDao;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity.Country;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity.State;

/**
 * GetCounttryStateByCountryIdController
 *
 * @author Mo Masood Ansari
 */
public class GetCounttryStateByCountryIdController {

	public static void main(String[] args) {
		Country country=new CountryStateDao()
		.getCountryStatesByCountryIdDao(91);
		
		if(country!=null) {
			
			System.out.println("country-details");
			System.out.println(country.getId()+"\n"+country.getName());
		
		
			System.out.println("state-details....");
			
			List<State> states=country.getStates();
			
			if(states.size()>0) {
				
				for (State state : states) {
					System.out.println(state);
				}
			}else {
				System.out.println("country without states");
			}
		}else {
			System.out.println("country id is not found");
		}
	}
}
