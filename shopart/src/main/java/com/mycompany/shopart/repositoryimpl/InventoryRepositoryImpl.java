/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Inventory;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.IInventoryRepository;
import java.util.Collection;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eyuel
 */
@Repository
public class InventoryRepositoryImpl implements IInventoryRepository {

    public InventoryRepositoryImpl() {
    }

    @Override
    public Inventory findInventoryById(int inventoryId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Inventory findInventoryByProductId(int productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addInventory(Inventory inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateInventory(Inventory inventroy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Inventory> findAllInvetories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
