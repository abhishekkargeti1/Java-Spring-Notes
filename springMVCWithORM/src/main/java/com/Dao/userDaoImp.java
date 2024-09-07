package com.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entities.userDetails;

import jakarta.transaction.Transactional;

@Repository
public class userDaoImp implements userDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void saveData(userDetails details) {
		sessionFactory.getCurrentSession().persist(details);
		
	}

	@Override
	@Transactional
	public List<userDetails> details() {
		return sessionFactory.getCurrentSession().createQuery("FROM userDetails",userDetails.class).getResultList();
	}

}
