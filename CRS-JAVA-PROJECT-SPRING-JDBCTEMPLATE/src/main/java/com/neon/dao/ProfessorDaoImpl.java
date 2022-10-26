/**
 * 
 */
package com.neon.dao;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.neon.bean.Course;
import com.neon.bean.Registration;
import com.neon.configuration.JDBCConfiguration;
import com.neon.constants.SQLConstant;
import com.neon.mapper.CourseMapper;
import com.neon.mapper.RegistrationMapper;




/**
 * @author user364
 *
 */
@Repository
public class ProfessorDaoImpl implements ProfessorDao {

	
	//create the reference of logger here
		Logger logger = LoggerFactory.getLogger(AdminDaoImpl.class);
		
		@Autowired
		private JDBCConfiguration jdbcTemplateObject;
		
	@Override
	public List<Course> viewCourse() {
		// TODO Auto-generated method stub
		// String SQL = "select * from coursecatlog";
	      List <Course> courses = jdbcTemplateObject.jdbcTemplate().query(SQLConstant.SQL_SELECT_COURSE, 
	                                new CourseMapper());
	    	      logger.debug("in debug");
	      return courses;
		
	}

	@Override
	public void addGrades(int studentId,String sGrade ) {
		// TODO Auto-generated method stub
		//String SQL = "insert into studentGrade (studentId,sGrade) values (?,?)";
		jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_INSERT_STUDENTGRADE,studentId,sGrade );
		 System.out.println("Created Record studentId = " + studentId + " studentGrade " + sGrade );
	}

	

	@Override
	public List<Registration> viewRegisteredStudents() {
		// TODO Auto-generated method stub
		//String SQL = "select * from Registration";
		 List <Registration> registration = jdbcTemplateObject.jdbcTemplate().query(SQLConstant.SQL_SELECT_REGISTRATION, 
                new RegistrationMapper());
		 logger.debug("in debug");
		 return registration;
		
	}

	
}
