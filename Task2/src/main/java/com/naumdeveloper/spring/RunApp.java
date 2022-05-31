package com.naumdeveloper.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
Задание
1. Есть класс Product (id, название, цена).
Товары хранятся в бине ProductRepository, в виде List<Product>,
при старте в него нужно добавить 5 любых товаров.
2. ProductRepository позволяет получить весь список или один товар по id.

Создаем бин Cart, в который можно добавлять и удалять товары по id.
3. Написать консольное приложение, позволяющее управлять корзиной.
4. При каждом запросе корзины из контекста, должна создаваться новая корзина.

 */

public class RunApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // операции с первой  корзиной
        CartService cartService = context.getBean(CartService.class);
        System.out.println("Who is now ? " + cartService.getCurrentCart());
        cartService.addToCartByProductId(1L);
        System.out.println("Who is now ? " + cartService.getCurrentCart());
       // cartService.removeFromCart("Apple RED");
        System.out.println("Who is now ? " + cartService.getCurrentCart());

        // вторая  корзина
        CartService cartService1 = context.getBean(CartService.class);
        System.out.println("Who is now ? " + cartService1.getCurrentCart());




        /*
        // операции с продуктами
        ProductService productService = context.getBean(ProductService.class);
        System.out.println(productService.findById(3L));
        System.out.println(productService.findById(17L));

         */

        context.close();



    }
}
