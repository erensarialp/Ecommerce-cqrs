package com.turkcell.ecommerce_cqrs.persistence.category;

import com.turkcell.ecommerce_cqrs.domain.category.model.Category;
import com.turkcell.ecommerce_cqrs.domain.category.model.CategoryId;
import org.springframework.stereotype.Component;

@Component
public class CategoryEntityMapper {

    public JpaCategoryEntitiy toEntity(Category category){

        JpaCategoryEntitiy categoryEntitiy = new JpaCategoryEntitiy();
        categoryEntitiy.setId(category.id().value());
        categoryEntitiy.setName(category.name());
        return categoryEntitiy;
    }

    public Category toDomain(JpaCategoryEntitiy entity){
        return Category.rehydrate(
                new CategoryId(entity.id()),
                entity.name()
        );
    }
}
