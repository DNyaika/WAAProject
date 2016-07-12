/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.model.Category;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davie
 */
public class DataSource {

//Products
    private static Product samSungGalaxyS4;
    private static Product samSungGalaxyS3;
    private static Product samSungGalaxyS2;
    private static Product samSungGalaxyNote5;
    private static Product samSungGalaxyNote6;
    private static Product samSungGalaxyNote4;
    private static Product samSungGalaxyNote3;
    private static List<Product> productsList = new ArrayList<>();

    //Category
    private static Category category;

    static {
        Category category = new Category(1);
        category.setCategoryName("Electronics");
//products
        samSungGalaxyS2 = new Product();
        samSungGalaxyS2.setPrice(100);
        samSungGalaxyS2.setProductId(1);
        samSungGalaxyS2.setProductName("SamSung Galaxy S2");
        samSungGalaxyS2.setProductImage("P1233");
        samSungGalaxyS2.setModel("S2");
        samSungGalaxyS2.setProductCategory(category);

        samSungGalaxyS3 = new Product();
        samSungGalaxyS3.setPrice(100);
        samSungGalaxyS2.setProductId(2);
        samSungGalaxyS2.setProductName("SamSung Galaxy S3");
        samSungGalaxyS2.setProductImage("P1234");
        samSungGalaxyS2.setModel("S3");
        samSungGalaxyS2.setProductCategory(category);

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

        productsList.add(samSungGalaxyS2);
        productsList.add(samSungGalaxyS3);
        productsList.add(samSungGalaxyS4);
        productsList.add(samSungGalaxyNote3);

        category.setProductCollection(productsList);
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
    
    public static Category getProductByCatalogId(int id){
        return category;
    }
    
}
