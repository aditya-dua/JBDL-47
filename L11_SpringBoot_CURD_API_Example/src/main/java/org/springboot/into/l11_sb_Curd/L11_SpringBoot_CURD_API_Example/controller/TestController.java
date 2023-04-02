package org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public String test() {
		return "Test Controller API works!";
	}
}
