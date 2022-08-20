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

    @GetMapping("/market")
    public List<Product> getAllProdukts() {
        return productService.getAllProdukts();
    }

    @GetMapping("/market/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }


    // GET http://localhost:8189/app/market/change_score?productId=1&delta=20
    @GetMapping("/market/change_score")
    public void changeScore(@RequestParam Long productId, @RequestParam Integer delta) {
        productService.changeScore(productId, delta);
    }

/*
    // GET http://localhost:8189/app/hello?a=10&b=20
    @GetMapping("/hello")
    public String helloWork(@RequestParam String a, @RequestParam String b) {
        return "HELLO WORD!!!" + a + b ;
    }

 */

}
