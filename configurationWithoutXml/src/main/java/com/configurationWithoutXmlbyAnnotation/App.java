package com.configurationWithoutXmlbyAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(configurationFile.class);
       Example e1=(Example)context.getBean("getBean");
       System.out.println(e1);
       e1.Study();
    }
}
