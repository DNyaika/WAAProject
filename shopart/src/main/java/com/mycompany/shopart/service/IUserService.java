/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.service;

import com.mycompany.shopart.model.User;

/**
 *
 * @author eyuel
 */
public interface IUserService {
    //Find User By Id
    User findUserById(int userId);
    
    //Find User By PersonId
    User findUserByPersonId(int personId);
    
    //Find User by email
    User findUserByEmail(String email);
}
