package com.naumdeveloper.spring.controllers;

import com.naumdeveloper.spring.data.Product;
import com.naumdeveloper.spring.services.IProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ProductsController {

    private IProductsService iProductsService;

    public ProductsController(IProductsService iProductsService) {
        this.iProductsService = iProductsService;
    }

    // base url - http://localhost:8189/market/hello

    @GetMapping("/hello")
    public String helloWork() {
        return "HELLO WORD!!!";
    }

    //- http://localhost:8189/market/products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return iProductsService.getItems();
    }

    @PostMapping("/products")
    public void addNewProduct(@RequestBody Product product) {
        iProductsService.add(product);
    }

    // - http://localhost:8189/market/products/1
    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable AtomicLong id) {
        return iProductsService.findById(id);
    }

    // - http://localhost:8189/market/remove
    @DeleteMapping("/products/remove/")
    public void deleteAll() {
        iProductsService.removeAll();
    }

    // - http://localhost:8189/market/remove_id/1
    @DeleteMapping("/products/remove_id/{id}")
    public boolean deletingId(@PathVariable AtomicLong id) {
        return iProductsService.removeId(id);
    }

}

