/**
 * 
 */
package com.Neon.Dao;
import com.Neon.Util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Neon.Bean.Course;
import com.Neon.Bean.Professor;
import com.Neon.Bean.Registration;
import com.Neon.Bean.Student;
import java.lang.Package; 
/**
 * @author user364
 *
 */
@Repository
public class AdminDaoImpl implements AdminDao{
	
	@Autowired
	private Collection collection;

	

	
	@Override
	public List<Professor> addProfessor(Professor professor) {
		
		return collection.addProfessor(professor);
	}

	@Override
	public List<Course> addCourse(Course course) {
//		clist1=collection.Course();
//		clist1.add(course);
//		collection.setClist(clist1);
//		//collection.clist.add(course);
		System.out.println("Course Added");
		return collection.Course(course);
	}

	@Override
	public String removeCourse(int courseId) {
		
		return collection.removeCourse(courseId);
	}

	@Override
	public boolean approveRegistration(int RegistStudId) {
		
		return collection.approveRegistration(RegistStudId);
	}

}
