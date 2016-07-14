/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Address;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.IAddressRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eyuel
 */
@Repository
public class AddressRepositoryImpl implements IAddressRepository {

    public AddressRepositoryImpl() {
    }

    @Override
    public Address findById(int addressId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAddress(Address address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAddress(Address address) {

       DataSource.addAddress(address);
    }
    
}
