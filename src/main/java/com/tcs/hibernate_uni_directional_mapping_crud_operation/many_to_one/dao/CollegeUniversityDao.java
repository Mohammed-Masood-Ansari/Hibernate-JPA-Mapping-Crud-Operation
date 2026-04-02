package com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.dao;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.entity.College;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.entity.University;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.utill.HibernateUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * CollegeUniversityDao
 *
 * @author Mo Masood Ansari
 */
public class CollegeUniversityDao {

	EntityManagerFactory emf = HibernateUtil.getEntityManagerFactory();
			
	EntityManager em = null;
			
	EntityTransaction et=null;
	
	public College saveCollegeUniversityDao(College college,University university) {
		
		if(college==null||university==null) {
			return null;
		}
		
		try {
			
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			em.persist(university);
			em.persist(college);
			et.commit();
			return college;
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
			return null;
		}finally {
			if(em.isOpen()) {
				em.close();
			}
		}
	}
	
	public College saveCollegeAndAssociateWithExistingUniversityDao(College college, int universityId) {
		
	
		
		if(college==null||universityId<0) {
			return null;
		}
		
		try {
			
			em=emf.createEntityManager();
			et=em.getTransaction();
			
			University university=em.find(University.class, universityId);
			
			if(university!=null) {
				
				college.setUniversity(university);
				
				et.begin();
				
				em.persist(college);
				
				et.commit();
				
				return college;
			}
			return null;
			
		} catch (Exception e) {
			e.printStackTrace();
			
			if(et!=null&&et.isActive()) {
				et.rollback();
			}
			
			return null;
		}finally {
			
			if(em!=null&&em.isOpen()) {
				em.close();
			}
		}
		
	}
}
