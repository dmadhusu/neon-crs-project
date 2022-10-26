/**
 * 
 */
package com.neon.controller;

import java.sql.SQLException;

import javax.ws.rs.core.MediaType;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.bean.Course;
import com.neon.bean.PaymentType;
import com.neon.bean.StudentGrade;
import com.neon.exception.StudentCourseRegistrationFailException;
import com.neon.exception.StudentLoginException;
import com.neon.service.StudentLoginService;
import com.neon.service.StudentService;

/**
 * @author user364
 *
 */
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentLoginService studentloginService;
	
	
	@Autowired
	StudentCourseRegistrationFailException studregfailexcp;
	
	@Autowired
	StudentLoginException studentLoginException;
	
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/register")
	@ResponseBody 
	public ResponseEntity<String> registration(@RequestHeader String studentPassword,@RequestHeader String studentName,
		@RequestHeader	String studentCity,@RequestHeader String studentEmail) {
		
		boolean registrationStatus =studentService.registration(studentPassword, studentName, studentCity, studentEmail);
		if(registrationStatus==false) {
			return new ResponseEntity<String>(studregfailexcp.getMessage() ,HttpStatus.NOT_FOUND);}
		else {
			return new ResponseEntity<String>("Student Registered Successfully. Your default password is: password. Please change your password after login.",HttpStatus.OK);}
	}
		

	
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/addstudentcourse")
	@ResponseBody 
	public void addCourse(@RequestHeader int courseId,@RequestHeader int studentId) {
		 studentService.addCourse(courseId, studentId);
		System.out.println("Student Course Added Successfully ");
	
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.DELETE,value = "/dropcourse/{courseId}/{studentId}")
	@ResponseBody
	public void dropCourse(@PathVariable("courseId") int courseId,@PathVariable("studentId") int studentId){
		System.out.println("Deleted Course");
		studentService.dropCourse(courseId, studentId);		
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET, value = "/viewgrade/{studentId}")
	@ResponseBody
	public StudentGrade viewGrade(@PathVariable("studentId") int studentId) {
		 
		
		System.out.println("Display Courses");
		return studentService.viewGrades(studentId);
	}
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET, value = "/payment")
	@ResponseBody
	public PaymentType payFees(@RequestHeader int studentId,@RequestHeader int payId,@RequestHeader String payStatus,@RequestHeader double payAmount) {
		 
		
		//System.out.println("Display Courses");
		return studentService.payFees(studentId, payId, payStatus, payAmount);
	}
	
//	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
//			method = RequestMethod.POST, value = "/StudentLogin")
//	@ResponseBody 
//	public boolean Studentlogin(@RequestHeader int studentId,@RequestHeader String studentPassword
//		) throws SQLException {
//		
//		//return loginservice.Studentlogin(studentId, studentPassword);
//    }
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/StudentLogin") 
	@ResponseBody 
	public ResponseEntity<String> StudentLogin(@RequestHeader int studentId,@RequestHeader String studentPassword) throws IncorrectResultSizeDataAccessException{
		
		boolean flag =  studentloginService.StudentLogin(studentId, studentPassword);
		
		if(flag==false) {
			return new ResponseEntity<String>(studentLoginException.getMessage() ,HttpStatus.NOT_FOUND);}
		else {
			return new ResponseEntity<String>("Student Login Successful.",HttpStatus.OK);}
	}
		
	}

