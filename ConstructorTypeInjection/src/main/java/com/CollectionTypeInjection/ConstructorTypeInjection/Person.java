package com.CollectionTypeInjection.ConstructorTypeInjection;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certificate c1;
	private List<String> list;
	public Person(String name,int id,Certificate c1,List<String> list) {
		this.name=name;
		this.id=id;
		this.c1=c1;
		this.list=list;
	}

	@Override
	public String toString() {
		
		return this.name +": "+this.id+" {"+this.c1.name+"}"+this.list;
	}
	
	
}
