package com.market.web.controllers;

import com.market.web.data.Product;
import com.market.web.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/prisma")
    public List<Product> getAllProduct() {
        return productService.getAllStudents();
    }

    @GetMapping("/prisma/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }

    @GetMapping("/prisma/change_score")
    public void changeScore(@RequestParam Long studentId, @RequestParam Integer delta) {
        productService.changeScore(studentId, delta);
    }
}
