/**
 * 
 */
package com.neon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neon.dao.AdminDao;


/**
 * @author user364
 *
 */
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao adminDao;
	@Override
	public void addProfessor(String pPassword, String pName, String pCity, String pEmail) {
		// TODO Auto-generated method stub
		adminDao.addProfessor(pPassword, pName, pCity, pEmail);
		System.out.println("Professor Added");
	}

	@Override
	public boolean approveRegistration(int studentId) {
		// TODO Auto-generated method stub
		return adminDao.approveRegistration(studentId);
	}

	@Override
	public void addCourse(String courseName) {
		// TODO Auto-generated method stub
		adminDao.addCourse(courseName);
		System.out.println("Course Added Successfully");
	}

	@Override
	public void removeCourse(int courseId) {
		// TODO Auto-generated method stub
		adminDao.removeCourse(courseId);
		System.out.println("Course Deleted Successfully");
	}
	
	

	
	

}
