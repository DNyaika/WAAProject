/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Address;
import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.model.Category;
import com.mycompany.shopart.model.Person;
import com.mycompany.shopart.model.User;
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

    private static final List<Product> phones = new ArrayList<>();
    private static final List<Product> cars = new ArrayList<>();
    private static final List<Product> laptops = new ArrayList<>();
    
    public static final List<Person> persons = new ArrayList<>();
    
    public static final List<Address> address = new ArrayList<>();
    public static final List<User> users = new ArrayList<>();

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
        categoryLaptopps.setCategoryName("Laptops");
        //---cars
        categoryCars = new Category(3);
        categoryCars.setCategoryName("Cars");

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

        phones.add(samSungGalaxyS2);
        phones.add(samSungGalaxyS3);
        phones.add(samSungGalaxyS4);
        phones.add(samSungGalaxyNote3);
        
        laptops.add(accer);
        laptops.add(dell);
        laptops.add(ph);
        laptops.add(macbook);
        
        cars.add(benz);
        cars.add(accura);
        cars.add(rav4);
        cars.add(toyota);

        category.setProductCollection(phones);
        categoryCars.setProductCollection(cars);
        categoryLaptopps.setProductCollection(laptops);
        
        // Person 
        Person p = new Person();
        User u = new User();
        p.setFirstName("Eyuel");
        p.setLastName("Taddese");
        u.setUserId("user");
        u.setPassword("12345");
        u.setPersonId(p);
        users.add(u);
        persons.add(p);
    }

//    public static List<Product> getProducts() {
//        return productsList;
//    }

//    public static Product getProductById(int id) {
//        for (Product product : productsList) {
//            if (product.getProductId() == id) {
//                return product;
//            }
//        }
//        return null;
//    }
    public static Category getProductByCatalogId(int id) {
        return category;
    }

    public static List<Category> getAllCategories() {
        return Arrays.asList(category, categoryLaptopps, categoryCars);
    }
    public static List<User> getAllUser() {
        return users;
    }
    public static void addUser(User u1) {
        users.add(u1);
    }
    public static User findUserById(String userId) {
        for(User u : users) {
            if(userId.equals(u.getUserId())) {
                return u;
            }
        }
        return null;
    }
    public static void addAddress(Address address) {
        DataSource.address.add(address);
    }
    
    public static void addPerson(Person person) {
        persons.add(person);
    }
    public static List<Person> getAllPerson() {
        return persons;
    }
}
