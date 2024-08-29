package com.ORMProject;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Dao.UserDaoimp;
import com.Entities.User;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/ORMProject/Config.xml");

		UserDaoimp userdao = (UserDaoimp) context.getBean("userdao");
		Scanner sc = new Scanner(System.in);
		boolean value = true;
		while(value) {
			System.out.println("****************Welcome to Spring ORM Console Project********************");
			System.out.println();
			System.out.println("Press 1 to insert data in DataBase");
			System.out.println("Press 2 to get data by id  from DataBase");
			System.out.println("Press 3 to get all data from DataBase");
			System.out.println("Press 4 to delete data from DataBase");
			System.out.println("Press 5 to update data in DataBase");
			System.out.println("Press 6 to exit");

			int userInput = sc.nextInt();

			switch (userInput) {
			case 1:
				System.out.println("Enter Id");
				int id = sc.nextInt();
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter Address");
				String address = sc.next();
				System.out.println("Enter Phone-Number");
				String phoneNumber = sc.next();
				System.out.println("Enter Gender");
				String gender = sc.next();

				User details = new User(id, name, address, phoneNumber, gender);
				userdao.insert(details);
				try {
					System.out.println("Data Registered succussfully");
					break;
				} catch (Exception e) {
					System.out.println("Data not Registered Successfully");
					e.printStackTrace();
					break;
				}
			case 2:
				System.out.println("Enter Id");
				int id1 = sc.nextInt();
				User details1 = userdao.getDetailsById(id1);
				System.out.println(details1);
				break;
			case 3:
				List<User> userdata = userdao.getAllData();
				for (User u1 : userdata) {
					System.out.println("Name = "+u1.getName()+" Address = "+u1.getAddress()+" PhoneNumber = "+u1.getPhoneNumber()+" Gender = "+u1.getGender() );
				}
				break;
			case 4:
				System.out.println("Enter Id");
				int id2 = sc.nextInt();
				try {
					userdao.delete(id2);
					System.out.println("Deleted Successfully");
					break;
				} catch (Exception e) {
					System.out.println("Error");
					e.printStackTrace();
					break;
				}
			case 5:
				System.out.println("Enter Id");
				int id3 = sc.nextInt();
				System.out.println("Enter Name");
				String name1 = sc.next();
				try {
					userdao.change(id3, name1);
					System.out.println("Data Registered succussfully");
					break;
				} catch (Exception e) {
					System.out.println("Data not Registered Successfully");
					e.printStackTrace();
					break;
				}
			case 6:
				value = false;
				break;

			default:
				System.out.println("Please Enter Valid Input");
			}
		}

	
	}
}
