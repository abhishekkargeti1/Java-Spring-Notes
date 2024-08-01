package com.SterotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/SterotypeAnnotation/Config.xml");
        Student s1 =(Student)context.getBean("student");
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getCity());
        System.out.println(s1.getAddress());
    }
}
