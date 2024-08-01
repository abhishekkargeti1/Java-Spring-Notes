package com.staticAndvariable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Example [num=" + num + "]";
	}
	
}
