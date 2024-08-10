package com.Dao;

import java.util.List;

import com.Entities.Student;

public interface StudentDao {
	public Student select(int id);
	public List<Student> getallstudent ();
}
