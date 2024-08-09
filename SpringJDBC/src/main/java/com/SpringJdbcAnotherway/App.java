package com.SpringJdbcAnotherway;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jdbcSpring.dao.StudentdaoImplem;
import com.spring.Entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the id which should be delete ");
    	int userInput= sc.nextInt();
       ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringJdbcAnotherway/Config.xml");
       StudentdaoImplem s1=(StudentdaoImplem)context.getBean("studentdao");
       Student student = new Student();
       student.setId(userInput);
       int result =s1.delete(student);
       System.out.println("Row Affected are "+result);
       
       
    }
    
}
