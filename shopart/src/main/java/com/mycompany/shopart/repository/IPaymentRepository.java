/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repository;

import com.mycompany.shopart.model.Payment;

/**
 *
 * @author eyuel
 */
public interface IPaymentRepository {
    //Find Payment By Payment ID
    Payment findPaymentById(int paymentId);
    
    //Find Payment By Card Holder Id
    Payment findPaymentByCardHolderId(int cardHolderId);
    
    //Add new Payment 
    void addPayment(Payment payment);
    
    //Update Payment
    void updatePayment(Payment payment);
    
    // Delete Payment
    void deletePayment(Payment payment);
    
}
