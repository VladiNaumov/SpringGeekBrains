package com.market.web.controllers;

import com.market.web.data.Product;
import com.market.web.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET http://localhost:8189/app/market
    @GetMapping("/market")
    public List<Product> getAllProdukts() {
        return productService.getAllProdukts();
    }


    // GET http://localhost:8189/app/market/delete/1
    @GetMapping("/market/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }



    // POST http://localhost:8189/app/market/change_discount?productId=2&delta=20
    @PostMapping("/market/change_discount")
    public void changeScore( @RequestParam Long productId, @RequestParam Integer delta) {
        productService.changeDiscount(productId, delta);
    }


    /*  @Valid THIS METHOD DOESN'T WORK...... */
    /*
    @PostMapping("/market/change_discount")
    public void changeScore( @Valid  Product product, BindingResult bindingResult, @RequestParam Long productId, @RequestParam Integer delta) {
        productService.changeDiscount(productId, delta);
    }

     */

    // GET http://localhost:8189/app/products?productId=1&delta=20
    @PostMapping("/products")
    public void addNewProduct(@RequestBody Product product) {
        productService.add(product);
    }


    // GET http://localhost:8189/app/hello?a=10&b=20
    @GetMapping("/hello")
    public Integer helloWork(@RequestParam Integer a, @RequestParam Integer b) {
        return  a + b ;
    }



}
