/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repository;

import com.mycompany.shopart.model.Orderline;
import java.util.Collection;

/**
 *
 * @author eyuel
 */
public interface IOrderlineRepository {
    //Find OrderLine By Id
    Orderline findOrderLineById(int orderLineId);
    
    //Find all orderLines of an order
    Collection<Orderline> findAllOrderLineByOrderId(int orderId);
    
    //Add OrderLine
    void addOrderLine(Orderline orderLine);
    
}
