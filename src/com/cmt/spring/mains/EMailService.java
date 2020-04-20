/**
 * 
 */
package com.cmt.spring.mains;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

/**
 * @author c.tripathi
 *
 */
@Service
public class EMailService {
	private Map<String, String> map = null;
	
	private int counter;

	public EMailService() {
		map = new HashMap<>();
	}

	public void send(String toAdd) {
		// Code for sending mail
		System.out.println("Inside send method - " + toAdd);
		System.out.println("Inside send method - counter - " + ++counter);
	}

	@PostConstruct
	public void init() {
		map.put("host", "mail.cmt.com");
		map.put("port", "25");
		map.put("from", "test@cmt.com");
		System.out.println("Inside init method - " + map);
		System.out.println("Inside init method - counter - " + ++counter);
	}

	@PreDestroy
	public void destroy() {
		map.clear();
		System.out.println("Inside destroy method - " + map);
		System.out.println("Inside destroy method - counter - " + ++counter);
	}
}
