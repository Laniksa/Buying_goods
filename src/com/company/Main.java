package com.company;

public class Main {
    public static int maxProduct = 10;
    public static int numberProduct = 0;
    public static Product[] products = new Product[maxProduct];

    public static void addShop(Product product){
        products[numberProduct] = product;
        numberProduct++;
    }

    public static void main(String[] args) {
	    Product bread = new Product("Хлеб", 30);
        Product banana = new Product("Банан", 7);
        Product oil = new Product("Масло", 100);
        Product cookies = new Product ("Печенье", 70);
        Product fish = new Product ("Рыба", 150);
        Product meat = new Product ("Мясо", 200);



    }
}
