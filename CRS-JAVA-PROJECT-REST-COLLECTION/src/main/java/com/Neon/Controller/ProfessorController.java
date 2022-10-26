/**
 * 
 */
package com.Neon.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Neon.Bean.Course;
import com.Neon.Bean.Registration;
import com.Neon.Bean.StudentGrade;
import com.Neon.Service.ProfessorServiceImpl;

/**
 * @author user364
 *
 */

@RestController
public class ProfessorController {

	@Autowired
	private ProfessorServiceImpl professorServiceImpl;
	
	private static List<Course> clist2=new ArrayList<>();
	private static List<StudentGrade> glist2=new ArrayList<>();
	private static List<Registration> rlist2=new ArrayList<>();
	
	
	/*
	 * @ResponseBody view course
	 * clist2 return course list which is added by admin
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET, value = "/viewcourse")
	public @ResponseBody Iterable<Course> viewCourse() {
		 
		clist2 = professorServiceImpl.viewCourse();
		System.out.println("Display Courses");
		return clist2;
	}
	
	/*
	 * @ResponseBody return student grade
	 * @RequestBody add student grade
	 * glist2 return StudentGrade list
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/addgrade")
	public @ResponseBody Iterable<StudentGrade> addGrades(@RequestBody StudentGrade studentGrade) {
		 
		glist2 = professorServiceImpl.addGrades(studentGrade);
		System.out.println("Add Grades");
		return glist2;
	}
	
	/*
	 * @ResponseBody return registered student
	 * rlist2 return registered student
	 */
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET, value = "/viewregisteredstudents")
	public @ResponseBody Iterable<Registration> viewRegisteredStudents() {
		 
		rlist2 = professorServiceImpl.viewRegisteredStudents();
		System.out.println("view Registered Students");
		return rlist2;
}
}
