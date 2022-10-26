/**
 * 
 */
package com.Neon.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Neon.Bean.Course;
import com.Neon.Bean.Professor;
import com.Neon.Bean.Registration;
import com.Neon.Bean.Student;



/**
 * @author user364
 *
 */

public interface AdminDao {

	public List<Professor> addProfessor(Professor professor);
	public List<Course> addCourse(Course course);
	public String removeCourse(int courseId);
	public boolean approveRegistration(int RegistStudId);
	
}
