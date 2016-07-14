/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Category;
import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.IProductRepository;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl;
import org.springframework.stereotype.Repository;
import com.mycompany.shopart.repositoryimpl.DataSource;

/**
 *
 * @author davie
 */
@Repository
//extends AbstractDAO<Integer, Product> 
public class ProductRepositoryImpl  implements IProductRepository {

    public ProductRepositoryImpl() {
    }

    @Override
    public Product findById(int productId) {
        for (Category category : DataSource.getAllCategories()) {
            for (Product product : category.getProductCollection()) {
                if (productId == product.getProductId()) {
                    return product;
                }
            }
        }
        return new Product();
    }

    @Override
    public void addProduct(Product product) {
//        Transaction trans = getSession().beginTransaction();
//        getSession().persist(product);
//        trans.commit();
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
        // return DataSource.getProducts();
        return null;
    }

    @Override
    public List<Product> findAllProductByCategory(int categoryId) {
//        List<Product> products = new ArrayList<>();
//        for (Product product : DataSource.getProductByCatalogId(categoryId).getProductCollection()) {
//            products.add(product);
//        }
//        return products;
        return null;
    }
}
