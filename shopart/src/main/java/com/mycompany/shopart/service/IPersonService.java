/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.service;

import com.mycompany.shopart.model.Person;
import com.mycompany.shopart.model.Product;
import java.util.List;

/**
 *
 * @author eyuel
 */
public interface IPersonService {
    // Find Person based on its ID
    Person findById(int personId);
    
    // Add a Person
    void addPerson(Person person);
    
    // Delete a Person
    void deletePerson(Person person);
    
    //Update a Person
    void updatePerson(Person person);
    
    //Find all Persons
    List<Person> findAllPerson();
    
    
}
