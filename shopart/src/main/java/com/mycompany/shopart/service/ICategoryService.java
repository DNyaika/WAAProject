/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.service;

import com.mycompany.shopart.model.Category;
import java.util.List;

/**
 *
 * @author eyuel
 */
public interface ICategoryService {

    // Find Category By Name
    Category findCategoryByName(String categoryName);

    // Find Category By Id
    Category findeCategoryById(int categoryId);

    // Add new Category
    void addCategory(Category category);

    // Update Category
    void updateCategory(Category category);

    // Delete Category
    void deleteCategory(Category category);

    List<Category> getCategories();
}
