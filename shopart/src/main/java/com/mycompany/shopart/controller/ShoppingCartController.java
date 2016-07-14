/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.controller;

import com.mycompany.shopart.beans.UserInfoBean;
import com.mycompany.shopart.model.Category;
import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.model.ShoppingCart;
import com.mycompany.shopart.model.ShoppingcartItem;
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
import com.mycompany.shopart.service.ICartService;
import com.mycompany.shopart.service.ICategoryService;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PathVariable;
import com.mycompany.shopart.model.ShoppingcartItem;

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
    @Autowired
    ICartService shoppingCartService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String loadData(Model model, HttpServletRequest request) {
        ShoppingCart shoppingCart = shoppingCartService.getInstance();
        List<Category> categories = cartegoryService.getCategories();
        User user = new User();
        HttpSession session = request.getSession();
        session.setAttribute("categories", categories);
        session.setAttribute("liveshoppingcartInitial", shoppingCart);
        model.addAttribute("liveshoppingcart", session.getAttribute("liveshoppingcart"));
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
        HttpSession session = request.getSession();
        session.setAttribute("categoryid", categoryId);
        ShoppingCart cartInstance = (ShoppingCart) session.getAttribute("liveshoppingcartInitial");

        ShoppingcartItem cartItemInstance = shoppingCartService.getCartItemInstance();
        List<Product> products = new ArrayList<>();
        List<Category> categories = (List<Category>) session.getAttribute("categories");
        for (Category category : categories) {
            if (category.getCategoryId() == Integer.parseInt(categoryId)) {
                products = category.getProductCollection();
            }
        }
        if (!products.isEmpty()) {
            for (Product product : products) {
                if (product.getProductId() == Integer.parseInt(productId)) {
                    cartItemInstance.setProduct(product);
                    cartInstance.addCartItem(cartItemInstance);
                }
            }
        }
        session.setAttribute("liveshoppingcart", cartInstance);
        model.addAttribute("categories", categories);
        model.addAttribute("user", new User());
        model.addAttribute("products", products);
        return "productsTile";
    }

    @RequestMapping(value = {"/showcart"}, method = RequestMethod.GET)
    public String showCart(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        int categoryId = Integer.parseInt(session.getAttribute("categoryid").toString());
        List<Product> products = new ArrayList<>();
        List<Category> categories = (List<Category>) session.getAttribute("categories");

        ShoppingCart cart = (ShoppingCart) session.getAttribute("liveshoppingcart");
        model.addAttribute("categories", categories);
        model.addAttribute("user", new User());
        return "cartttile";
    }

    @RequestMapping(value = {"/remove/{productId}"}, method = RequestMethod.GET)
    public String removefromCart(@PathVariable(value = "productId") String productId, Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("liveshoppingcart");
        ShoppingcartItem item = shoppingCart.getCartItems().get(productId);
        shoppingCart.removeCartItem(item);
        session.setAttribute("liveshoppingcart", shoppingCart);

        List<Category> categories = (List<Category>) session.getAttribute("categories");
        model.addAttribute("categories", categories);
        model.addAttribute("user", new User());
        return "cartttile";
    }

    @RequestMapping(value = {"/clearcart"}, method = RequestMethod.GET)
    public String clearLiveCart(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<Category> categories = (List<Category>) session.getAttribute("categories");
        model.addAttribute("categories", categories);
        model.addAttribute("user", new User());
        session.invalidate();
        return "cartttile";
    }
    
      @RequestMapping(value = {"/thankyou"}, method = RequestMethod.GET)
    public String thankyou(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<Category> categories = (List<Category>) session.getAttribute("categories");
        model.addAttribute("categories", categories);
        model.addAttribute("user", new User());
        session.invalidate();
        return "thankyouTile";
    }
}
