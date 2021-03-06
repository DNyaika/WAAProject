/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.serviceimpl;

import com.mycompany.shopart.model.Category;
import com.mycompany.shopart.repository.ICategoryRepository;
import com.mycompany.shopart.service.ICategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author eyuel
 */
@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService {

    public CategoryServiceImpl() {
    }

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public Category findCategoryByName(String categoryName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category findeCategoryById(int categoryId) {
       return categoryRepository.findeCategoryById(categoryId);
    }

    @Override
    public void addCategory(Category category) {
        categoryRepository.addCategory(category);
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
    public List<Category> getCategories() {
        return categoryRepository.findAllCategory();
    }

}
