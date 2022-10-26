/**
 * 
 */
package com.neon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neon.bean.Course;
import com.neon.bean.Registration;
import com.neon.dao.ProfessorDao;


/**
 * @author user364
 *
 */
@Service
public class ProfessorServiceImpl implements ProfessorService {

	@Autowired
	private ProfessorDao professorDao;
	@Override
	public List<Course> viewCourse() {
		
		return professorDao.viewCourse();
	}

	@Override
	public void addGrades( int studentId,String sGrade) {
		// TODO Auto-generated method stub
		professorDao.addGrades(studentId, sGrade);
		System.out.println("Student Grade Added Successfully");
	}

	@Override
	public List<Registration> viewRegisteredStudents() {
		// TODO Auto-generated method stub
		return professorDao.viewRegisteredStudents();
	}

	
}
