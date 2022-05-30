package com.geekbrains.spring.demo4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class NumberGenerator implements INumberGenerator {
    @Override
    public int generateInt() {
        return (int)(Math.random() * 1000);
    }
}
