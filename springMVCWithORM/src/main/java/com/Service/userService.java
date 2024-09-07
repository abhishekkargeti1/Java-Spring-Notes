package com.Service;

import java.util.List;

import com.Entities.userDetails;

public interface userService {
	public void createuser(userDetails details);
	public List<userDetails> details();

}
