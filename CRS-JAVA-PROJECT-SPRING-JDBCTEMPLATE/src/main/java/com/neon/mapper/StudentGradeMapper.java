/**
 * 
 */
package com.neon.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.neon.bean.Course;
import com.neon.bean.StudentGrade;

/**
 * @author user364
 *
 */
public class StudentGradeMapper implements RowMapper<StudentGrade> {

	@Override
	public StudentGrade mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		StudentGrade studentGrade=new StudentGrade();
		studentGrade.setstudentId(rs.getInt("studentId"));
		studentGrade.setsGrade(rs.getString("sGrade"));
		
	      return studentGrade;
		
	}
}
