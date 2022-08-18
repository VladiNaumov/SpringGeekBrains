package com.demo.counter;

import java.util.ArrayList;
import java.util.List;

public class RepoItems {

    private final List<Items> products;

    public RepoItems() {
        this.products = new ArrayList<>(List.of(
                new Items("Milk", 1.0),
                new Items("Bread", 1.80),
                new Items("Milk", 1.0),
                new Items("Apple", 3.40),
                new Items("Plumb", 17.25)

        ));

    }

    public void getItems() {

        for (Items s: products) {
            System.out.println(s);
        }
    }
}
