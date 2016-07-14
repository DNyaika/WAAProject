/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repository;

import com.mycompany.shopart.model.User;

/**
 *
 * @author eyuel
 */
public interface IUserRepository {
    //Find User By Id
    User findUserById(String userId);
    
    //Find User By PersonId
    User findUserByPersonId(String personId);
    
    //Find User by email
    User findUserByEmail(String email);
    
    //Add User
    void addUser(User user);
    
}
