/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.controller;

import com.mycompany.shopart.model.User;
import com.mycompany.shopart.service.IUserService;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author 985072
 */

@Controller
//@SessionAttributes("userLog")
//@RequestMapping(value="/login")
public class UserController {
    @Autowired
    private IUserService userService;
    
//    @Autowired
//    private UserValidator userValidator;
    
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String Authenticate(@ModelAttribute("user") User newUser,boolean remember,@CookieValue(value ="userId", defaultValue = "") String userId,
            HttpServletRequest request,HttpServletResponse response, BindingResult result,RedirectAttributes redirectAttribute) {
        System.out.println("Authentication Hit!!!!");
        if(result.hasErrors()){
            return "redirect:/";
        }
        
        String[] suppressedFields = result.getSuppressedFields();
        if(suppressedFields.length > 0) {
            throw new RuntimeException("Attempting to bind disallowed fields: " +
                StringUtils.arrayToCommaDelimitedString(suppressedFields));
        }
        
        // check if the username and passowrd match
        User u1 = userService.authenticateUser(newUser);
        if(!(u1 == null)) {
            // if remember me is checked and cookie is empty
            if(remember && userId.isEmpty()) {
                Cookie cookie = new Cookie("userId",newUser.getUserId()+"");
                cookie.setMaxAge(30*24*60*60);
                response.addCookie(cookie);
            } else if(!remember) {
                Cookie cookie = new Cookie("userId", null);
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
            request.getSession().setAttribute("userLog", u1);
            redirectAttribute.addFlashAttribute("userLog", u1);

           
            return "redirect:/";
        }
        else {
            return "redirect:/";
            //throw new IllegalArgumentException("Invalid User and password");
        }
    }
    @RequestMapping(value="/logout")
    public String logout(HttpServletRequest request,Model model) {
        //status.setComplete();
        request.getSession().invalidate();
        User u1 = new User();
        model.addAttribute("userLog", u1);
        model.addAttribute("user", new User());
        return "redirect:/";
    }
    @RequestMapping(value="/productss",method = RequestMethod.GET)
    public String displayProducts2(Model model,RedirectAttributes redirectAttr) {
                 User u = (User) redirectAttr.getFlashAttributes().get("userLog");
                model.addAttribute("userLog", u);
        model.addAttribute("user", new User());
        return "productsTile";
    }
    @InitBinder
    public void initialiseBinder(WebDataBinder binder) {
        binder.setDisallowedFields("role");
//        binder.setValidator(userValidator);
    }
}
