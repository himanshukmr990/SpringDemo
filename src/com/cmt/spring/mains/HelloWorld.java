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
	
	private int counter;
	
	public void sayHello() {
		System.out.println("Hello World.");
		System.out.println("Counter: "+ ++counter);
	}

}
