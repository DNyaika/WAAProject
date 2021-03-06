/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.serviceimpl;

import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.repository.IProductRepository;
import com.mycompany.shopart.service.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author david
 * @author Eyuel
 */
@Service
//@Transactional
public class ProductServiceImpl implements IProductService {

    public ProductServiceImpl() {
    }

    @Autowired
    private IProductRepository productRepository;

    @Override
    public Product findById(int productId) {
        return productRepository.findById(productId);
    }

    @Override
    public void addProduct(Product product) {
       productRepository.addProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAllProduct();
    }

    @Override
    public List<Product> findAllProductByCategory() {
        return productRepository.findAllProduct();
    }

}
