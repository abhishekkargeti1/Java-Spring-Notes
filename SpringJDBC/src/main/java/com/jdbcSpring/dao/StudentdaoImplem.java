package com.jdbcSpring.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.Entities.Student;

public class StudentdaoImplem implements StudentDao{

	
	private JdbcTemplate temp;
	
	
	public JdbcTemplate getTemp() {
		return temp;
	}


	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}


	@Override
	public int insert(Student student) {
		String query = "insert into student (id,name,city) values(?,?,?)";
		int result=this.temp.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}


	@Override
	public int change(Student student) {
		 String query ="update student set name=?, city=? where id =?";
		 int result = this.temp.update(query,student.getName(),student.getCity(),student.getId());
		 return result;
	}


	@Override
	public int delete(Student student) {
		String query ="delete from student where id=?";
		int result = this.temp.update(query,student.getId());
		return result;
	}


	@Override
	public Student getdata(int id) {
		String query ="select * from student where id=?";
		RowMapper<Student> rowmapper = new RowMapperImp();
		Student s1 = this.temp.queryForObject(query,rowmapper,id);
 		return s1;
	}
	
}
