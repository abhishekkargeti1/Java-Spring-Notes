package com.Dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Entities.Student;

public class studentImplement implements StudentDao {

	JdbcTemplate temp;
	
	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	@Override
	public Student select(int id) {
		String query ="select * from student where id=?";
		RowMapper<Student> Rowmapper = new RowmapperImplement();
		Student student = this.temp.queryForObject(query,Rowmapper,id);
		return student;
	}
	
}
