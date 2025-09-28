package com.turkcell.ecommerce_cqrs.persistence.category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name ="categories")
public class JpaCategoryEntitiy {

    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    public UUID id() {
        return id;
    }

    public JpaCategoryEntitiy setId(UUID id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public JpaCategoryEntitiy setName(String name) {
        this.name = name;
        return this;
    }
}
