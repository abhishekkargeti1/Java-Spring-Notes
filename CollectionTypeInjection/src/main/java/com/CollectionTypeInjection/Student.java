package com.CollectionTypeInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String employeeName;
	private List<String> Phones;
	private Set<String> Address;
	private Map<String, String> Courses;
	private Properties prop;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String employeeName, List<String> phones, Set<String> address, Map<String, String> courses,
			Properties prop) {
		super();
		this.employeeName = employeeName;
		Phones = phones;
		Address = address;
		Courses = courses;
		this.prop = prop;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<String> getPhones() {
		return Phones;
	}

	public void setPhones(List<String> phones) {
		Phones = phones;
	}

	public Set<String> getAddress() {
		return Address;
	}

	public void setAddress(Set<String> address) {
		Address = address;
	}

	public Map<String, String> getCourses() {
		return Courses;
	}

	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}

}
