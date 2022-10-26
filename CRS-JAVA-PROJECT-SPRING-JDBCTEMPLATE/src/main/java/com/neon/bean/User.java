/**
 * 
 */
package com.neon.bean;

/**
 * @author user364
 *
 */
public class User {

	private int userId;
	private String userPassword;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPassword=" + userPassword + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
