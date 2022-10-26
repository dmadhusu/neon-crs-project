/**
 * 
 */
package com.neon.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.neon.bean.Course;
import com.neon.bean.Professor;
import com.neon.bean.Registration;
import com.neon.bean.Student;



/**
 * @author user364
 *
 */

public interface AdminDao {

	public void addProfessor(String pPassword,String pName,String pCity,String pEmail);
	public void addCourse(String courseName);
	public void removeCourse(int courseId);
	public boolean approveRegistration(int studentId);
	
}
