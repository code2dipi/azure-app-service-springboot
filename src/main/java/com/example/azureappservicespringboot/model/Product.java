package com.example.azureappservicespringboot.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private long qnt;
    private double price;

    public Product(String name, long qnt, double price) {
        this.name = name;
        this.qnt = qnt;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQnt() {
        return qnt;
    }

    public void setQnt(long qnt) {
        this.qnt = qnt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", qnt=" + qnt +
                ", price=" + price +
                '}';
    }
}
