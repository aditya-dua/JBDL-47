package org.gfg.l20_swagger_sb.L20_Swagger_SB;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/post")
	public Student createStudent(@RequestBody Student student) {
		
		return student;
	}
	
	@RequestMapping("/dummy/{id}")
	public String dummyAPI(@PathVariable int id, @RequestParam String username ){
		
		if(username==null) {
			return "Hello Guest "+id+" ,";
		}else {
			
			return "Hello" +username+" "+id;
		}
		
		
		
	}
}
