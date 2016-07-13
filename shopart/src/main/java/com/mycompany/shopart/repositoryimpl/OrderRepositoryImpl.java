/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.IOrderRepository;
import javax.persistence.criteria.Order;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eyuel
 */
@Repository
public class OrderRepositoryImpl  implements IOrderRepository{

    public OrderRepositoryImpl() {
    }

    @Override
    public Order findOrderById(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order findOrderByPersonId(int personId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
