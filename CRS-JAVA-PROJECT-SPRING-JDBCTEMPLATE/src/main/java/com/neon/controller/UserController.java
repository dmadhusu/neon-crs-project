/**
 * 
 */
package com.neon.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.exception.StudentLoginException;
import com.neon.service.UserService;

/**
 * @author user364
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private StudentLoginException studentLoginException;
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/StudentLogin") 
	@ResponseBody 
	public ResponseEntity<String> StudentLogin(@RequestHeader int studentId,@RequestHeader String studentPassword) throws IncorrectResultSizeDataAccessException{
		
		boolean flag =  userService.studentLogIn(studentId, studentPassword);
		
		if(flag==false) {
			return new ResponseEntity<String>(studentLoginException.getMessage() ,HttpStatus.NOT_FOUND);}
		else {
			return new ResponseEntity<String>("Student Login Successful.",HttpStatus.OK);}
	}
		
}
