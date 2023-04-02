package org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model;

import java.util.List;

import org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.entity.Employee;

public class GetAllEmployeesResponseModel {

	private int code;
	private String message;
	private List<Employee> employees;
	
	public GetAllEmployeesResponseModel(int code, String message, List<Employee> employees) {
		super();
		this.code = code;
		this.message = message;
		this.employees = employees;
	}
	public GetAllEmployeesResponseModel(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public GetAllEmployeesResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
