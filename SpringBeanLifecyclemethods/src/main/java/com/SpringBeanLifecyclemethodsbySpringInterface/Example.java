package com.SpringBeanLifecyclemethodsbySpringInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Example implements InitializingBean,DisposableBean {
	private  double price;
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Example [price=" + price + "]";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		 System.out.println("Hello I am Init Method");	
	}

	@Override
	public void destroy() throws Exception {
		 System.out.println("Hello i am Destroy method");
		
	}
	
	
	

	
	
}
