/**
 * 
 */
package com.cmt.spring.mains;

import org.springframework.stereotype.Service;

/**
 * @author c.tripathi
 *
 */
@Service("studentService")
public class StudentService implements IStudentService {
	public void printStuMsg() {
		System.out.println("Print Student Message");
	}
}
