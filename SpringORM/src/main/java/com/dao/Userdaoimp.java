package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.entities.Student;

import jakarta.transaction.Transactional;

@Repository 
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


	@Override
	@Transactional
	public List<Student> getDataById(int id) {
		 return this.sessionFactory.getCurrentSession()
		            .createQuery("from Student where id = :id", Student.class)
		            .setParameter("id", id)
		            .list();
	}
	@Override
	@Transactional
	public int updateData(int id , String name) {
		System.out.println("In Update method");
		System.out.println(name);
		String hql ="UPDATE Student SET Name = :name WHERE id = :id";
		return this.sessionFactory.getCurrentSession()
				.createQuery(hql)
				.setParameter("name", name)
				.setParameter("id",id)
				.executeUpdate();
	}
	@Override
	@Transactional
	public List<Student> getAllData() {
	    // Get the current Hibernate session
	    var session = sessionFactory.getCurrentSession();
	    
	    // Create a CriteriaBuilder instance from the session
	    var builder = session.getCriteriaBuilder();
	    
	    // Create a CriteriaQuery instance with the expected result type
	    var query = builder.createQuery(Student.class);
	    
	    // Specify the root entity (Student) to query from
	    var root = query.from(Student.class);
	    
	    // Select all instances of the Student entity
	    query.select(root);
	    
	    // Execute the query and return the results as a list
	    return session.createQuery(query).getResultList();
	}

	
	
	
}
