/**
 * 
 */
package com.cmt.spring.mains;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author c.tripathi
 *
 */
@Component
@Aspect
public class CollegeServiceAspect {

	@Before("execution(* ICollegeService.printCollMsg())") // point-cut expression
	public void logPrintCollMsg(JoinPoint joinPoint) {
		System.out.println("ICollegeService.logPrintCollMsg() : " + joinPoint.getSignature().getName());
	}
	
}
