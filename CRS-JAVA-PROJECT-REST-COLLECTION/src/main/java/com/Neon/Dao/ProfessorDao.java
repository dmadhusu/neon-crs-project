/**
 * 
 */
package com.Neon.Dao;

import java.util.List;

import com.Neon.Bean.Course;
import com.Neon.Bean.Registration;
import com.Neon.Bean.StudentGrade;



/**
 * @author user364
 *
 */
public interface ProfessorDao {


	public List<Course> viewCourse();
	public List<StudentGrade> addGrades(StudentGrade studentGrade);
	public List<Registration> viewRegisteredStudents();
}
