package com.dao;

import java.util.List;

import com.entities.Student;

public interface Userdao {
	public void insert(Student student);
	public List<Student> getDataById(int id);
	public int updateData(int id, String name);
	public List<Student> getAllData();
	
}
