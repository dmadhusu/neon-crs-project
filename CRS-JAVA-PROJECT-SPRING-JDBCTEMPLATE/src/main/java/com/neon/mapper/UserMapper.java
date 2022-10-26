package com.neon.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.neon.bean.Student;
import com.neon.bean.StudentGrade;
import com.neon.bean.User;

public class UserMapper  implements RowMapper<Student>{
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student=new Student();
		student.setStudentId(rs.getInt("studentId"));
		student.setStudentPassword(rs.getString("studentPassword"));
		student.setStudentFirstName(rs.getString("studentLastName"));
		student.setStudentLastName(rs.getString("studentLastName"));
		student.setStudentCity(rs.getString("studentCity"));
		student.setStudentDept(rs.getString("studentDept"));
	      return student;
		
	}
	
	
}
