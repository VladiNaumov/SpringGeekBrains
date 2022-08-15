package com.demo.counter;

import java.util.ArrayList;
import java.util.List;

public class RepoItems {

    private final List<Items> products;

    public RepoItems() {
        this.products = new ArrayList<>();
        products.add(new Items("Milk", 1.0));
        products.add(new Items("Bread", 1.80));
        products.add(new Items("Apple", 3.40));
        products.add(new Items("Plumb", 17.25));
        products.add(new Items("----", 00.00));

    }

    public void getItems() {

        for (Items s: products) {
            System.out.println(s);
        }
    }
}
