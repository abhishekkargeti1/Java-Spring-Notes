package com.Entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User_Details {
	
	private String user_name;
	
	private String user_email;
	private String user_password;
	private String user_gender;
	@DateTimeFormat(pattern = "mm/dd/yyyy")
	private Date user_DOB;
	private String user_course;
	private String user_type;
	private Address address;

	public User_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_Details(String user_name, String user_email, String user_password,
			String user_gender, Date user_DOB, String user_course, String user_type) {
		super();
		this.user_name = user_name;
		
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_gender = user_gender;
		this.user_DOB = user_DOB;
		this.user_course = user_course;
		this.user_type = user_type;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public Date getUser_DOB() {
		return user_DOB;
	}

	public void setUser_DOB(Date user_DOB) {
		this.user_DOB = user_DOB;
	}

	public String getUser_course() {
		return user_course;
	}

	public void setUser_course(String user_course) {
		this.user_course = user_course;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User_Details [user_name=" + user_name + ", user_email=" + user_email + ", user_password="
				+ user_password + ", user_gender=" + user_gender + ", user_DOB=" + user_DOB + ", user_course="
				+ user_course + ", user_type=" + user_type + ", address=" + address + "]";
	}

	
	
	

}
