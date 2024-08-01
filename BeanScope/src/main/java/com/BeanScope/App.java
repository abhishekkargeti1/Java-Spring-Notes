package com.BeanScope;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/BeanScope/Config.xml");
        Student s1 =(Student)context.getBean("student");
        Student s2 =(Student)context.getBean("student");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("-------------------------------------------------");
        Example e1 =(Example)context.getBean("example");
        Example e2 =(Example)context.getBean("example");
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
