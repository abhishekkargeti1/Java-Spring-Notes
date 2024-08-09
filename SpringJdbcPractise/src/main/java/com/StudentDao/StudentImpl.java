package com.StudentDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.Entities.Student;

public class StudentImpl implements Studentdao {

	private JdbcTemplate temp;

	public JdbcTemplate getTemp() {
		return temp;
	}
	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	@Override
	public int insert(Student student) {
		String query ="insert into student(id,name,city) values(?,?,?)";
		int result = this.temp.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}
	@Override
	public int update(Student student) {
		String query ="update student set name=?, city=? where id=?";
		int result = this.temp.update(query,student.getName(),student.getCity(),student.getId());
		return result;
	}
	

}
