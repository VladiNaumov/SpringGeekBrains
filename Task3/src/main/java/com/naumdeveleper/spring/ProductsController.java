package com.naumdeveleper.spring;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductsController {

    private IProductsService iProductsService;

    public ProductsController(IProductsService iProductsService) {
        this.iProductsService = iProductsService;
    }

    // base url - http://localhost:8000/prisma/

    @GetMapping("/hello")
    public String helloWork() {
        return "HELLO WORD!!!";
    }


    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return iProductsService.getItems();
    }

    @PostMapping("/products")
    public void addNewProduct(@RequestBody Product product) {
        iProductsService.add(product);
    }

    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return iProductsService.findById(id);
    }

    @DeleteMapping("/products/remove/")
    public void deleteAll() {
        iProductsService.removeAll();
    }

    @DeleteMapping("/products/remove_id/{id}")
    public boolean deleteAll(@PathVariable Long id) {
        return iProductsService.removeId(id);
    }

}

