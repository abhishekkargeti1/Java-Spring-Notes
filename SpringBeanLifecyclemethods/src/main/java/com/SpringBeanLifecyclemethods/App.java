package com.SpringBeanLifecyclemethods;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringBeanLifecyclemethods/Config.xml");
        Example e1=(Example)context.getBean("example");
        System.out.println(e1);
        context.registerShutdownHook();
    }
}
