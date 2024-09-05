package com.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="springmvcwithorm")
public class userDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="Name")
	private String user_name;
	@Column(name="Address")
	private String user_address;
	@Column(name="Email")
	private String user_email;
	@Column(name="Password")
	private String user_password;
	
	public userDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public userDetails(String user_name, String user_address, String user_email, String user_password) {
		super();
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_email = user_email;
		this.user_password = user_password;
	}


	public userDetails(int id, String user_name, String user_address, String user_email, String user_password) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_email = user_email;
		this.user_password = user_password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "userDetails [id=" + id + ", user_name=" + user_name + ", user_address=" + user_address + ", user_email="
				+ user_email + ", user_password=" + user_password + "]";
	}
	
	
	
	

}
