package com.Userdao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setAddress(rs.getString(3));
		student.setPhoneNumber(rs.getString(4));
		student.setGender(rs.getString(5));
		return student;
	}

}
