package com.dao;

import org.hibernate.SessionFactory;

import com.entities.Student;

import jakarta.transaction.Transactional;


public class Userdaoimp implements Userdao {

	private SessionFactory sessionFactory;


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	@Transactional
	public void insert(Student student) {
		this.sessionFactory.getCurrentSession().persist(student);
	}

}
