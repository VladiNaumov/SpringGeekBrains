package com.naumdeveloper;

public class Product {
     int ID;
     String title;
     int cost;

    public Product(int ID, String title, int cost) {
        this.ID = ID;
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
