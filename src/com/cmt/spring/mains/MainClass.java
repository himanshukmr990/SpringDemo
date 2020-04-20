/**
 * 
 */
package com.cmt.spring.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author c.tripathi
 *
 */
public class MainClass {
	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("//Users/c.tripathi/training/code/cmt_spring/resources/appContext.xml");
		
		AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(AppConfig.class);
		 
//		HelloWorld myBean = (HelloWorld) context.getBean("helloWorld");
//        myBean.sayHello();
		
		EMailService service1 = context.getBean(EMailService.class);
		service1.send("c.tripathi@globallogic.com");
		
		EMailService service2 = context.getBean(EMailService.class);
		service2.send("cmtripathii@gmail.com");
        
        context.close();
	}
}
