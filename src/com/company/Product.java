package com.company;

public class Product {
    private  String name;
    private int quantity = 1;
    private int price;

    public Product (String name,int quantity, int price){
        this.name = name;
        this.quantity  = quantity;
        this.price = price;
    }
    public Product (String name,int price){
        this.name = name;
        this.price = price;
    }

    public String getName (){
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
