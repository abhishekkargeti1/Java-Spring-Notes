package com.Dao;

import java.util.List;

import com.Entities.userDetails;

public interface userDao {
	public void saveData(userDetails details);
	public List<userDetails> details();
}
