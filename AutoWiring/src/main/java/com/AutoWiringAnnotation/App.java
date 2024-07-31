package com.AutoWiringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/AutoWiringAnnotation/Config.xml");
        Employee e1=(Employee)context.getBean("employee");
        System.out.println(e1);
    }
}
	