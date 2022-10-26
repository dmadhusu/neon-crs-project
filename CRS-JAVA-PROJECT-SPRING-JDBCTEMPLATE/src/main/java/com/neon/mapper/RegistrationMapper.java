/**
 * 
 */
package com.neon.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.neon.bean.Professor;
import com.neon.bean.Registration;
/**
 * @author user364
 *
 */


	public class RegistrationMapper implements RowMapper<Registration>{
		@Override
		public Registration mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			Registration registration=new Registration();
			registration.setStudentId(rs.getInt("studentId"));
			registration.setStudentPassword(rs.getString("studentPassword"));
			registration.setStudentName(rs.getString("studentName"));
			registration.setStudentCity(rs.getString("studentCity"));
			registration.setStudentEmail(rs.getString("studentEmail"));
		      return registration;
	
		}
}
