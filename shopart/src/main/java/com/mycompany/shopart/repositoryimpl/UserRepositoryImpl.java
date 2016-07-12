/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.User;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.IUserRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eyuel
 */
@Repository
public class UserRepositoryImpl extends AbstractDAO<Integer,User> implements IUserRepository {

    @Override
    public User findUserById(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findUserByPersonId(int personId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findUserByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
