/**
 * 
 */
package com.cmt.spring.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author c.tripathi
 *
 */
@Component("college")
public class College {
	
//	@Autowired
	private Student student;
	
	public College() {
	}
	
	@Autowired
	public College(Student student) {
		this.student = student;
	}
	
	
	
	public void printMsg() {
		System.out.println("Print College Message");
		
		student.printMsg();
	}
	
	@Autowired
	public void setStudent(Student student) {
		this.student = student;
	}
}
