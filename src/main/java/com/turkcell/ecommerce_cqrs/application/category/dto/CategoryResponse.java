package com.turkcell.ecommerce_cqrs.application.category.dto;

import java.util.UUID;

public record CategoryResponse(
        UUID id, String name
) {
}
