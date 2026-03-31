package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.dao;

import java.util.List;
import java.util.logging.ErrorManager;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity.Country;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_many.entity.State;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

/**
 * CountryStateDao
 *
 * @author Mo Masood Ansari
 */
public class CountryStateDao {

	EntityManager em=Persistence
			.createEntityManagerFactory("hibernate")
			.createEntityManager();
			
	EntityTransaction et=em.getTransaction();
	
	public Country saveCountryStatesDao(Country country,List<State> states) {
		
		et.begin();
		
		/*
		 * for (State state : states) {
		 * 
		 * em.persist(state); }
		 */
		
		em.persist(country);
		
		et.commit();
		
		return country;
	}
	
	public Country getCountryStatesByCountryIdDao(int countryId) {
		return em.find(Country.class, countryId);
	}
	
	public boolean deleteStateByStateIdDao(int stateId) {
		
		State state = em.find(State.class, stateId);
		
		if(state!=null) {
			et.begin();
			
			String deleteStateByIdQuery = "Delete from country_state where states_id=?1";
			
			Query query=em.createNativeQuery(deleteStateByIdQuery);
			
			query.setParameter(1, stateId);
			
			query.executeUpdate();
			
			em.remove(state);
			
			et.commit();
			
			return true;
		}
		
		return false;
	}
}
