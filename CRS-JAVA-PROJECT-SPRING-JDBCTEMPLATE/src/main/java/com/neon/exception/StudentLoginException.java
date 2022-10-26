package com.neon.exception;

import org.springframework.stereotype.Component;

@Component
public class StudentLoginException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "IncorrectResultSizeDataAccessException ";
	}
	
}
