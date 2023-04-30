package org.gfg.l18_sb_jpa.L18_SB_JPA.controller;

import java.util.List;

import org.gfg.l18_sb_jpa.L18_SB_JPA.entity.Employee;
import org.gfg.l18_sb_jpa.L18_SB_JPA.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("/test")
	public String test() {
		return "Test API works!";
	}
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		return employeeRepository.save(employee);
		
	}
	
	@RequestMapping("/findAll")
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
}
