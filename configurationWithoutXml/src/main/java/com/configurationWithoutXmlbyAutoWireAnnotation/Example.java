package com.configurationWithoutXmlbyAutoWireAnnotation;

public class Example {
	private Example1 example1;
	
	public Example(Example1 example1) {
		this.example1 = example1;
	}

	public Example1 getExample1() {
		return example1;
	}

	public void setExample1(Example1 example1) {
		this.example1 = example1;
	}
	
	public void display() {
		example1.display();
		System.out.println("Hello i am display of example class");
	}
	
}
