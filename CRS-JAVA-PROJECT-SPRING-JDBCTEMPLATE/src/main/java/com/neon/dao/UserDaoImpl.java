/**
 * 
 */
package com.neon.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neon.bean.Student;
import com.neon.configuration.JDBCConfiguration;
import com.neon.constants.SQLConstant;
import com.neon.mapper.StudentMapper;

/**
 * @author user364
 *
 */
@Repository
public class UserDaoImpl implements UserDao {

	//create the reference of logger here
		Logger logger = LoggerFactory.getLogger(AdminDaoImpl.class);
		
		@Autowired
		private JDBCConfiguration jdbcTemplateObject;
		
	@Override
	public boolean studentLogIn(int studentId, String studentPassword) {
		// TODO Auto-generated method stub
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

	@Override
	public boolean adminLogIn(int adminId, String adminPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean professorLogIn(int pId, String pPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String logOut() {
		// TODO Auto-generated method stub
		return null;
	}
}
