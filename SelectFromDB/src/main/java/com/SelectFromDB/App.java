package com.SelectFromDB;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entities.Student;
import com.UserDao.studentImplement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/SelectFromDB/Config.xml");
    	studentImplement student=(studentImplement)context.getBean("student");
    	Student s1 = student.getStudent(1808);
    	System.out.println("Student Details "+s1);
    	
    	
    }
}
