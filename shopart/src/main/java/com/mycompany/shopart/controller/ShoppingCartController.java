/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.controller;

import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.model.User;
import com.mycompany.shopart.service.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author davie
 */
@Controller
public class ShoppingCartController {
    @Autowired
    IProductService productService;
    
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String loadData(Model model) {
        List<Product> products = productService.findAllProduct();
        User user = new User();
        model.addAttribute("user",user);
        model.addAttribute("products",products);
        return "base.definition";
    }
}
