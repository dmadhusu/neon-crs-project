/**
 * 
 */
package com.neon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neon.bean.Course;
import com.neon.bean.PaymentType;
import com.neon.bean.StudentGrade;
import com.neon.dao.StudentDao;

/**
 * @author user364
 *
 */
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	@Override
	public boolean registration( String studentPassword,String studentName,String studentCity,String studentEmail) {
		// TODO Auto-generated method stub
		 studentDao.registration(studentPassword, studentName, studentCity, studentEmail);

		return false;
}

	@Override
	public void addCourse(int courseId, int studentId) {
		// TODO Auto-generated method stub
		studentDao.addCourse(courseId, studentId);
	}
	
	

	@Override
	public PaymentType payFees(int studentId, int payId,String payStatus,double payAmount) {
		// TODO Auto-generated method stub
		return studentDao.payFees(studentId, payId, payStatus, payAmount);
	}


	@Override
	public void dropCourse(int courseId, int studentId) {
		// TODO Auto-generated method stub
		studentDao.dropCourse(courseId, studentId);
	}




	@Override
	public StudentGrade viewGrades(int studentId) {
		// TODO Auto-generated method stub
		return studentDao.viewGrades(studentId);
	}

}
