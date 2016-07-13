/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mycompany.shopart.model.User;

/**
 *
 * @author eyuel
 */
@Controller
@RequestMapping(value="/shipment")
public class ShipmentController {
    @RequestMapping(method=RequestMethod.POST)
    public String getShipmentView(Model model) {
        model.addAttribute("user", new User());
        return "shipmentTile";
    }
    
}
