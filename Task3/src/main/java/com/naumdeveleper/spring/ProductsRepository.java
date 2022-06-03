package com.naumdeveleper.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductsRepository {
    private List<Product> items;

    @PostConstruct
    public void init() {
        this.items = new ArrayList();
                items.add(new Product(1L, "Milk", 1.10));
                items.add(new Product(2L, "Bread", 1.5));
                items.add(new Product(1L, "Apple", 2.10));
                items.add(new Product(2L, "Plumb", 4.5));
    }

    public List<Product> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void add(Product product) {
        items.add(product);
    }
}
