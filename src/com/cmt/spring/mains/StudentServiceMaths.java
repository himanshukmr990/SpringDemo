/**
 * 
 */
package com.cmt.spring.mains;

import org.springframework.stereotype.Service;

/**
 * @author c.tripathi
 *
 */
@Service("studentServiceMaths")
public class StudentServiceMaths implements IStudentService {
	public void printStuMsg() {
		System.out.println("Print Maths Student Message");
	}
}
