package com.naumdeveloper;

import java.util.concurrent.atomic.AtomicLong;

public class Product {
    private long ID;
     private String title;
     private int cost;

    private static final AtomicLong COUNTER = new AtomicLong(0);

    public Product(String title, int cost) {
        this.ID = COUNTER.incrementAndGet();
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
