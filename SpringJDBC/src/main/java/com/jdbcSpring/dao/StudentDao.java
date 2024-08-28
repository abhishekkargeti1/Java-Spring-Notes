package com.jdbcSpring.dao;

import com.spring.Entities.Student;

public interface StudentDao {
	public int insert (Student student);
	public int change(Student student);
	public int delete (Student student);
	public Student getdata(int id);
}
