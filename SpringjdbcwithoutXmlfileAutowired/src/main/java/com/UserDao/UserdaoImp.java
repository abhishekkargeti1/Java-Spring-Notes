package com.UserDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.Entites.Student;
@Component("userdao")
public class UserdaoImp implements UserDao {
	
	@Autowired
	JdbcTemplate temp;
	
	public JdbcTemplate getTemp() {
		return temp;
	}
	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	@Override
	public int insert(Student student) {
		String query ="insert into student (id,name,city) values (?,?,?)";
		int result = this.temp.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}
	
	@Override
	public List<Student> getAllStudent() {
		String query ="select * from student";
		RowMapper<Student> rowmapper = new RowMapperImp();
		List<Student> student = this.temp.query(query, rowmapper);
		return student;
	}
	@Override
	public int update(Student student) {
		String query ="update student set name=? , city=? where id=?";
		int result  = this.temp.update(query,student.getName(),student.getCity(),student.getId());
		return result;
	}
	

}
