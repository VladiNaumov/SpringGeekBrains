package com.geekbrains.spring.geekbrains.spring.demo5.market;

import org.springframework.stereotype.Component;

@Component
public interface UserRepository {
    User findByUsername(String username);
}
