package com.ExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{20+11}")
	private int x;
	@Value("#{12+10}")
	private int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
