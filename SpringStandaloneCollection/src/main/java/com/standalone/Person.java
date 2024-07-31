package com.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String,Integer> CousreFee; 
	private Properties property;
	
	
	

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	public Map<String, Integer> getCousreFee() {
		return CousreFee;
	}

	public void setCousreFee(Map<String, Integer> cousreFee) {
		CousreFee = cousreFee;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", CousreFee=" + CousreFee +",Property="+property+ "]";
	}

	
	
	
	
}
