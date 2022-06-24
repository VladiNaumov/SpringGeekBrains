package com.camera.spring.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ShopService shopService = context.getBean("shopService", ShopService.class);
        shopService.buy();
        ((AnnotationConfigApplicationContext) context).close();
    }
}
