/**
 * 
 */
package com.Neon.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Neon.Bean.Course;
import com.Neon.Bean.Professor;
import com.Neon.Bean.Registration;
import com.Neon.Service.AdminService;
import com.Neon.Service.AdminServiceImpl;

/**
 * @author user364
 *
 */

@RestController
public class AdminController {

	@Autowired
	private AdminServiceImpl adminServiceImpl;
	
	private static List<Professor> plist3=new ArrayList<>();
	private static List<Course> clist2=new ArrayList<>();
	private static List<Registration> rlist2=new ArrayList<>();
	
	
	/* add professor
	 * @RequestBody add professor object
	 * plist2 return professor list which is added
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.POST,value = "/addprofessor")
	@ResponseBody
	public ResponseEntity<List<Professor>> addProfessor(@RequestBody Professor professor){
		System.out.println("Professor Added");
		plist3=adminServiceImpl.addProfessor(professor);
		return ResponseEntity.ok().body(plist3);
	}
	
	/*
	 * method for add course
	 * @RequestBody course object added
	 * clist2 return course list which is added
	 */
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.POST,value = "/addcourse")
	@ResponseBody
	public ResponseEntity<List<Course>> addCourse(@RequestBody Course course){
		System.out.println("course Added");
		clist2=adminServiceImpl.addCourse(course);
		return ResponseEntity.ok().body(clist2);
	}
	
	/*
	 * @PathVariable remove course with courseId
	 * return msg with Deleted Course
	 */
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.DELETE,value = "/removecourse/{courseId}")
	@ResponseBody
	public ResponseEntity<String> removeCourse(@PathVariable("courseId") int courseId){
		System.out.println("Deleted Course");
		adminServiceImpl.removeCourse(courseId);
		return ResponseEntity.ok("Deleted Course");
	}
	
	/*
	 * method approve student registration
	 * @RequestBody add registration object
	 * return rlist2 registartion list
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.POST,value = "/approveregistration/{RegistStudId}")
	@ResponseBody
	public boolean approveRegistration(@PathVariable("RegistStudId") int RegistStudId){
		System.out.println("Registration Approved");
		//boolean flag=adminServiceImpl.approveRegistration(RegistStudId);
		return adminServiceImpl.approveRegistration(RegistStudId);
	}
}
