package com.QualifierAnnotation;

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
       ApplicationContext context = new ClassPathXmlApplicationContext("com/QualifierAnnotation/Config.xml");
       Employee e1=(Employee)context.getBean("employee");
       System.out.println(e1);
    }
}
