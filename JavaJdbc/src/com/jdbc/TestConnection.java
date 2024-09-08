package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/ducatdatabase","root","1808");
			/*
			 * String
			 * query="create table student (id int, name varchar(200),address varchar(200))"
			 * ; Statement stmt=con.createStatement(); stmt.execute(query);
			 * System.out.println("Table created");
			 */
			
			String query ="insert into student (id,name,address) values (1808,'Abhishek','delhi')";
			Statement stmt=con.createStatement();
			int result =stmt.executeUpdate(query);
			if(result==1) {
				System.out.println("Data Insert Successfully");
			}else {
				System.out.println("Error While inserting data");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
