package org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model;

public class CreateEmployeeResponseModel {

	private int id;
	private String name;
	private int sal;
	private String email;
	private int code;
	private String message;
	
	
	
	@Override
	public String toString() {
		return "CreateEmployeeResponseModel [id=" + id + ", name=" + name + ", sal=" + sal + ", email=" + email
				+ ", code=" + code + ", message=" + message + "]";
	}
	
	public CreateEmployeeResponseModel(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public CreateEmployeeResponseModel(int id, String name, int sal, String email, int code, String message) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.email = email;
		this.code = code;
		this.message = message;
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
	public CreateEmployeeResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
