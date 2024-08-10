package com.SelectingDataFromDB;

import java.util.List;

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
       List<Student> data = s1.getallstudent();
       for(Student s :data) {
    	   System.out.println(s);
       }
    }
}
