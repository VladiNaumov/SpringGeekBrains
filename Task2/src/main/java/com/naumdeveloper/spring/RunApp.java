package com.naumdeveloper.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CartService cartService = context.getBean(CartService.class);

        System.out.println(cartService.getCurrentCart());
        cartService.addToCartByProductId(1L);
        System.out.println(cartService.getCurrentCart());

        ProductRepository productRepository = context.getBean(ProductRepository.class);
        System.out.println(productRepository.findAll());
        System.out.println(productRepository.findById(17L));


        context.close();



    }
}
