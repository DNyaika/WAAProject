/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.controller;

import com.mycompany.shopart.beans.UserInfoBean;
import com.mycompany.shopart.model.User;
import com.mycompany.shopart.service.IAddressService;
import com.mycompany.shopart.service.IPersonService;
import com.mycompany.shopart.service.IUserService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author 985072
 */
@Controller

public class SignupController {
    @Autowired
    private IAddressService addressService;
    @Autowired
    private IPersonService personService;
    @Autowired
    private IUserService userService;
    
    @RequestMapping(value="/signup",method = RequestMethod.GET)
    public String getSignupForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("userInfoBean", new UserInfoBean());
        return "signupTile";
       //return "testTile";
    }
    
    @RequestMapping(value="/xx",method = RequestMethod.POST)
    public String proccessSignUp(@ModelAttribute("userInfoBean") @Valid User userInfoBean,
            Model model,BindingResult result) {
        if(result.hasErrors()) {
            return "redirect:signup";
        }
        model.addAttribute("user", new User());
        return "productsTile";
    }
    
}
