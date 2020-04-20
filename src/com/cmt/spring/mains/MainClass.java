/**
 * 
 */
package com.cmt.spring.mains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author c.tripathi
 *
 */
public class MainClass {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EMailService service1 = context.getBean(EMailService.class);
		service1.send("c.tripathi@globallogic.com");

		EMailService service2 = context.getBean(EMailService.class);
		service2.send("cmttripathii@gmail.com");
		
		ICollegeService service = context.getBean(CollegeService.class);
		service.printCollMsg();

		context.close();
	}
}
