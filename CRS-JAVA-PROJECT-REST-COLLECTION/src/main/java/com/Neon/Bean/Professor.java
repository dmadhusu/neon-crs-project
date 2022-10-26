/**
 * 
 */
package com.Neon.Bean;

/**
 * @author user364
 *
 */
public class Professor {

	private int pId;
	private String pPassword;
	private String pName;
	private String pCity;
	private String pEmail;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpPassword() {
		return pPassword;
	}
	public void setpPassword(String pPassword) {
		this.pPassword = pPassword;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCity() {
		return pCity;
	}
	public void setpCity(String pCity) {
		this.pCity = pCity;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	@Override
	public String toString() {
		return "Professor [pId=" + pId + ", pPassword=" + pPassword + ", pName=" + pName + ", pCity=" + pCity
				+ ", pEmail=" + pEmail + "]";
	}
	public Professor(int pId, String pPassword, String pName, String pCity, String pEmail) {
		super();
		this.pId = pId;
		this.pPassword = pPassword;
		this.pName = pName;
		this.pCity = pCity;
		this.pEmail = pEmail;
	}
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
