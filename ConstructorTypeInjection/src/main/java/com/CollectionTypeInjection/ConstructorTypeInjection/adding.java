package com.CollectionTypeInjection.ConstructorTypeInjection;

public class adding {
	private int a;
	private int b;
	
	public adding(double a, double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor Called double");
	}
	public adding(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor Called int ");
	}
	public adding(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor Called String ");
	}
	public void sum() {
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		
		System.out.println("Sum is "+(a+b));
	}
}
