package org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.service;

import java.util.HashMap;

import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.entity.Employee;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.CreateEmployeeRequestModel;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.CreateEmployeeResponseModel;

public class EmployeeService {
	
	/*
	 * This service has following functions:
	 * 1. Get All Employees
	 * 2. Create a new Employee
	 */
	
	HashMap<Integer, Employee> employeeHM = new HashMap<>();
	
	public CreateEmployeeResponseModel addEmployee(CreateEmployeeRequestModel emp) {
		
		CreateEmployeeResponseModel response;
		if(employeeHM.containsKey(emp.getId())) {
			
			response = new CreateEmployeeResponseModel(301, "Employee Already Exists.");
		
		}else if(emp.getName()== null || emp.getName().equals("")){
		
			response = new CreateEmployeeResponseModel(302, "Employee Name cannot be Empty.");
		
		}else {
			
			Employee e = new Employee(emp.getId(), emp.getName(), emp.getSal(), emp.getEmail());
			employeeHM.put(emp.getId(), e);
			response = new CreateEmployeeResponseModel(emp.getId(), emp.getName(), emp.getSal(), emp.getEmail(),200, "Employee Creation Success.");
		
		}
		
		return response;
		
	}

}
