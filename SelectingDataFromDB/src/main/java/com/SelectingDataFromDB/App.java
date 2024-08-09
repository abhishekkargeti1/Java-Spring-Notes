package com.SelectingDataFromDB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Dao.studentImplement;
import com.Entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/SelectingDataFromDB/Config.xml");
       studentImplement s1=(studentImplement)context.getBean("student");
       Student s = s1.select(1808);
       System.out.println(s);
    }
}
