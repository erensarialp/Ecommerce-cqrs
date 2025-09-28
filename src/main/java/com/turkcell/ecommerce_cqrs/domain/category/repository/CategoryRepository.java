package com.turkcell.ecommerce_cqrs.domain.category.repository;

import com.turkcell.ecommerce_cqrs.domain.category.model.Category;
import com.turkcell.ecommerce_cqrs.domain.category.model.CategoryId;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {

    Category save(Category category);
    Optional<Category> findById(CategoryId categoryId);
    List<Category> findAll();
    void delete(CategoryId categoryId);
}
