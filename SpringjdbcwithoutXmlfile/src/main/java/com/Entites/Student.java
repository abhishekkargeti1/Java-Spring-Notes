package com.Entites;

public class Student {
	private int id;
	private String Name;
	private String City;
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
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", City=" + City + "]";
	}
	
	
	
}
