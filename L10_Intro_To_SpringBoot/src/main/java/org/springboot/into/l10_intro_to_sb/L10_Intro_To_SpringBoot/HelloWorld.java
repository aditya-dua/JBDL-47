package org.springboot.into.l10_intro_to_sb.L10_Intro_To_SpringBoot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "Test API works";
	}
	
	@RequestMapping("/message/{name}")
	public String message(@PathVariable String name) {
		return "Hello "+name;
	}
	@RequestMapping("/message")
	public String messageParam(@RequestParam String name) {
		return "Hello "+name;
	}
}
