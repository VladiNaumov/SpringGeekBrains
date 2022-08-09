package com.naumdeveloper;

import java.util.concurrent.atomic.AtomicLong;

public class Product {
    private long ID;
     private String title;
     private int cost;

    private final AtomicLong identity = new AtomicLong(0);

    public Product(String title, int cost) {
        this.ID = identity.incrementAndGet();
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
