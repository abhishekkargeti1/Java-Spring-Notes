package com.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Entities.Student;

public class studentImplement implements StudentDao {
	@Autowired
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

	@Override
	public List<Student> getallstudent() {
		String query ="select * from student";
		RowMapper<Student>  rowmapper = new RowmapperImplement();
		List<Student> student = this.temp.query(query, rowmapper);
		return student;
	}
	
}
