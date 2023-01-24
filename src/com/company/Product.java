package com.company;

public class Product {
    private  String name;
    private int quantity;
    private int price;
    private int cod;

    public Product (int cod,String name,int quantity, int price){
        this.cod = cod;
        this.name = name;
        this.quantity  = quantity;
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

    public int getCod() {
        return cod;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){

        return  "Код: " + getCod() + ". "+
                "Наименование: " + getName() +
                " Цена: " + getPrice() +" pуб.";

    }

}
