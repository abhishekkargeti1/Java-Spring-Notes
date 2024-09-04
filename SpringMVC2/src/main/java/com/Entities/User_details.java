package com.Entities;

public class User_details {
	private String user_name;
	private String user_address;
	private String user_email;
	private String user_password;
	
	public User_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_details(String user_name, String user_address, String user_email, String user_password) {
		super();
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_email = user_email;
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
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

	@Override
	public String toString() {
		return "User_details [user_name=" + user_name + ", user_address=" + user_address + ", user_email=" + user_email
				+ ", user_password=" + user_password + "]";
	}
	
	
	
	
}
