package com.UserDao;

import java.util.List;

import com.Entites.Student;

public interface UserDao {
	public int insert(Student student);
	public int update(Student student);
	public List<Student> getAllStudent(); 
}
