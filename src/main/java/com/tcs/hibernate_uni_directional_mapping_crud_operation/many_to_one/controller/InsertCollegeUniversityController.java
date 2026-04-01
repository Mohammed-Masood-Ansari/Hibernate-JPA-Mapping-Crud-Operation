package com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.controller;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.dao.CollegeUniversityDao;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.entity.College;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_one.entity.University;

/**
 * InsertCollegeUniversityController
 *
 * @author Mo Masood Ansari
 */
public class InsertCollegeUniversityController {

	public static void main(String[] args) {
		 University university = new University();
		 
		 university.setId(678);
		 university.setName("AKTU");
		 university.setEmail("aktu@gmail.com");
		 university.setAddress("Lucknow");
		 
		 College college = new College();
		 college.setId(456789);
		 college.setName("MIT");
		 college.setAddress("Meerut");
		 college.setEmail("mit@yahoo.in");
		 college.setType("Engineering");
		 college.setUniversity(university);
		 
		 new CollegeUniversityDao().saveCollegeUniversityDao(college, university);
	}
}
