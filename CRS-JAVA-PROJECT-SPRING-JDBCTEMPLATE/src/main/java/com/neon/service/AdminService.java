/**
 * 
 */
package com.neon.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;



/**
 * @author user364
 *
 */

public interface AdminService {

	public void addProfessor(String pPassword,String pName,String pCity,String pEmail);
	public boolean approveRegistration(int studentId);
	public void addCourse(String courseName);
	public void removeCourse(int courseId);
}
