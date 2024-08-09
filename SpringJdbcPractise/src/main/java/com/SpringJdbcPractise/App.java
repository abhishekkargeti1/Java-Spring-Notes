package com.SpringJdbcPractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.Entities.Student;
import com.StudentDao.StudentImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringJdbcPractise/Config.xml");
        StudentImpl student1=(StudentImpl)context.getBean("student");
        Student s1 = new Student();
        s1.setId(1808);
        s1.setName("Abhishek");
        s1.setCity("Lucknow");
        int result = student1.update(s1);
        
        System.out.println("Row affected are "+result);
    }
}
