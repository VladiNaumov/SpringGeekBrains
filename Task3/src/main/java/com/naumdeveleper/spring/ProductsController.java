package com.naumdeveleper.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    private ProductsRepository productsRepository;

    public ProductsController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    // base url - http://localhost:8000/prisma/

    @GetMapping("/hello")
    public String helloWork(){
        return "HELLO WORD!!!";
    }


    @GetMapping("/products")
    public List<Product> getAllProducts() {
            return productsRepository.getItems();
        }
    }

