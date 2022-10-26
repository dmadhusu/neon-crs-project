/**
 * 
 */
package com.Neon.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Neon.Bean.Course;
import com.Neon.Bean.Registration;
import com.Neon.Bean.StudentGrade;
import com.Neon.Util.Collection;

/**
 * @author user364
 *
 */
@Repository
public class ProfessorDaoImpl implements ProfessorDao {

	@Autowired
	private Collection collection;
	
	@Override
	public List<Course> viewCourse() {
		
		return collection.getClist();
	}

	@Override
	public List<StudentGrade> addGrades(StudentGrade studentGrade) {
		
		return collection.addGrades(studentGrade);
	}

	@Override
	public List<Registration> viewRegisteredStudents() {
	
		return collection.viewRegisteredStudents();
	}
	
}
