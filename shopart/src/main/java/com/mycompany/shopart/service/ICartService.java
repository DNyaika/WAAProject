/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.service;

import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.model.ShoppingCart;
import com.mycompany.shopart.model.ShoppingcartItem;

/**
 *
 * @author eyuel
 */
public interface ICartService {

    //Find Cart By Id
    ShoppingcartItem findCartById(int cartId);

    //Find Cart By Person Id 
    ShoppingcartItem findCartByPersonId(int personId);

    //Find All Products in Cart
    Product findAllProductInCart(int cartId);

    //Add Product to Cart
    void addProductToCart(int cartId, int productId, int Qty);

    public ShoppingCart getInstance();

    public ShoppingcartItem getCartItemInstance();

}
