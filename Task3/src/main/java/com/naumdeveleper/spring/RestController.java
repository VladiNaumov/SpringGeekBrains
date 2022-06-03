package com.naumdeveleper.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

    // base url - http://localhost:8000/market
    @GetMapping("/products")
    @ResponseBody
    public String testDemoServer(){

        return "HELLO WORD!!!";
    }
}
