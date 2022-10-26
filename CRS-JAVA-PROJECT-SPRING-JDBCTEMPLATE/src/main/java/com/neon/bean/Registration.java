/**
 * 
 */
package com.neon.bean;

/**
 * @author user364
 *
 */
public class Registration {

	private int studentId;
	private String studentPassword;
	private String studentName;
	private String studentCity;
	private String studentEmail;
	
	
	
	
	public Registration(int studentId, String studentPassword, String studentName, String studentCity,
			String studentEmail) {
		super();
		studentId = studentId;
		this.studentPassword = studentPassword;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentEmail = studentEmail;
	}




	@Override
	public String toString() {
		return "Registration [StudentId=" + studentId + ", studentPassword=" + studentPassword + ", studentName="
				+ studentName + ", studentCity=" + studentCity + ", studentEmail=" + studentEmail + "]";
	}




	public int getStudentId() {
		return studentId;
	}




	public void setStudentId(int studentId) {
		studentId = studentId;
	}




	public String getStudentPassword() {
		return studentPassword;
	}




	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}




	public String getStudentName() {
		return studentName;
	}




	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public String getStudentCity() {
		return studentCity;
	}




	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}




	public String getStudentEmail() {
		return studentEmail;
	}




	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}




	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
