/**
 * 
 */
package com.neon.dao;

import java.util.List;

import com.neon.bean.Course;
import com.neon.bean.PaymentType;
import com.neon.bean.Registration;
import com.neon.bean.StudentGrade;



/**
 * @author user364
 *
 */
public interface StudentDao {

	public boolean registration(String studentPassword,String studentName,String studentCity,String studentEmail);
	//public List<Course> ViewCourse();
	public void addCourse(int courseId,int studentId);
	public void dropCourse(int courseId,int studentId);
	public StudentGrade viewGrades(int studentId);
	public PaymentType payFees(int studentId, int payId,String payStatus,double payAmount);
}
