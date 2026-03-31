package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.controller;

import java.util.ArrayList;
import java.util.List;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.dao.CountryStateDao;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity.Country;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity.State;

/**
 * InsertCountryStatesController
 *
 * @author Mo Masood Ansari
 */
public class InsertCountryStatesController {

	public static void main(String[] args) {
		
		State state1 = new State();
		state1.setId(400);
		state1.setName("UttarPradesh");
		state1.setCapital("Lucknow");
		state1.setNoOfDistrict(75);
		
		State state2 = new State();
		state2.setId(401);
		state2.setName("Bihar");
		state2.setCapital("Patna");
		state2.setNoOfDistrict(70);
		
		State state3 = new State();
		state3.setId(402);
		state3.setName("Haryana");
		state3.setCapital("Chandigarh");
		state3.setNoOfDistrict(25);
		
		State state4 = new State();
		state4.setId(403);
		state4.setName("Uttrakhand");
		state4.setCapital("Dehradun");
		state4.setNoOfDistrict(12);
		
		List<State> states = new ArrayList<State>();
		states.add(state1);
		states.add(state2);
		states.add(state3);
		states.add(state4);
		
		Country country = new Country();
		country.setId(91);
		country.setName("INDIA");
		country.setCapital("New-Delhi");
		
		country.setStates(states);
		
		new CountryStateDao().saveCountryStatesDao(country, states);
	}
}
