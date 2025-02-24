package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Details;

@Repository
public class Dao {

    @Autowired
    private HibernateTemplate hibernate;

    @Transactional
    public void insertData(Details d) {
        try {
            hibernate.saveOrUpdate(d);  // Using saveOrUpdate to handle both insert and update
        } catch (Exception e) {
            // Log the exception and handle it
            System.err.println("Error inserting data: " + e.getMessage());
            // Rethrow or handle the exception based on your use case
            throw e;  // Rethrow if you want to let Spring handle the rollback
        }
    }
}
