package com.naumdeveleper.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @GetMapping("/hello")
    public String helloWork(){

        return "HELLO WORD!!!";
    }


    // base url - http://localhost:8000/prisma
    @GetMapping("/products")
    public String testDemoServer(){

        return "HELLO WORD (/products)!!!";
    }
}
