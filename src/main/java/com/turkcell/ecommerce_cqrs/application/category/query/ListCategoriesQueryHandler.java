package com.turkcell.ecommerce_cqrs.application.category.query;

import com.turkcell.ecommerce_cqrs.application.category.dto.CategoryResponse;
import com.turkcell.ecommerce_cqrs.core.cqrs.QueryHandler;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListCategoriesQueryHandler implements QueryHandler<ListCategoriesQuery, List<CategoryResponse>> {
    @Override
    public List<CategoryResponse> handle(ListCategoriesQuery query) {
        return List.of();
    }
}
