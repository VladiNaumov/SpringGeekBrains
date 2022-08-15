package com.demo.counter;

import java.util.concurrent.atomic.AtomicLong;

public class Items {

    private static final AtomicLong COUNTER = new AtomicLong(1);
    private Long ID;
     private String title;

     private double cost;

    public Items( String title, double cost) {
        ID = COUNTER.getAndIncrement();
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Items{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
