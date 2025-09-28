package com.turkcell.ecommerce_cqrs.persistence.category;

import com.turkcell.ecommerce_cqrs.persistence.product.JpaProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataCategoryRepository extends JpaRepository<JpaCategoryEntitiy, UUID> {
}
