/**
 * 
 */
package com.neon.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neon.dao.UserDao;


/**
 * @author user364
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public boolean studentLogIn(int studentId, String studentPassword) {
		// TODO Auto-generated method stub
		return userDao.studentLogIn(studentId, studentPassword);
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
