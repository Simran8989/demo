
package com.example.model;
public class Product{

    String name;
    int quantity;
    double price;
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {}
    public int getQuantity() {}
    public void setQuantity(int quantity) {}
    public double getPrice() {
        return price;
    }
}