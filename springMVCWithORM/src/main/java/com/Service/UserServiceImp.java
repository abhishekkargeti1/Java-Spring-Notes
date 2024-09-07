package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.userDaoImp;
import com.Entities.userDetails;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImp implements userService {
	
	@Autowired
	private userDaoImp userdaoimp;
	
	@Override
	@Transactional
	public void createuser(userDetails details) {
		// TODO Auto-generated method stub
		System.out.println("Service layer details "+details);
		userdaoimp.saveData(details);
	
	}

	@Override
	@Transactional
	public List<userDetails> details() {
		// TODO Auto-generated method stub
		 return userdaoimp.details();
		
	}

}
