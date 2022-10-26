/**
 * 
 */
package com.Neon.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Neon.Bean.Course;
import com.Neon.Bean.Professor;
import com.Neon.Bean.Registration;
import com.Neon.Bean.Student;

/**
 * @author user364
 *
 */

public interface AdminService {

	public List<Professor> addProfessor(Professor professor);
	public boolean approveRegistration(int RegistStudId);
	public List<Course> addCourse(Course course);
	public String removeCourse(int courseId);
}
