/**
 * 
 */
package com.neon.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.neon.bean.Course;
import com.neon.bean.CourseCatlog;

/**
 * @author user364
 *
 */
public class CourseCatlogMapper implements RowMapper<CourseCatlog>{

	@Override
	public CourseCatlog mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		CourseCatlog courseCatlog=new CourseCatlog();
		courseCatlog.setCourseId(rs.getInt("courseId"));
		courseCatlog.setCourseName(rs.getString("courseName"));
		
	      return courseCatlog;
		
	}
}
