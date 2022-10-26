/**
 * 
 */
package com.neon.bean;

/**
 * @author user364
 *
 */
public class CourseCatlog {

	private int courseId;
	private String courseName;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public CourseCatlog(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public CourseCatlog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CourseCatlog [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	
	
}
