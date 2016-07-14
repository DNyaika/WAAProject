/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Person;
import com.mycompany.shopart.model.User;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.IUserRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eyuel
 */
@Repository
public class UserRepositoryImpl extends AbstractDAO implements IUserRepository {

    @Override
    public User findUserById(String userId) {


       User u1 = DataSource.findUserById(userId);
       if(u1 == null) {
           return null;
       }
       else return u1;
    }

    @Override
    public User findUserByPersonId(String personId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findUserByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addUser(User user) {
        
        DataSource.addUser(user);
    }
    
}
