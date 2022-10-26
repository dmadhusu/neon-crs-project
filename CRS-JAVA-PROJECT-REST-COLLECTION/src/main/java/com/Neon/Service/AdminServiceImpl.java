/**
 * 
 */
package com.Neon.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Neon.Bean.Course;
import com.Neon.Bean.Professor;
import com.Neon.Bean.Registration;
import com.Neon.Bean.Student;
import com.Neon.Dao.AdminDao;
import com.Neon.Dao.AdminDaoImpl;

/**
 * @author user364
 *
 */
@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDaoImpl adminDaoImpl;
	
	
	
	private static List<Registration> rlist1=new ArrayList<>();
	
	@Override
	public List<Professor> addProfessor(Professor professor) {
		
		return adminDaoImpl.addProfessor(professor);
	}

	@Override
	public List<Course> addCourse(Course course) {
		
		return adminDaoImpl.addCourse(course);
	}
	
	
	@Override
	public boolean approveRegistration(int RegistStudId) {
		
		return adminDaoImpl.approveRegistration(RegistStudId);
	}

	@Override
	public String removeCourse(int courseId) {
		adminDaoImpl.removeCourse(courseId);
		System.out.println("Deleted Course");
		return "Deleted Course";
	}

	
	

}
