package com.camera.spring.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void createOrder() {
        System.out.println("Заказ сформирован");
    }
}
