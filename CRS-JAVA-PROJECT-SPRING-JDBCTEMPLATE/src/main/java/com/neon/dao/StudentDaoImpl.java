/**
 * 
 */
package com.neon.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neon.bean.Payment;
import com.neon.bean.PaymentType;
import com.neon.bean.StudentGrade;
import com.neon.configuration.JDBCConfiguration;
import com.neon.constants.SQLConstant;
import com.neon.mapper.PaymentTypeMapper;
import com.neon.mapper.StudentGradeMapper;

/**
 * @author user364
 *
 */
@Repository
public class StudentDaoImpl implements StudentDao {

	//create the reference of logger here
		Logger logger = LoggerFactory.getLogger(AdminDaoImpl.class);
		
		@Autowired
		private JDBCConfiguration jdbcTemplateObject;
		
	@Override
	public boolean registration( String studentPassword,String studentName,String studentCity,String studentEmail) {
		// TODO Auto-generated method stub
//		if(studentPassword.equals(" ")  || studentName.equals(" ")  || studentCity.equals(" ")  || studentEmail.equals(" ") ) {
//		
// 		return false;
//		}else {
			jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_INSERT_STUDENT, studentPassword, studentName,studentCity, studentEmail);
			 System.out.println("Created Record studentPassword = " + studentPassword + " studentName = " +  studentName + 
					 " studentCity = " + studentCity + " studentEmail = " + studentEmail );
			return true;
		}
	

	@Override
	public void addCourse(int courseId, int studentId) {
		// TODO Auto-generated method stub
		jdbcTemplateObject.jdbcTemplate().update( SQLConstant.SQL_INSERT_COURSE_SELECTION, courseId,studentId);
		 System.out.println("Created Record CourseId = " + courseId + " studentId = " + studentId);
	}

	@Override
	public void dropCourse(int courseId, int studentId) {
		// TODO Auto-generated method stub
		jdbcTemplateObject.jdbcTemplate().update( SQLConstant.SQL_DELETE_STUDENTCOURSE, courseId,studentId);
		 System.out.println("Deleted Record CourseId = " + courseId + " studentId = " + studentId);
	}

	@Override
	public StudentGrade viewGrades(int studentId) {
		
		StudentGrade studentGrade = jdbcTemplateObject.jdbcTemplate().queryForObject(SQLConstant.SQL_SELECT_GRADE, 
                new Object[]{studentId}, new StudentGradeMapper());
logger.debug("value", jdbcTemplateObject.jdbcTemplate().queryForObject(SQLConstant.SQL_SELECT_GRADE, 
                new Object[]{studentId}, new StudentGradeMapper()));;
logger.debug("value of sGrade-->" +studentGrade.toString());

		
		return studentGrade;
	}

	@Override
	public PaymentType payFees(int studentId, int payId,String payStatus,double payAmount) {
		// TODO Auto-generated method stub
		PaymentType paymentType= jdbcTemplateObject.jdbcTemplate().queryForObject(SQLConstant.SQL_SELECT_PAYMENT, 
				new Object[]{studentId}, new PaymentTypeMapper()); 
				
		logger.debug("value", jdbcTemplateObject.jdbcTemplate().queryForObject(SQLConstant.SQL_SELECT_PAYMENT, 
                new Object[]{studentId}, new PaymentTypeMapper()));
                Payment payment=new Payment(payId, payAmount, payStatus, paymentType.getPaymentType());
                System.out.println("payment type"+paymentType.getPaymentType());
		return paymentType;
	}

	
}
