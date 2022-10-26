/**
 * 
 */
package com.neon.bean;

/**
 * @author user364
 *
 */
public class StudentGrade {

	private int studentId;
	private String sGrade;
	
	
	
	public int getstudentId() {
		return studentId;
	}
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getsGrade() {
		return sGrade;
	}
	public void setsGrade(String sGrade) {
		this.sGrade = sGrade;
	}
	@Override
	public String toString() {
		return "StudentGrade [studentId=" + studentId + ", sGrade=" + sGrade + "]";
	}
	public StudentGrade(int studentId, String sGrade) {
		super();
		this.studentId = studentId;
		this.sGrade = sGrade;
	}
	public StudentGrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

