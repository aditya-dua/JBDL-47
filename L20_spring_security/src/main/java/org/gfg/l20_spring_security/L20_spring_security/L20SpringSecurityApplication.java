package org.gfg.l20_spring_security.L20_spring_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class L20SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(L20SpringSecurityApplication.class, args);
	}
	
	@GetMapping("/")
	public String test() {
		return "Test API works!";
	}

}
