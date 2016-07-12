/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.service;

import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.model.Shoppingcart;

/**
 *
 * @author eyuel
 */
public interface ICartService {
    //Find Cart By Id
    Shoppingcart findCartById(int cartId);
    
    //Find Cart By Person Id 
    Shoppingcart findCartByPersonId(int personId);
    
    //Find All Products in Cart
    Product findAllProductInCart(int cartId);
    
    //Add Product to Cart
    void addProductToCart(int cartId, int productId,int Qty);
    
}
