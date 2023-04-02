package org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.controller;

import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.CreateEmployeeRequestModel;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.CreateEmployeeResponseModel;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	EmployeeService empService = new EmployeeService();
	
	@RequestMapping("test")
	public String test() {
		return "Employee Test Works!";
	}
	
	@RequestMapping("create")
	public CreateEmployeeResponseModel createEmployee(@RequestBody CreateEmployeeRequestModel employee) {
		return empService.addEmployee(employee);
	}
}
