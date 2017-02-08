package com.rupp.homework.dto;

import java.util.Date;

public class StudentDto {
	private String stu_code;  
	private String stu_name;   
	private String stu_gender;  
	private int stu_age;    
	private Date stu_db;   
	private String stu_address;
	public String getStu_code() {
		return stu_code;
	}
	public void setStu_code(String stu_code) {
		this.stu_code = stu_code;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_gender() {
		return stu_gender;
	}
	public void setStu_gender(String stu_gender) {
		this.stu_gender = stu_gender;
	}
	public int getStu_age() {
		return stu_age;
	}
	public void setStu_age(int stu_age) {
		this.stu_age = stu_age;
	}
	public Date getStu_db() {
		return stu_db;
	}
	public void setStu_db(Date stu_db) {
		this.stu_db = stu_db;
	}
	public String getStu_address() {
		return stu_address;
	}
	public void setStu_address(String stu_address) {
		this.stu_address = stu_address;
	}
	
	@Override
	public String toString() {
		return "StudentDto [stu_code=" + stu_code + ", stu_name=" + stu_name + ", stu_gender=" + stu_gender
				+ ", stu_age=" + stu_age + ", stu_db=" + stu_db + ", stu_address=" + stu_address + "]";
	} 

}
