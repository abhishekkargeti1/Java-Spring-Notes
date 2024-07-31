package com.SpringBeanLifecyclemethods;

public class Example {
	
	private double price;
	
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Property ");
		this.price = price;
	}
	@Override
	public String toString() {
		return "Example price=" + price + "";
	}
	
	public void init() {
		System.out.println("Inside Init Method");
	}
	public void destroy() {
		System.out.println("Inside destroy method");
	}

}
