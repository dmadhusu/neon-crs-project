package com.neon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neon.dao.StudentLoginDao;

@Service
public class StudentLoginServiceImpl implements StudentLoginService{

	@Autowired
	StudentLoginDao studentlogindao;
	
	@Override
	public boolean StudentLogin( int studentId, String studentPassword) {
		
		return studentlogindao.StudentLogin(studentId, studentPassword);
		
	}
	
	
}
