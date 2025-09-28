package com.turkcell.ecommerce_cqrs;

import com.turkcell.ecommerce_cqrs.domain.product.model.Money;
import com.turkcell.ecommerce_cqrs.domain.product.model.Product;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Product product = Product.create(
                "Ürün1",
                "Ürün 1 Açıklaması",
                new Money(BigDecimal.valueOf(300), "TRY"),
                100
        );
        product.rename("Ürün 2");
        System.out.println(product.name());
    }
}

// Bireysel Odev => Domain Driven Design hakkinda 3+ sayfalik bol ornekli bir yazi olusturmak.
//pdf yapip yukle
