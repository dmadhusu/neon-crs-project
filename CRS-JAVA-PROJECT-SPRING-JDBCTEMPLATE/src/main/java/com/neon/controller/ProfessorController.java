/**
 * 
 */
package com.neon.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.bean.Course;
import com.neon.bean.Registration;
import com.neon.service.ProfessorService;


/**
 * @author user364
 *
 */

@RestController
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;
	
	List<Course> list=new ArrayList<>();
	List<Registration> registerlist=new ArrayList<>();
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET, value = "/viewcourse")
	public @ResponseBody Iterable<Course> viewCourse() {
		 
		list = professorService.viewCourse();
		System.out.println("Display Courses");
		return list;
	}
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/addgrade")
	@ResponseBody 
	public void addCourse(@RequestHeader int studentId,@RequestHeader String sGrade) {
		 professorService.addGrades(studentId, sGrade);
		 
		System.out.println("Student Grade Added Successfully ");
	
	}

@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET, value = "/viewregistartion")
	public @ResponseBody Iterable<Registration> viewRegisteredStudents() {
		 
		registerlist = professorService.viewRegisteredStudents();
		System.out.println("Display Registration");
		return registerlist;
	}
}
