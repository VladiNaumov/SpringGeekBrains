package com.geekbrains.spring.naumdeveloper.spring;

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
        products.add(new Product(2L, "Apple GRIND"));
        products.add(new Product(3L, "MILK "));
        products.add(new Product(4L, "BREAD"));
        products.add(new Product(5L, "BEER"));
        products.add(new Product(6L, "Apple GREEN"));
        products.add(new Product(7L, "FRUIT"));
        products.add(new Product(8L, "KAHFI"));
        products.add(new Product(9L, "CHOKO-PAI"));
        products.add(new Product(10L, "PRINGLS"));

        /*
        products.add(new Product( "Apple RED"));
        products.add(new Product( "Apple GRIND"));
        products.add(new Product( "MILK "));
        products.add(new Product( "BREAD"));
        products.add(new Product( "BEER"));
        products.add(new Product( "Apple GREEN"));
        products.add(new Product( "FRUIT"));
        products.add(new Product( "KAHFI"));
        products.add(new Product( "CHOKO-PAI"));
        products.add(new Product( "PRINGLS"));
         */
    }


    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }


    public Optional <Product> findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();

    }


}
