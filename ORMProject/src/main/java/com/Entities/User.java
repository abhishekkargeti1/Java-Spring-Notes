package com.Entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SpringORMProject")
public class User {

	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="PhoneNumber")
	private String PhoneNumber;
	
	@Column(name="Gender")
	private String gender;
	
	
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public User(int id, String name, String address, String phoneNumber, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		PhoneNumber = phoneNumber;
		this.gender = gender;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", PhoneNumber=" + PhoneNumber
				+ ", gender=" + gender + "]";
	}
	
	
	
	

}
