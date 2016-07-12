/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.serviceimpl;

import com.mycompany.shopart.model.Manufacturer;
import com.mycompany.shopart.repository.IManufacutrerRepository;
import com.mycompany.shopart.service.IManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author eyuel
 */
@Service
@Transactional
public class ManufacturerServiceImpl implements IManufacturerService {

    public ManufacturerServiceImpl() {
    }

    @Autowired
    private IManufacutrerRepository manufacturerRepository;
    
    @Override
    public Manufacturer findById(int manufacturerId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addManufacturer(Manufacturer manufacturer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateManufacturer(Manufacturer manufacturer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteManufacturer(Manufacturer manufacturer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
