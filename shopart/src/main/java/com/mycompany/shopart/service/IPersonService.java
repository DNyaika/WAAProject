/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.service;

import com.mycompany.shopart.model.Product;
import java.util.List;

/**
 *
 * @author eyuel
 */
public interface IPersonService {
    // Find Person based on its ID
    Product findById(int productId);
    
    // Add a Person
    void addPerson(Product product);
    
    // Delete a Person
    void deletePerson(Product product);
    
    //Update a Person
    void updatePerson(Product product);
    
    //Find all Persons
    List<Product> findAllPerson();
    
    
}
