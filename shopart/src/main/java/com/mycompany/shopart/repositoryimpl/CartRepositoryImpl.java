/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Category;
import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.model.ShoppingCart;
import com.mycompany.shopart.model.ShoppingcartItem;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.ICartRepository;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eyuel
 */
@Repository
public class CartRepositoryImpl  implements ICartRepository {

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
       return new ShoppingCart();
    }

    @Override
    public ShoppingcartItem getCartItemInstance() {
       return new ShoppingcartItem();
    }

}
