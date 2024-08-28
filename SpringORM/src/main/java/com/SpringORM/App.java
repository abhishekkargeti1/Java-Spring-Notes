package com.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Userdao;
import com.dao.Userdaoimp;
import com.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringORM/Config.xml");
		Userdaoimp userdaoimp = (Userdaoimp) context.getBean("userdao");

		/*
		 * Student student = new Student(18081,"Abhishek","Delhi","9643668742","Male");
		 * userdaoimp.insert(student); System.out.println("Done");
		 */

		/*
		 * try { int status = userdaoimp.updateData(18081, "Abhi"); } catch (Exception
		 * e) { e.printStackTrace(); } List<Student> student =
		 * userdaoimp.getData(18081); for (Student s1 : student) {
		 * System.out.println(s1); }
		 */
		try {
			List<Student> student=userdaoimp.getAllData();
			for (Student s1 : student) {
				System.out.println(s1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
