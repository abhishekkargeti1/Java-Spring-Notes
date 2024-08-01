package com.createObject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {
	@Value("#{new java.lang.String('Abhishek Kargeti')}")
	private  String name;
	@Value("#{8<3}")
	private boolean value;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Example [name=" + name + ", value=" + value + "]";
	}


	
	
}
