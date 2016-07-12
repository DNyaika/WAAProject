/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repository;

import com.mycompany.shopart.model.Product;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author davie
 */

public interface IProductRepository {
    // Find Product based on its ID
    Product findById(int productId);
    
    // Add a Product
    void addProduct(Product product);
    
    // Delete a Product
    void deleteProduct(Product product);
    
    //Update a Product
    void updateProduct(Product product);
    
    //Find all the Product
    List<Product> findAllProduct();
    
    // Find All Products Based on category
    Collection<Product> findAllProductByCategory(int categoryId);
    
}

