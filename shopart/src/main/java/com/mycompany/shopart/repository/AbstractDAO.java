/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author eyuel
 */
public class AbstractDAO<PK extends Serializable, T> {

    public AbstractDAO() {
    }
    
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
