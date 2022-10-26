/**
 * 
 */
package com.neon.controller;


import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.bean.Registration;
import com.neon.service.AdminService;



/**
 * @author user364
 *
 */

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/addprofessor")
	@ResponseBody 
	public void addProfessor(@RequestHeader String pPassword,@RequestHeader String pName,@RequestHeader String pCity,@RequestHeader String pEmail) {
		 adminService.addProfessor(pPassword, pName, pCity, pEmail);
		 
		System.out.println("Professor Added");
	
	}
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/addcourse")
	@ResponseBody 
	public void addCourse(@RequestHeader String courseName) {
		 adminService.addCourse(courseName);
		 
		System.out.println("Course Added");
	
	}
	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.DELETE,value = "/removecourse/{courseId}")
	@ResponseBody
	public void removeCourse(@PathVariable("courseId") int courseId){
		System.out.println("Deleted Course");
		adminService.removeCourse(courseId);
		
	}
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET, value = "/approve/{studentId}")
	@ResponseBody
	public  boolean approveRegistration(@PathVariable("studentId") int studentId) {
	
		return adminService.approveRegistration(studentId);

	}
	
	
}
