/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Category;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.ICategoryRepository;
import java.util.Collection;
import java.util.List;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;

/**
 *
 * @author eyuel
 */
@Repository
public class CategoryRepositoryImpl extends AbstractDAO<Integer, Category> implements ICategoryRepository {
    
    public CategoryRepositoryImpl() {
    }
    
    @Override
    public Category findCategoryByName(String categoryName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Category findeCategoryById(int categoryId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void addCategory(Category category) {
//        Session session = getSession();
//        Transaction trans = session.beginTransaction();
//        session.saveOrUpdate(category);
//        trans.commit();
//        session.close();
        getSession().save(category);
    }
    
    @Override
    public void updateCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void deleteCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
      @Override
    public List<Category> findAllCategory() {
       return DataSource.getAllCategories();
    }
    
}
