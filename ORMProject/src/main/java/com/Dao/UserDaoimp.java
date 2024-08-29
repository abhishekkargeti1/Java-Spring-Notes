package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entities.User;

import jakarta.transaction.Transactional;


public class UserDaoimp implements Userdao {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void insert(User details) {
		this.sessionFactory.getCurrentSession().persist(details);
		
	}

	@Override
	@Transactional
	public User getDetailsById(int id) {
		
		return sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Override
	@Transactional
	public List<User> getAllData() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("From User",User.class).getResultList();
	}

	@Override
	@Transactional
	public void delete(int id) {
		User data = sessionFactory.getCurrentSession().get(User.class, id);
		sessionFactory.getCurrentSession().remove(data);
		
	}

	@Override
	@Transactional
	public void change(int id, String Name) {
		
		String query ="Update SpringORMProject set name =:name where id =:id";
		sessionFactory.getCurrentSession().createQuery(query,User.class).setParameter("name", Name).setParameter("id", id).executeUpdate();
		
	}

}
