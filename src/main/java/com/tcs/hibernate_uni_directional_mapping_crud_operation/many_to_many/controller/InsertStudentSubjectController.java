package com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_many.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_many.dao.StudentSubjectDao;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_many.entity.Student;
import com.tcs.hibernate_uni_directional_mapping_crud_operation.many_to_many.entity.Subject;

/**
 * InsertStudentSubjectController
 *
 * @author Mo Masood Ansari
 */
public class InsertStudentSubjectController {

	public static void main(String[] args) {
		
		Subject subject1 = new Subject();
		subject1.setId(500);
		subject1.setName("HTML");
		subject1.setAuthor("Tim-Berners-Lee");
		
		Subject subject2 = new Subject();
		subject2.setId(501);
		subject2.setName("JS");
		subject2.setAuthor("Brendan Eich");
		
		List<Subject> subjects =
				new ArrayList<Subject>(Arrays.asList(subject1,subject2));
		
		Student student1 = new Student();
		student1.setId(600);
		student1.setName("Ranjeet Kumar");
		student1.setEmail("ranjeet@gmail.com");
		student1.setSubjects(subjects);
		
		
		Student student2 = new Student();
		student2.setId(601);
		student2.setName("Ankit");
		student2.setEmail("ankit@gmail.com");
		student2.setSubjects(new ArrayList<Subject>(Arrays.asList(subject2)));
		
		
		List<Student> students=
				new ArrayList<Student>(Arrays.asList(student1,student2));
		
		new StudentSubjectDao().saveStudentSubjectDao(students);
	}
}
