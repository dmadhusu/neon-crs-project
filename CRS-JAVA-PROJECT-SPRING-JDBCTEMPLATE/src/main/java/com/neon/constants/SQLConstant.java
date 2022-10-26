/**
 * 
 */
package com.neon.constants;

/**
 * @author user364
 *
 */
public class SQLConstant {

	//define all the SQL constant admin, professor,student here
	public static final String SQL_INSERT_PROFESSOR = "insert into professor (pPassword, pName,  pCity,  pEmail) values (?, ?,?,?)";
	public static final String SQL_INSERT_COURSE = "insert into course (courseName) values (?)";
	public static final String SQL_DELETE_COURSE = "delete from coursecatlog where courseId = ?";
	public static final String SQL_SELECT_COURSE = "select * from coursecatlog";
	public static final String SQL_INSERT_STUDENTGRADE = "insert into studentGrade (studentId,sGrade) values (?,?)";
	public static final String SQL_SELECT_REGISTRATION = "select * from Registration";
	public static final String SQL_INSERT_STUDENT = "insert into registration (studentPassword, studentName, studentCity, studentEmail) values (?,?,?,?)";
	public static final String SQL_INSERT_COURSE_SELECTION = "insert into course (courseId,studentId) values (?,?)";
	public static final String SQL_DELETE_STUDENTCOURSE = "delete from course where courseId = ? and studentId=? ";
	public static final String SQL_SELECT_GRADE = "select * from studentGrade where studentId = ?";
	public static final String SQL_SELECT_PAYMENT = "select * from paymentType where studentId = ?";
	public static final String SQL_SELECT_APPROVE = "select * from registration where studentId = ?";
	public static final String SQL_SELECT_ROLE = "select roleName from role where roleId=? ";
	public static final String SQL_SELECT_USER = "select * from Student where studentId= ? ";
	public static final String SQL_SELECT_STUDENT = "select * from student where studentId = ?";
	public static final String SQL_SELECT_STUDENT_PASS = "select * from student where studentPassword = ?";
	
}
