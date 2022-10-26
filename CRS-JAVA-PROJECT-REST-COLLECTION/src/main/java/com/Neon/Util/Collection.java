/**
 * 
 */
package com.Neon.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.Neon.Bean.Course;
import com.Neon.Bean.Professor;
import com.Neon.Bean.Registration;
import com.Neon.Bean.Student;
import com.Neon.Bean.StudentGrade;

/**
 * @author user364
 *
 */
@Component
public class Collection {

	public  List<Professor> plist=new ArrayList<>();
	public  List<Course> clist=new ArrayList<>();
	public List<StudentGrade> glist=new ArrayList<>();
	public List<Registration> rlist=new ArrayList<>();
	public List<Student> slist=new ArrayList<>();
	Student student=new Student();
	Registration registration=new Registration();
	public List<Course> getClist() {
		return clist;
	}
	public void setClist(List<Course> clist) {
		this.clist = clist;
	}
	
	
	public List<Professor> addProfessor(Professor professor) {
		plist.add(new Professor(101, "pro", "Venkat", "Nagpur", "venkat@gmail.com"));
		plist.add(new Professor(102, "pro", "Ashok", "Nashik", "ashok@gmail.com"));
		
		plist.add(professor);
		System.out.println("Professor Record Insert Successfully");
		return plist;
	}
	public List<Course> Course(Course course) {
		clist.add(new Course(1, "Java"));
		clist.add(new Course(2, "Python"));
		clist.add(new Course(3, "Spring"));
		clist.add(new Course(4, "Hibernate"));
		clist.add(new Course(5, "JDBC"));
		clist.add(course);
		return clist;
	}
	public String removeCourse(int courseId) {
		clist=clist.stream().filter(course ->course.equals(courseId)).collect(Collectors.toList());
		return "Deleted Course";
	}
	public List<StudentGrade> addGrades(StudentGrade studentGrade) {
		glist.add(new StudentGrade(111, "A"));
		glist.add(new StudentGrade(222, "B"));
		glist.add(new StudentGrade(333, "C"));
		glist.add(new StudentGrade(444, "D"));
		glist.add(studentGrade);
		return glist;
	}
	public List<Registration> viewRegisteredStudents() {
		rlist.add(new Registration(111, "Registered"));
		rlist.add(new Registration(222, "Registered"));
		rlist.add(new Registration(333, "Registered"));
		rlist.add(new Registration(444, "Registered"));
		return rlist;
	}
	public boolean approveRegistration(int RegistStudId) {
		slist.add(new Student(111, "stu", "Madhu", "dande", "Pune", "IT", "Male"));
		slist.add(new Student(555, "stu", "Rohit", "Sharma", "Mumbai", "Comp", "Male"));
		rlist.add(new Registration(111, "Registered"));
		if(student.getStudentId()!=registration.getRegistStudId()) {
			return false;
		}else {
			return true;
		}
//		rlist.add(registration);
//		System.out.println("Approved Registration ");
		
//		System.out.println("Registered" +registration.getRegistStudId());
//		System.out.println(registration.getRegistStatus());
//		if(registration.getRegistStatus()=="Not Registered"){
//			return true;
//		}else {
//			return false;
//		}
		//return rlist;
	}
	

}
