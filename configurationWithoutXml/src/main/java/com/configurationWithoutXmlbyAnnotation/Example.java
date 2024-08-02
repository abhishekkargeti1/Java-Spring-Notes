package com.configurationWithoutXmlbyAnnotation;

public class Example {
	private Test test;
	
	public Example(Test test) {
		super();
		this.test = test;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public void Study(){
		test.display();
		System.out.println("Hello i am Studying");
	}
	
}
