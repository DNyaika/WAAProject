/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.service;

import com.mycompany.shopart.model.Payment;

/**
 *
 * @author eyuel
 */
public interface IPaymentService {
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
