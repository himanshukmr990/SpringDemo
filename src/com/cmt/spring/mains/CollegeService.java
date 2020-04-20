/**
 * 
 */
package com.cmt.spring.mains;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author c.tripathi
 *
 */
@Service("collegeService")
public class CollegeService implements ICollegeService {
	
	private IStudentService studentService;
	
//	private IStudentService ss;
//	private IStudentService ssm;

	
	public CollegeService() {
	}
	
	@Autowired
	public CollegeService(IStudentService studentService) {
		this.studentService = studentService;
	}
	
	
	
	public void printCollMsg() {
		System.out.println("Print College Message");
		
		this.studentService.printStuMsg();
//		this.ssm.printStuMsg();
	}
	
//	@Autowired
//	@Qualifier("studentService")
//	public void setSs(IStudentService ss) {
//		this.ss = ss;
//	}
//	
//	@Autowired
//	@Qualifier("studentServiceMaths")
//	public void setSsm(IStudentService ssm) {
//		this.ssm = ssm;
//	}
}
