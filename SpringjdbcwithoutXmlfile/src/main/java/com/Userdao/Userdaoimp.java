package com.Userdao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Entities.Student;

public class Userdaoimp implements Useerdao {

	
	JdbcTemplate temp;
	
	
	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	@Override
	public int insert(Student student) {
		String query ="insert into user_details (id,Name,Address,PhoneNumber,Gender) values (?,?,?,?,?)";
		int result = this.temp.update(query,student.getId(),student.getName(),student.getAddress(),student.getPhoneNumber(),student.getGender());
		return result;
	}

	@Override
	public int change(Student student) {
		String query ="update user_details set name =? , PhoneNumber =? where id=?";
		int result  = this.temp.update(query,student.getName(),student.getPhoneNumber(),student.getId());
		return result ;
	}

	@Override
	public int delete(Student student) {
		String query ="delete  from user_details where id=?";
		int result = this.temp.update(query,student.getId());
		return result;
	}

	@Override
	public Student getuserid(int id) {
		String query ="select * from user_details where id =?";	
		RowMapper<Student> rowmapper = new RowMapperImpl();
		Student student = this.temp.queryForObject(query, rowmapper,id);
		return student;
	}

	@Override
	public List<Student> getAllData() {
		String query = "select * from user_details";
		RowMapper<Student> rowmapper = new RowMapperImpl();
		List<Student> student = this.temp.query(query,rowmapper); 
		return student;
	}

}
