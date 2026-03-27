package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.dao;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.entity.Pan;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * PersonPanDao
 *
 * @author Mo Masood Ansari
 */
public class PersonPanDao {

	EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();

	EntityTransaction et = em.getTransaction();
	
	public Person savePersonAndPanDao(Person person,Pan pan) {
		
		et.begin();
		em.persist(pan);
		em.persist(person);
		et.commit();
		
		return person;
	}
	
	public Person getPersonPanByPersonIdDao(int personId) {
		return em.find(Person.class, personId);
	}
}
