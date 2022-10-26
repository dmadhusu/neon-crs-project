/**
 * 
 */
package com.neon.dao;

/**
 * @author user364
 *
 */
public interface UserDao {

	public boolean studentLogIn(int studentId, String studentPassword);
	public boolean adminLogIn(int adminId,String adminPassword);
	public boolean professorLogIn(int pId,String pPassword);
	public String logOut();
}
