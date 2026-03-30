package com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.dao;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.entity.Pan;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.one_to_one.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

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
//		em.persist(pan);
		em.persist(person);
		et.commit();
		
		return person;
	}
	
	public Person getPersonPanByPersonIdDao(int personId) {
		return em.find(Person.class, personId);
	}
	
	public boolean deletePanByPanId(int panId) {
		
		Pan pan=em.find(Pan.class, panId);
		
		if(pan!=null) {
			
			String fetchPersonByPanId = 
					"Select p From Person p where p.pan.id=?1";
			
			Query query=em.createQuery(fetchPersonByPanId,Person.class);
			
			query.setParameter(1, pan.getId());
			
			Person person=(Person) query.getSingleResult();
			
					
			et.begin();
			
			person.setPan(null);
			
			em.merge(person);
			
			em.remove(pan);
			
			et.commit();
			
			return true;
		}
		return false;
		
	}
	
	public boolean deletePersonById(int id) {
		
		Person person=getPersonPanByPersonIdDao(id);
		
		if(person!=null) {
			et.begin();
			
			em.remove(person);
			
			et.commit();
			
			return true;
		}
		
		return false;
	}
}
