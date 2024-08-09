package com.UserDao;

import com.Entities.Student;

public interface StudentDao {
	public int insert (Student student);
	public Student getStudent(int id);
}
