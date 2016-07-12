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
public abstract class AbstractDAO<PK extends Serializable, T> {
    private final Class<T> repositoryClass;  

    public AbstractDAO() {
        this.repositoryClass = (Class<T>)((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
    
    @Autowired
    private SessionFactory sessionFactory;
    
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
        
    public T getByKey(PK key){
        return (T) getSession().get(repositoryClass, key);
    }
    
    public void persist(T entity){
        getSession().persist(entity);
    }
    
    public void delete(T entity){
        getSession().delete(entity);
    }
    
    protected Criteria createEntityCriteria(){
        return getSession().createCriteria(repositoryClass);
    }
}
