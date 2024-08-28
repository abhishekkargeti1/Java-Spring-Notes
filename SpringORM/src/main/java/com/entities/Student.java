package com.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details2")
public class Student {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="Name")
	private String Name;
	@Column(name="Address")
	private String Address;
	@Column(name="PhoneNumber")
	private String PhoneNumber;
	@Column(name="Gender")
	private String Gender;
	

	public Student(int id, String name, String address, String phoneNumber, String gender) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		PhoneNumber = phoneNumber;
		Gender = gender;
	}

	public Student() {
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
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Address=" + Address + ", PhoneNumber=" + PhoneNumber
				+ ", Gender=" + Gender + "]";
	}
	
	
	
	
	
	
}
