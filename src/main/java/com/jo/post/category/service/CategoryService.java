package com.jo.post.category.service;

import com.jo.post.category.model.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    CategoryEntity addCategory(CategoryEntity category);
    List<CategoryEntity> getAllCategory();
    Optional<CategoryEntity> getCategoryById(Long id);
}
