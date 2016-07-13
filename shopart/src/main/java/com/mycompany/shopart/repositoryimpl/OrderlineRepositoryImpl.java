/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Orderline;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.IOrderlineRepository;
import java.util.Collection;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eyuel
 */
@Repository
public class OrderlineRepositoryImpl  implements IOrderlineRepository {

    public OrderlineRepositoryImpl() {
    }

    @Override
    public Orderline findOrderLineById(int orderLineId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Orderline> findAllOrderLineByOrderId(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrderLine(Orderline orderLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
