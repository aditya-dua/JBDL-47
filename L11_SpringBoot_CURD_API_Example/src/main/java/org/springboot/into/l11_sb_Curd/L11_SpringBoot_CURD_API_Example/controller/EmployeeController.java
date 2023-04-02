package org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.controller;

import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.entity.Employee;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.CreateEmployeeRequestModel;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.CreateEmployeeResponseModel;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.DeleteEmployeeResponseModel;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.GetAllEmployeesResponseModel;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.service.EmployeeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@RequestMapping("load")
	public GetAllEmployeesResponseModel load() {
		
		
		return empService.load();
	}
	
	@PostMapping("create")
	public CreateEmployeeResponseModel createEmployee(@RequestBody CreateEmployeeRequestModel employee) {
		return empService.addEmployee(employee);
	}
	
	@RequestMapping("get/all")
	public GetAllEmployeesResponseModel getAllEmployees() {
		return empService.getAllEmployees();
	}
	
	@RequestMapping("get/{id}")
	public GetAllEmployeesResponseModel getAllEmployees(@PathVariable int id) {
		return empService.getAllEmployees();
	}
	
	@DeleteMapping("delete/{id}")
	public DeleteEmployeeResponseModel deleteEmployeeById(@PathVariable int id) {
		return empService.deleteEmployeeById(id);
	}
	
}
