/**
 * 
 */
package com.neon.dao;
import com.neon.bean.Registration;
import com.neon.configuration.JDBCConfiguration;
import com.neon.constants.SQLConstant;
import com.neon.mapper.RegistrationMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class AdminDaoImpl implements AdminDao{

	//create the reference of logger here
	Logger logger = LoggerFactory.getLogger(AdminDaoImpl.class);
	
	@Autowired
	private JDBCConfiguration jdbcTemplateObject;
	
	
	
	@Override
	public void addProfessor( String pPassword, String pName, String pCity, String pEmail) {
		// TODO Auto-generated method stub
	//	String SQL = "insert into professor (pPassword, pName,  pCity,  pEmail) values (?, ?,?,?)";
		jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_INSERT_PROFESSOR, pPassword, pName,  pCity,  pEmail);
		 System.out.println("Created Record Password = " + pPassword + " Name = " + pName + " City = " + pCity + " Email = " + pEmail);
	}
	

	@Override
	public void addCourse(String courseName) {
		// TODO Auto-generated method stub
		//String SQL = "insert into coursecatlog (courseName) values (?)";
		jdbcTemplateObject.jdbcTemplate().update( SQLConstant.SQL_INSERT_COURSE, courseName);
		 System.out.println("Created Record CourseName = " + courseName );
	}

	@Override
	public void removeCourse(int courseId) {
		// TODO Auto-generated method stub
		//String SQL = "delete from coursecatlog where courseId = ?";
	      jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_DELETE_COURSE, courseId);
	      System.out.println("Deleted Record with courseId = " + courseId );
	}

	@Override
	public boolean approveRegistration(int studentId) {
		// TODO Auto-generated method stub
		
		
		
		
	 Registration  reg=     jdbcTemplateObject.jdbcTemplate().queryForObject(SQLConstant.SQL_SELECT_APPROVE, 
                new Object[]{studentId}, new RegistrationMapper());
logger.debug("value", jdbcTemplateObject.jdbcTemplate().queryForObject(SQLConstant.SQL_SELECT_APPROVE, 
                new Object[]{studentId}, new RegistrationMapper()));

		if(studentId == reg.getStudentId() ) {
			
			return true;
		}
		else {
			
			return false;
		}
		
		
	}

	
	

}
