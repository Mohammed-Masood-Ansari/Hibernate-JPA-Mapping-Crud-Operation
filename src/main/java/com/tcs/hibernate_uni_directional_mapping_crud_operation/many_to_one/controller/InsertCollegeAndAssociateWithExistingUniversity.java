package com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.controller;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.dao.CollegeUniversityDao;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.entity.College;

/**
 * InsertCollegeAndAssociateWithExistingUniversity
 *
 * @author Mo Masood Ansari
 */
public class InsertCollegeAndAssociateWithExistingUniversity {

	public static void main(String[] args) {
		
		College college = new College();
		college.setId(4567);
		college.setName("BBD");
		college.setAddress("Lucknow");
		college.setEmail("bbd@gmail.com");
		college.setType("Engineering");
		
		new CollegeUniversityDao().saveCollegeAndAssociateWithExistingUniversityDao(college, 678);
	}
}
