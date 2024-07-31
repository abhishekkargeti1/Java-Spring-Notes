package com.SpringStandaloneCollection;


import java.util.List;

public class Employee {
	private List<String> list;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(List<String> list) {
		super();
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Employee [list=" + list + "]";
	}
	
	
	
}
