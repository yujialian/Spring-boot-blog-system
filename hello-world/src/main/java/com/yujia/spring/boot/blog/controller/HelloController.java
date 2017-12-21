/**
 * 
 */
package com.yujia.spring.boot.blog.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Hello controller
 * @author yujialian
 *
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello world!";
	}
}
