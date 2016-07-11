/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.service;

import com.mycompany.shopart.model.Address;

/**
 *
 * @author eyuel
 */
public interface IAddressService {
    //Find Address by Id
    Address findById(int addressId);
    
    //Update Address
    void updateAddress(Address address);
    
    // Add Address
    void addAddress(Address address);
    
}
