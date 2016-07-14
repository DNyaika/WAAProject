/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.serviceimpl;

import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.model.ShoppingCart;
import com.mycompany.shopart.model.ShoppingcartItem;
import com.mycompany.shopart.repository.ICartRepository;
import com.mycompany.shopart.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author eyuel
 */
@Service
@Transactional
public class CartServiceImpl implements ICartService {

    @Autowired
    private ICartRepository cartRepository;
    
    @Override
    public ShoppingcartItem findCartById(int cartId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ShoppingcartItem findCartByPersonId(int personId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product findAllProductInCart(int cartId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addProductToCart(int cartId, int productId, int Qty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ShoppingCart getInstance() {
        return cartRepository.getInstance();
    }

    @Override
    public ShoppingcartItem getCartItemInstance() {
        return cartRepository.getCartItemInstance();
    }
    
}
