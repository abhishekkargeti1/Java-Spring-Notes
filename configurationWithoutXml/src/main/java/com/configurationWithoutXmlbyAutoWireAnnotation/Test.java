package com.configurationWithoutXmlbyAutoWireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String []args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(configurationFile.class);
		Example e1 = (Example)context.getBean("Bean");
		System.out.println(e1);
		e1.display();
		
	}
}
