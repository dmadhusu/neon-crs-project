/**
 * 
 */
package com.Neon.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Neon.Bean.Course;
import com.Neon.Bean.Registration;
import com.Neon.Bean.StudentGrade;
import com.Neon.Dao.ProfessorDaoImpl;

/**
 * @author user364
 *
 */
@Service
public class ProfessorServiceImpl implements ProfessorService {

	@Autowired
	private ProfessorDaoImpl professorDaoImpl;
	
	@Override
	public List<Course> viewCourse() {
		
		return professorDaoImpl.viewCourse();
	}

	@Override
	public List<StudentGrade> addGrades(StudentGrade studentGrade) {
		
		return professorDaoImpl.addGrades(studentGrade);
	}

	@Override
	public List<Registration> viewRegisteredStudents() {
		
		return professorDaoImpl.viewRegisteredStudents();
	}

}
