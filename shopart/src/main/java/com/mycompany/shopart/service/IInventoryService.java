/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.service;

import com.mycompany.shopart.model.Inventory;
import java.util.Collection;

/**
 *
 * @author eyuel
 */
public interface IInventoryService {
    //Find Inventory  By Id
    Inventory findInventoryById(int inventoryId);
    
    //Find Inventory By ProductId
    Inventory findInventoryByProductId(int productId);
    
    //Add Inventory Item
    void addInventory(Inventory inventory);
    
    //Update Inventory
    void updateInventory(Inventory inventroy);
    
    //Find all inventory
    Collection<Inventory> findAllInvetories();
}
