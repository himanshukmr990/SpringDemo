/**
 * 
 */
package com.cmt.spring.mains;

import org.springframework.stereotype.Component;

/**
 * @author c.tripathi
 *
 */
@Component("helloWorld") 
public class HelloWorld {
	
	public void sayHello() {
		System.out.println("Hello World.");
	}

}
