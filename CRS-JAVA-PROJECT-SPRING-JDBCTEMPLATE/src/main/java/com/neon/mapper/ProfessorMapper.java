/**
 * 
 */
package com.neon.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.neon.bean.Professor;


/**
 * @author user364
 *
 */
public class ProfessorMapper implements RowMapper<Professor> {

	@Override
	public Professor mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Professor professor =new Professor();
		professor.setpId(rs.getInt("pId"));
		professor.setpPassword(rs.getString("pPassword"));
		professor.setpName(rs.getString("pName"));
		professor.setpCity(rs.getString("pCity"));
		professor.setpEmail(rs.getString("pEmail"));
	      return professor;
		
	}
}
