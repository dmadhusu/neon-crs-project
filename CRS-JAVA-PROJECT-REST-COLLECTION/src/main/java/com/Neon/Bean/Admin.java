/**
 * 
 */
package com.Neon.Bean;

/**
 * @author user364
 *
 */
public class Admin {

	private int adminId;
	private String adminPassword;
	
	
	
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPassword=" + adminPassword + "]";
	}
	public Admin(int adminId, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminPassword = adminPassword;
		
	}
	
	
	
}
