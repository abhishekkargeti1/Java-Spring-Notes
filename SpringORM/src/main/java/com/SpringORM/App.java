package com.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Userdao;
import com.dao.Userdaoimp;
import com.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	 * @param args
	 */
	public static void main( String[] args )
	{

			ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringORM/Config.xml");
			Userdaoimp userdaoimp=(Userdaoimp)context.getBean("userdao");
			Student student = new Student(18081,"Abhishek","Delhi","9643668742","Male");
			 userdaoimp.insert(student);
			System.out.println("Done");
		
	}
}
