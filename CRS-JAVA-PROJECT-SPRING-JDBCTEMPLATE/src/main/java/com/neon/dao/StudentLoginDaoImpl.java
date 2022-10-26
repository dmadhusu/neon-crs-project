package com.neon.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestHeader;

import com.neon.bean.PaymentType;
import com.neon.bean.Student;
import com.neon.configuration.JDBCConfiguration;
import com.neon.constants.SQLConstant;
import com.neon.mapper.PaymentTypeMapper;
import com.neon.mapper.StudentMapper;


@Repository
public class StudentLoginDaoImpl implements StudentLoginDao {

	Logger logger = LoggerFactory.getLogger(StudentLoginDaoImpl.class);
	
	@Autowired
	private JDBCConfiguration jdbcTemplateObject;
	
	
	@Override
	public boolean StudentLogin( int studentId, String studentPassword) {
		
		    Student studentuser= findById(studentId);
		    Student studentpass = findByPassword(studentPassword);
		   int studId = studentuser.getStudentId();
		    
		    if(studentId == studId  &&  studentPassword.equals(studentpass.getStudentPassword()))
		    {
		    	
		    	return true;
		    }
		
		    else {
		    	
		    	
		    	return false;
		    	
		    }
		
	}
	
	public Student findById(int studentId) {
		
		Student student= jdbcTemplateObject.jdbcTemplate().queryForObject(SQLConstant.SQL_SELECT_STUDENT, 
				new Object[]{studentId}, new StudentMapper()); 
				
		logger.debug("value", jdbcTemplateObject.jdbcTemplate().queryForObject(SQLConstant.SQL_SELECT_STUDENT, 
                new Object[]{studentId}, new StudentMapper()));
        
		
		return student;
		
	}
	
	public Student findByPassword(String studentPassword) {
		
		Student student= jdbcTemplateObject.jdbcTemplate().queryForObject(SQLConstant.SQL_SELECT_STUDENT_PASS, 
				new Object[]{studentPassword}, new StudentMapper()); 
				
		logger.debug("value", jdbcTemplateObject.jdbcTemplate().queryForObject(SQLConstant.SQL_SELECT_STUDENT_PASS, 
                new Object[]{studentPassword}, new StudentMapper()));
        
		
		return student;
		
	}
	
	
}
