package com.naumdeveleper.spring;

public class Product {

    private long ID;
    private String title;
    private double price;

    public Product() {
    }

    public Product(long ID, String title, double price) {
        this.ID = ID;
        this.title = title;
        this.price = price;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
