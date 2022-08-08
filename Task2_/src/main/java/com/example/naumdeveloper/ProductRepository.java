package com.example.naumdeveloper;

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
        products.add(new Product(1L, "Apple RED"));
        products.add(new Product(7L, "Apple GRIND"));
        products.add(new Product(11L, "MILK "));
        products.add(new Product(17L, "BREAD"));
        products.add(new Product(21L, "DEMO TONICK"));
    }


    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }


    public Optional <Product> findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();

    }


}
