package com.market.web.repositories;

import com.market.web.data.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product>products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(List.of(
                new Product("Maitoa", 0.98),
                new Product("Perunoita", 0.75),
                new Product("Omena", 2.25),
                new Product("Banaani", 0.99),
                new Product("Kefir", 1.20),
                new Product("Kerma", 1.60),
                new Product("Suklata", 2.80),
                new Product("Ananaas",2.10),
                new Product("Sipulia", 0.65),
                new Product("KOKA-KOLA",2.40)
        ));
    }

    public List<Product> getAllStudents() {
        return Collections.unmodifiableList(products);
    }

    public void deleteById(Long id) {
        products.removeIf(s -> s.getId().equals(id));
    }

    public Product findById(Long id) {
        return products.stream().filter(s -> s.getId().equals(id)).findFirst().get();
    }
}
