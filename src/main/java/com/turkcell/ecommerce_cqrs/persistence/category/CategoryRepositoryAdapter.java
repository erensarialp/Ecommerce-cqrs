package com.turkcell.ecommerce_cqrs.persistence.category;

import com.turkcell.ecommerce_cqrs.domain.category.model.Category;
import com.turkcell.ecommerce_cqrs.domain.category.model.CategoryId;
import com.turkcell.ecommerce_cqrs.domain.category.repository.CategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepositoryAdapter implements CategoryRepository {

    private final SpringDataCategoryRepository repository;

    public CategoryRepositoryAdapter(SpringDataCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public Optional<Category> findById(CategoryId categoryId) {
        return Optional.empty();
    }

    @Override
    public List<Category> findAll() {
        return List.of();
    }

    @Override
    public void delete(CategoryId categoryId) {

    }
}
