package com.turkcell.ecommerce_cqrs.infrastucture.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="products")
public class JpaProductEntity {

    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @Column(name = "amount", nullable = false, precision = 18, scale = 2)
    private BigDecimal amount;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    public UUID id() {
        return id;
    }

    public JpaProductEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public JpaProductEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String description() {
        return description;
    }

    public JpaProductEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal amount() {
        return amount;
    }

    public JpaProductEntity setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public String currency() {
        return currency;
    }

    public JpaProductEntity setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public Integer stock() {
        return stock;
    }

    public JpaProductEntity setStock(Integer stock) {
        this.stock = stock;
        return this;
    }
}
