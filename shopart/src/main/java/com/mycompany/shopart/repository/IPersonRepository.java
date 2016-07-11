/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repository;

import com.mycompany.shopart.model.Person;

/**
 *
 * @author eyuel
 */
public interface IPersonRepository {
    // Find a person based on Id
    Person findPersonById(int id);
    
    // Add Person
    void addPerson(Person person);
    
    // Delete a Person
    void deletePerson(Person person);
    
    // Update a Person
    void updatePerson(Person person);
    
    // Find all list of persons
    void findAllPerson();
}
