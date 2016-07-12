/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Payment;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.IPaymentRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eyuel
 */
@Repository
public class PaymentRepositoryImpl extends AbstractDAO<Integer,Payment> implements IPaymentRepository {

    public PaymentRepositoryImpl() {
    }

    @Override
    public Payment findPaymentById(int paymentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payment findPaymentByCardHolderId(int cardHolderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPayment(Payment payment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePayment(Payment payment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePayment(Payment payment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
