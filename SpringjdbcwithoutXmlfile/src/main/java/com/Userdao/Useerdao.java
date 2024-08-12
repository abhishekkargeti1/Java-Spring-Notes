package com.Userdao;

import java.util.List;

import com.Entities.Student;

public interface Useerdao {
	public int insert(Student student);
	public int change (Student student);
	public int delete (Student student);
	public Student getuserid(int id);
	public List<Student> getAllData();
}
