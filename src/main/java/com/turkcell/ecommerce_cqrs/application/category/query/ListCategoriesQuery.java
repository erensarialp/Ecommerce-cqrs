package com.turkcell.ecommerce_cqrs.application.category.query;

import com.turkcell.ecommerce_cqrs.application.category.dto.CategoryResponse;
import com.turkcell.ecommerce_cqrs.core.cqrs.Query;

import java.util.List;

public record ListCategoriesQuery(
        Integer pageIndex, Integer pageSize) implements Query<List<CategoryResponse>> {
}
