/**
 * 
 */
package com.cmt.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author c.tripathi
 *
 */
@Controller
public class HelloWorldController {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Hello World</h3>This message is coming from HelloWorldController.java</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
