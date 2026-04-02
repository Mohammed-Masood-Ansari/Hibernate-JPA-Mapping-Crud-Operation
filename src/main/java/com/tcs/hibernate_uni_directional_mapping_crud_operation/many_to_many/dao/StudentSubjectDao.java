package com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_many.dao;

import java.util.List;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_many.entity.Student;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.utill.HibernateUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

/**
 * StudentSubjectDao
 *
 * @author Mo Masood Ansari
 */
public class StudentSubjectDao {
	
	EntityManagerFactory emf=HibernateUtil.getEntityManagerFactory();
	EntityManager em = null;
	EntityTransaction et = null;

	public List<Student> saveStudentSubjectDao(List<Student> students){
		
		if(students.size()==0) {
			return null;
		}
		
		try {
			
			em=emf.createEntityManager();
			et=em.getTransaction();
			
			et.begin();
			
			students.forEach(a->em.persist(a));
			
			et.commit();
			
			return students;
			
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
