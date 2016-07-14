/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.controller;

import com.mycompany.shopart.beans.UserInfoBean;
import com.mycompany.shopart.model.Category;
import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.model.User;
import com.mycompany.shopart.service.IProductService;
import java.util.List;
import org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mycompany.shopart.repositoryimpl.DataSource;
import com.mycompany.shopart.service.ICategoryService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author davie
 */
@Controller
public class ShoppingCartController {

    @Autowired
    IProductService productService;

    @Autowired
    ICategoryService cartegoryService;
    

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String loadData(Model model, HttpServletRequest request) {
        List<Category> categories = cartegoryService.getCategories();
        User user = new User();
        model.addAttribute("categories", categories);
        HttpSession session = request.getSession();
        session.setAttribute("categories", categories);
        model.addAttribute("user", user);
        model.addAttribute("userInfoBean", new UserInfoBean());
        model.addAttribute("products", categories.get(0).getProductCollection());
        return "base.definition";
    }

    @RequestMapping(value = {"/products/{cartegoryId}"}, method = RequestMethod.GET)
    public String loadProductsById(@PathVariable(value = "cartegoryId") String cartegoryId, Model model, HttpServletRequest request) {
        Category category = cartegoryService.findeCategoryById(Integer.parseInt(cartegoryId));
        HttpSession session = request.getSession();
        model.addAttribute("categories", (List<Category>) session.getAttribute("categories"));
        model.addAttribute("user", new User());
        model.addAttribute("products", category.getProductCollection());
        return "productsTile";
    }

    @RequestMapping(value = {"/product/{productId}"}, method = RequestMethod.GET)
    public String loadProductById(@PathVariable(value = "productId") String productId, Model model, HttpServletRequest request) {
        Product product = productService.findById(Integer.parseInt(productId));
        HttpSession session = request.getSession();
        model.addAttribute("categories", (List<Category>) session.getAttribute("categories"));
        model.addAttribute("user", new User());
        model.addAttribute("product", product);
        return "producttile";
    }

    @RequestMapping(value = {"/addtocart/{productId}/{categoryId}"}, method = RequestMethod.GET)
    public String addtoCart(@PathVariable(value = "productId") String productId, @PathVariable(value = "categoryId") String categoryId, Model model, HttpServletRequest request) {
        Product product = new Product();
        HttpSession session = request.getSession();
        List<Category> categories = (List<Category>) session.getAttribute("categories");
        session.setAttribute(productId, productId);
        model.addAttribute("categories", categories);
        model.addAttribute("user", new User());
        model.addAttribute("product", product);
        return "producttile";
    }
}
