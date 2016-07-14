/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.model.Category;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author davie
 */
public class DataSource {

//Phones
    private static final Product samSungGalaxyS4;
    private static final Product samSungGalaxyS3;
    private static final Product samSungGalaxyS2;
    private static Product samSungGalaxyNote5;
    private static Product samSungGalaxyNote6;
    private static Product samSungGalaxyNote4;
    private static final Product samSungGalaxyNote3;
    //Laptops
    private static Product accer;
    private static Product dell;
    private static Product ph;
    private static Product macbook;

    //cars
    private static Product toyota;
    private static Product benz;
    private static Product accura;
    private static Product rav4;

    private static final List<Product> productsList = new ArrayList<>();

    //Category
    private static final Category category;
    private static Category categoryLaptopps;
    private static Category categoryCars;

    static {
        //----phones
        category = new Category(1);
        category.setCategoryName("Electronics");
        //-----laptops
        categoryLaptopps = new Category(2);
        category.setCategoryName("Laptops");
        //---cars
        categoryCars = new Category(3);
        category.setCategoryName("Cars");

//--------Phones-----------
        samSungGalaxyS2 = new Product();
        samSungGalaxyS2.setPrice(100);
        samSungGalaxyS2.setProductId(1);
        samSungGalaxyS2.setProductName("SamSung Galaxy S2");
        samSungGalaxyS2.setProductImage("P1233");
        samSungGalaxyS2.setModel("S2");
        samSungGalaxyS2.setProductCategory(category);

        samSungGalaxyS3 = new Product();
        samSungGalaxyS3.setPrice(100);
        samSungGalaxyS3.setProductId(2);
        samSungGalaxyS3.setProductName("SamSung Galaxy S3");
        samSungGalaxyS3.setProductImage("P1234");
        samSungGalaxyS3.setModel("S3");
        samSungGalaxyS3.setProductCategory(category);

        samSungGalaxyS4 = new Product();
        samSungGalaxyS4.setPrice(100);
        samSungGalaxyS4.setProductId(3);
        samSungGalaxyS4.setProductName("SamSung Galaxy S4");
        samSungGalaxyS4.setProductImage("P1235");
        samSungGalaxyS4.setModel("S4");
        samSungGalaxyS4.setProductCategory(category);

        samSungGalaxyNote3 = new Product();
        samSungGalaxyNote3.setPrice(100);
        samSungGalaxyNote3.setProductId(4);
        samSungGalaxyNote3.setProductName("SamSung Galaxy Note3");
        samSungGalaxyNote3.setProductImage("P1236");
        samSungGalaxyNote3.setModel("Note3");
        samSungGalaxyNote3.setProductCategory(category);

        //----Cars
        toyota = new Product();
        toyota.setPrice(34);
        toyota.setModel("2001");
        toyota.setProductId(1);
        toyota.setPrice(300);
        toyota.setProductName("Toyota");
        toyota.setProductImage("toyota");

        rav4 = new Product();
        rav4.setPrice(56);
        rav4.setModel("2001");
        rav4.setProductId(2);
        rav4.setPrice(300);
        rav4.setProductName("rav4");
        rav4.setProductImage("rav4");

        benz = new Product();
        benz.setPrice(180);
        benz.setModel("2001");
        benz.setProductId(3);
        benz.setPrice(300);
        benz.setProductName("benz");
        benz.setProductImage("benz");

        accura = new Product();
        accura.setPrice(335);
        accura.setModel("2001");
        accura.setProductId(4);
        accura.setPrice(300);
        accura.setProductName("accura");
        accura.setProductImage("accura");

        //-----laptops
        accer = new Product();
        accer.setPrice(156);
        accer.setModel("2001");
        accer.setProductId(1);
        accer.setPrice(300);
        accer.setProductName("accer");
        accer.setProductImage("accer");

        dell = new Product();
        dell.setPrice(156);
        dell.setModel("2001");
        dell.setProductId(2);
        dell.setPrice(300);
        dell.setProductName("dell");
        dell.setProductImage("dell");

        ph = new Product();
        ph.setPrice(156);
        ph.setModel("2001");
        ph.setProductId(3);
        ph.setPrice(300);
        ph.setProductName("hp");
        ph.setProductImage("hp");

        macbook = new Product();
        macbook.setPrice(156);
        macbook.setModel("2001");
        macbook.setProductId(4);
        macbook.setPrice(300);
        macbook.setProductName("macbook");
        macbook.setProductImage("macbook");

        productsList.add(samSungGalaxyS2);
        productsList.add(samSungGalaxyS3);
        productsList.add(samSungGalaxyS4);
        productsList.add(samSungGalaxyNote3);
        productsList.add(accer);
        productsList.add(dell);
        productsList.add(ph);
        productsList.add(macbook);
        productsList.add(benz);
        productsList.add(accura);
        productsList.add(rav4);
        productsList.add(toyota);

//        category.setProductCollection(productsList);
    }

    public static List<Product> getProducts() {
        return productsList;
    }

    public static Product getProductById(int id) {
        for (Product product : productsList) {
            if (product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }

    public static Category getProductByCatalogId(int id) {
        return category;
    }

    public static List<Category> getAllCategories() {
        return Arrays.asList(category,categoryLaptopps,categoryCars);
    }

}
