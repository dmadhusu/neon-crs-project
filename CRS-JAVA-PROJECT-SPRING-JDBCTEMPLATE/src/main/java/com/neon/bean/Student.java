/**
 * 
 */
package com.neon.bean;

/**
 * @author user364
 *
 */
public class Student {

	private int studentId;
	private String studentPassword;
	private String studentFirstName;
	private String studentLastName;
	private String studentCity;
	private String studentDept;
	private String studentGender;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentDept() {
		return studentDept;
	}
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentPassword=" + studentPassword + ", studentFirstName="
				+ studentFirstName + ", studentLastName=" + studentLastName + ", studentCity=" + studentCity
				+ ", studentDept=" + studentDept + ", studentGender=" + studentGender + "]";
	}
	public Student(int studentId, String studentPassword, String studentFirstName, String studentLastName,
			String studentCity, String studentDept, String studentGender) {
		super();
		this.studentId = studentId;
		this.studentPassword = studentPassword;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentCity = studentCity;
		this.studentDept = studentDept;
		this.studentGender = studentGender;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
