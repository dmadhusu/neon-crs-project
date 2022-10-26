/**
 * 
 */
package com.neon.service;

import java.sql.SQLException;

/**
 * @author user364
 *
 */
public interface UserService {

	public boolean studentLogIn(int studentId, String studentPassword);
	public boolean adminLogIn(int adminId,String adminPassword);
	public boolean professorLogIn(int pId,String pPassword);
	public String logOut();
}
