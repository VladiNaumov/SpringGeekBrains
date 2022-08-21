package com.market.web.data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.concurrent.atomic.AtomicLong;

public class Product {
    private Long id;
    private String name;

    private Double price;
    @NotNull
    @Size(min = 0, max = 25)
    private Integer discount;
    private Double summa;
    private static final AtomicLong COUNTER = new AtomicLong(0);

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSumma() {
        return summa;
    }

    public void setSumma(Double summa) {
        this.summa = summa;
    }
    public Product() {
    }
    public Product(String name, Double price) {
        this.id = COUNTER.incrementAndGet();
        this.name = name;
        this.price = price;
        this.discount = 0;
        this.summa = 0.00;
    }
}
