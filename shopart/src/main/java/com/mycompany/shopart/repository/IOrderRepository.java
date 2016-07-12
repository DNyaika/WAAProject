/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repository;

import javax.persistence.criteria.Order;

/**
 *
 * @author eyuel
 */
public interface IOrderRepository {
    //Find Order By Id
    Order findOrderById(int orderId);
    
    //Add Order
    void addOrder(Order order);
    
    //Find Order By PersonId
    Order findOrderByPersonId(int personId);
    
    
}
