/**
 * 
 */
package com.Neon.Bean;

/**
 * @author user364
 *
 */
public class StudentGrade {

	private int sId;
	private String sGrade;
	
	
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsGrade() {
		return sGrade;
	}
	public void setsGrade(String sGrade) {
		this.sGrade = sGrade;
	}
	@Override
	public String toString() {
		return "StudentGrade [sId=" + sId + ", sGrade=" + sGrade + "]";
	}
	public StudentGrade(int sId, String sGrade) {
		super();
		this.sId = sId;
		this.sGrade = sGrade;
	}
	public StudentGrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
