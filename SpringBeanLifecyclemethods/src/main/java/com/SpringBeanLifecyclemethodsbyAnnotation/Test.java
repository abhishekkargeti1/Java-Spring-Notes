package com.SpringBeanLifecyclemethodsbyAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
			
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringBeanLifecyclemethodsbyAnnotation/Config.xml");
		Example e1=(Example)context.getBean("example");
		System.out.println(e1);
		context.registerShutdownHook();

	}

}
