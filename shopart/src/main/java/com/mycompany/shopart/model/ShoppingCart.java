/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShoppingCart implements Serializable {

    private int totalItems;
    private String cartId;

    public int getTotalItems() {
        return totalItems;
    }
    private Map<String, ShoppingcartItem> cartItems;
    private int grandTotal;

    public ShoppingCart() {
        cartItems = new HashMap<>();
        grandTotal = 0;
    }

    public ShoppingCart(String cartId) {
        this();
        this.cartId = cartId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Map<String, ShoppingcartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Map<String, ShoppingcartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public void addCartItem(ShoppingcartItem item) {
        String productId = item.getProduct().getProductId().toString();

        if (cartItems.containsKey(productId)) {
            ShoppingcartItem existingCartItem = cartItems.get(productId);
            existingCartItem.setQuantity(existingCartItem.getQuantity()
                    + item.getQuantity());
        } else {
            cartItems.put(productId, item);
        }
        updateGrandTotal();
    }

    public void removeCartItem(ShoppingcartItem item) {
        String productId = item.getProduct().getProductId().toString();
        cartItems.remove(productId);
        updateGrandTotal();
    }

    public void updateGrandTotal() {
        grandTotal = 0;

        for (ShoppingcartItem item : cartItems.values()) {
            grandTotal += item.getTotalPrice();
            ++totalItems;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.cartId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ShoppingCart other = (ShoppingCart) obj;
        if (!Objects.equals(this.cartId, other.cartId)) {
            return false;
        }
        return true;
    }

}
