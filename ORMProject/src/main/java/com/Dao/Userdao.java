package com.Dao;

import java.util.List;

import com.Entities.User;

public interface Userdao {

	public void insert (User details);
	
	public User getDetailsById(int id);
	
	public List<User> getAllData();
	
	public void delete(int id);
	
	public void change(int id,String Name);
}
