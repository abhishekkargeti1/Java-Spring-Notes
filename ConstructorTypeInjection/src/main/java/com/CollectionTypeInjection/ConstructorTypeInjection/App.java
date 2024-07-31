package com.CollectionTypeInjection.ConstructorTypeInjection;

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
       ApplicationContext context =new ClassPathXmlApplicationContext("com/CollectionTypeInjection/ConstructorTypeInjection/Config.xml");
       Person p=(Person)context.getBean("person");
       adding a=(adding)context.getBean("add");
       a.sum();
       System.out.println(p);
       
    }
}
