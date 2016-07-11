/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repository;

import com.mycompany.shopart.model.Manufacturer;

/**
 *
 * @author eyuel
 */
public interface IManufacutrerRepository {
    //Find Manufacturer By Id
    Manufacturer findById(int manufacturerId);
    
    //Add Manufacturer 
    void addManufacturer(Manufacturer manufacturer);
    
    //Update Manufacturer
    void updateManufacturer(Manufacturer manufacturer);
    
    //Delete Manufacturer
    void deleteManufacturer(Manufacturer manufacturer);
    
}
