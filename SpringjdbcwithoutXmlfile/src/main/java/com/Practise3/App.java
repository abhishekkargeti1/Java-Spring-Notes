package com.Practise3;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Entities.Student;
import com.Userdao.Userdaoimp;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Userdaoimp userdao = (Userdaoimp) context.getBean("userdao");

		Student s1 = new Student();
		s1.setId(1808);
		s1.setName("Abhishek");
		s1.setAddress("Delhi");
		s1.setPhoneNumber("9643668742");
		s1.setGender("Male");

		int insert = userdao.insert(s1);
		System.out.println("Row affected are " + insert);
		System.out.println("-----------------------------");

		s1.setName("Test");
		s1.setPhoneNumber("22471420");
		s1.setId(1808);
		int change = userdao.change(s1);
		System.out.println("Row affected " + change);
		System.out.println("-----------------------------");

		/*
		 * s1.setId(1808); int delete = userdao.delete(s1);
		 * System.out.println("Row affected " + delete);
		 */
		System.out.println("-----------------------------");
		
		
		Student student = userdao.getuserid(7894);
		
		System.out.println(student);
		System.out.println("-----------------------------");
		
		List<Student> s = userdao.getAllData();
		for (Student student1 : s) {
			System.out.println(student1);
		}
	}
}
