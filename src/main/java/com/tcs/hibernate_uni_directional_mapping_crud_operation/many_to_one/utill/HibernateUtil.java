package com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.utill;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * HibernateUtil
 *
 * @author Mo Masood Ansari
 */
public class HibernateUtil {

	public static EntityManagerFactory getEntityManagerFactory() {
		return Persistence
				.createEntityManagerFactory("hibernate");
	}
}
