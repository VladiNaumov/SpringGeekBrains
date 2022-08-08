package com.example.geekbrains.market3;


import com.example.geekbrains.market2.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.geekbrains.spring.market3"})
public class Market3Config {
    @Bean
    public DemoBean demoBean() {
        return new DemoBean("Java");
    }
}