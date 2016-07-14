/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.controller;


import com.mycompany.shopart.beans.UserInfoBean;
import com.mycompany.shopart.model.Address;
import com.mycompany.shopart.model.Payment;
import com.mycompany.shopart.model.Person;
import com.mycompany.shopart.model.User;
import com.mycompany.shopart.repositoryimpl.DataSource;
import com.mycompany.shopart.service.IAddressService;
import com.mycompany.shopart.service.IPersonService;
import com.mycompany.shopart.service.IUserService;
import java.math.BigInteger;
import java.sql.Date;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author eyuel
 */
@Controller
public class UrlDistributerController {
//    @RequestMapping("/")
//    public String start() {
//        return"redirect:/person";
//    }
    @Autowired
    private IAddressService addressService;
    @Autowired
    private IPersonService personService;
    @Autowired
    private IUserService userService;
    
    @RequestMapping(value="/person",method = RequestMethod.GET)
    public String getPersonView(Model model){
       // model.addAttribute("newPerson", new Person());
        model.addAttribute("userInfoBean",new User());
        model.addAttribute("user",new User());
       // return "singup";
       return "testTile";
    }
    
    @RequestMapping(value="/signupForm",method = RequestMethod.POST)
    public String processPerson(@ModelAttribute("userInfoBean") @Valid UserInfoBean newPerson,BindingResult resultBinding,Model model,RedirectAttributes redirectAttr) {
        if(resultBinding.hasErrors()) {
            redirectAttr.addFlashAttribute("user", new User());
            redirectAttr.addFlashAttribute("BindingResult", resultBinding);
           redirectAttr.addFlashAttribute("BindingResult", resultBinding);
            model.addAttribute("user", new User());
          // return "redirect:/signupForm";
           return "signupTile";
        }
        Address userAddress = new Address();
        userAddress.setState(newPerson.getState());
        userAddress.setStreet(newPerson.getStreet());
        userAddress.setZip(newPerson.getZip());
        
        Payment userPayment = new Payment();
        userPayment.setCardNumber(BigInteger.valueOf(0));
        userPayment.setCardType(newPerson.getCardType());
        Date date = Date.valueOf(newPerson.getExpirationDate());
        userPayment.setExpirationDate(date);
        
        User newUser = new User();
        newUser.setUserId(newPerson.getEmail());
        newUser.setPassword(newPerson.getPassword());
        newUser.setRole("UserRole");

        Person person = new Person();
        person.setEmail(newPerson.getEmail());
        person.setFirstName(newPerson.getFirstName());
        person.setLastName(newPerson.getLastName());
        person.setAddress(userAddress);
        person.setPhone(newPerson.getPhone());
                newUser.setPersonId(person);
                
        addressService.addAddress(userAddress);
        personService.addPerson(person);
        userService.addUser(newUser);
        
        
        model.addAttribute("user", newUser);
        return "redirect:/";
    }
    @RequestMapping(value="/signupForm",method = RequestMethod.GET)
    public String displaySignupForm(Model model,RedirectAttributes redirectAttributes,BindingResult BindingResult) {
       // User u = (User) redirectAttributes.getFlashAttributes().get("user");
       
        model.addAttribute("user", new User());
        model.addAttribute("userInfoBean",new UserInfoBean());
                    return "signupTile";
    }
    
}
