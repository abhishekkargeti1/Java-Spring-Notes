package com.springCore.Property_Injection_Using_P_Schema;
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
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Example e1 =(Example)context.getBean("e");
        Example e2 =(Example)context.getBean("e1");
        Example e3 =(Example)context.getBean("e2");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        
    }
}
