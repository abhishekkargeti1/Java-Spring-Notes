package com.Entities;

public class Student {
	private int id;
	private String Name;
	private String Address;
	private String PhoneNumber;
	private String Gender;
	
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
	public void setAddress(String Address) {
		this.Address = Address;
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
		return "Student [id=" + id + ", Name=" + Name + ", Address=" + Address + ", PhoneNumber=" + PhoneNumber + ", Gender="
				+ Gender + "]";
	}
	
	
	
	
}
