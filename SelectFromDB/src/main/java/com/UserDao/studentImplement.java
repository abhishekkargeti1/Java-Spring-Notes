package com.UserDao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Entities.Student;

public class studentImplement implements StudentDao {

	private JdbcTemplate temp;
	
	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	@Override
	public int insert(Student student) {
		String query ="insert into student (id,name,city) values(?,?,?)";
		int result =this.temp.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}

	@Override
	public Student getStudent(int id) {
		String query ="select * from student where id=?";
		RowMapper<Student> rowMapper = new RowmapperImplement();
		Student student =this.temp.queryForObject(query,rowMapper,id);
		return student;
	}
	
	
	

}
