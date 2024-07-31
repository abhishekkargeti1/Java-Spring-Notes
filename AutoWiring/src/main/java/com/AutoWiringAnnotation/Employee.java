package com.AutoWiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(Address address) {
		super();
		System.out.println("I am Constructor");
		this.address = address;
	}



	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		System.out.println("I am setter");
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
