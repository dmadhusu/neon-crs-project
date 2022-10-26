/**
 * 
 */
package com.neon.exception;

/**
 * @author user364
 *
 */

import org.springframework.stereotype.Component;

	@Component
	public class StudentCourseRegistrationFailException extends Exception {
		/**
		 * @exception StudentCourseRegistrationFailException
		 */
		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return "Dear Student, your registration to the course could not be completed. Please try again later.";
		}
	}

