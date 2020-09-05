package com.tienda.models;

import com.tienda.models.patterns.observer.Subject;

public class Stock extends Subject {
    private double price;
    private String product;


    public Stock(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObs();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
