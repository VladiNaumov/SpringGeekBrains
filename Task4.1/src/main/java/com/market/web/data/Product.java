package com.market.web.data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.concurrent.atomic.AtomicLong;

public class Product {
    private Long id;
    private String name;

    private Double price;
    @NotNull
    @Max(25)
    private Integer discount;
    private String summa;
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

    public String getSumma() {
        return summa;
    }

    public void setSumma(String summa) {
        this.summa = summa;
    }
    public Product() {
    }
    public Product(String name, Double price) {
        this.id = COUNTER.incrementAndGet();
        this.name = name;
        this.price = price;
        this.discount = 0;
        this.summa = "0.00";
    }
}
