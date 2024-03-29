package com.geekbrains.spring.naumdeveloper.spring;

import java.util.concurrent.atomic.AtomicLong;

public class Product {
    private Long id;
    private String title;

    private final AtomicLong identity = new AtomicLong(0);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product() {
    }

    public Product(Long id, String title) {
       // this.id = identity.incrementAndGet();
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
