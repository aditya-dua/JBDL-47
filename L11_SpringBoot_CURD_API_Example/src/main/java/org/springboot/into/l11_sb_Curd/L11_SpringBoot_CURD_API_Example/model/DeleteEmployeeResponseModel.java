package org.springboot.into.l11_sb_Curd.L11_SpringBoot_CURD_API_Example.model;

public class DeleteEmployeeResponseModel {
	
	private int code;
	private String mesage;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMesage() {
		return mesage;
	}
	public void setMesage(String mesage) {
		this.mesage = mesage;
	}
	public DeleteEmployeeResponseModel(int code, String mesage) {
		super();
		this.code = code;
		this.mesage = mesage;
	}
	public DeleteEmployeeResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
