/**
 * 
 */
package com.neon.service;

import java.util.List;

import com.neon.bean.Course;
import com.neon.bean.Registration;



/**
 * @author user364
 *
 */
public interface ProfessorService {

	public List<Course> viewCourse();
	public void addGrades( int studentId,String sGrade);
	public List<Registration> viewRegisteredStudents();
}
