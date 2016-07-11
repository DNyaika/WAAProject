/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.controller;

import java.util.List;
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
       @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String loadData(Model model) {
        return "base.definition";
    }
}
