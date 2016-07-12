/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.IProductRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author davie
 */
@Repository
public class ProductRepositoryImpl extends AbstractDAO<Integer, Product> implements IProductRepository {

    public ProductRepositoryImpl() {
    }

    @Override
    public Product findById(int productId) {
        return DataSource.getProductById(productId);
    }

    @Override
    public void addProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return DataSource.getProducts();
    }

    @Override
    public List<Product> findAllProductByCategory(int categoryId) {
        List<Product> products = new ArrayList<>();
        for (Product product : DataSource.getProductByCatalogId(categoryId).getProductCollection()) {
            products.add(product);
        }
        return products;
    }
}
