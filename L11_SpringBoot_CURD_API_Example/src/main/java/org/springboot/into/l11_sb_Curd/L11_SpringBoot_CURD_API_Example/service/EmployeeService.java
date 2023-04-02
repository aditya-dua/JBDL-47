package org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.entity.Employee;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.CreateEmployeeRequestModel;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.CreateEmployeeResponseModel;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.DeleteEmployeeResponseModel;
import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model.GetAllEmployeesResponseModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
	public GetAllEmployeesResponseModel load() {
		
		Employee emp = new Employee(1, "Aditya", 1000, "a@a.com");
		
		employeeHM.put(emp.getId(), emp);
		
		emp = new Employee(2, "David", 1000, "a@a.com");
		
		employeeHM.put(emp.getId(), emp);
		
		emp = new Employee(3, "John", 1000, "a@a.com");
		
		employeeHM.put(emp.getId(), emp);
		
		emp = new Employee(4, "John", 1000, "a@a.com");
		
		employeeHM.put(emp.getId(), emp);
		
		return getAllEmployees();
	}
	
	public GetAllEmployeesResponseModel getAllEmployees() {
		
		ArrayList<Employee> empList = new ArrayList<>();
		GetAllEmployeesResponseModel response;
		
		if(employeeHM.isEmpty()) {
			response = new GetAllEmployeesResponseModel(303, "No Employees availablae.");
		}else {
			for(int key: employeeHM.keySet()) {
				empList.add(employeeHM.get(key));
			}
			response = new GetAllEmployeesResponseModel(200, "Employee List Fetched", empList);
		}
		
		return response;	
		
	}
	
	
	public DeleteEmployeeResponseModel deleteEmployeeById(int id) {
		
		DeleteEmployeeResponseModel response;
		
		if(employeeHM.isEmpty()) {
			response = new DeleteEmployeeResponseModel(303, "No Employees availablae.");
		}else if(!employeeHM.containsKey(id)){
			response = new DeleteEmployeeResponseModel(304, "ID Doesnot Exsists");
		}else {
			response = new DeleteEmployeeResponseModel(200, "Delete Success");
		}
		return response;
	}

}
