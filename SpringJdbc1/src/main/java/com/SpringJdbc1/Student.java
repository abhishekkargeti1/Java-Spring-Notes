package com.SpringJdbc1;

public class Student {
	private int id;
	private String name;
	private String city;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String city,int id) {
		super();
		this.id=id;
		this.name = name;
		this.city = city;
	}


	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	

}
