/**
 * 
 */
package com.cmt.spring.mains;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author c.tripathi
 *
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan(basePackages = "com.cmt.spring.mains")
public class AppConfig {

}
