/**
 * 
 */
package com.neon.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.neon.bean.Professor;

/**
 * @author user364
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Professor> plist=new ArrayList<>();
		plist.add(new Professor(101, "pro", "Venkat", "Nagpur", "venkat@gmail.com"));
		plist.add(new Professor(102, "pro", "Ashok", "Nashik", "ashok@gmail.com"));
		plist.add(new Professor(102, "pro", "Ashok", "Nashik", "ashok@gmail.com"));
		
		
		for(int i=0;i<plist.size();i++) {
			
		}
		plist=plist.stream().distinct().collect(Collectors.toList());
		//plist.add(professor);
		System.out.println(plist);
	}

}
