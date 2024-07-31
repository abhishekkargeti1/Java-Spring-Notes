package com.SpringBeanLifecyclemethodsbySpringInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringBeanLifecyclemethodsbySpringInterface/Config.xml");
		Example e1 =(Example)context.getBean("example");
		System.out.println(e1);
		context.registerShutdownHook();
	}

}
