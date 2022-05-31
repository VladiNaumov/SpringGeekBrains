package com.naumdeveloper.spring;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {

    // ProductRepository позволяет получить весь список или один товар по id.
    private List<Product> products;

    @PostConstruct
    public void init() {
        this.products = new ArrayList<>();
        products.add(new Product(001L, "Apple RED"));
        products.add(new Product(007L, "Apple GRIND"));
        products.add(new Product(011L, "MILK "));
        products.add(new Product(017L, "BREAD"));
        products.add(new Product(021L, "DEMO TONICK"));
    }


    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }


    public Optional <Product> findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();

    }


}
