/**
 * 
 */
package com.neon.exception;

import org.springframework.stereotype.Component;

/**
 * @author user364
 *
 */
@Component
public class AdminDeleteCourseFailException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You have entered wrong courseId.Please Enter correct courseId";
	}
}
