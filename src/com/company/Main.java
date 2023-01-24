package com.company;

import java.util.Scanner;

public class Main {
    public static int maxProduct = 10;
    public static int maxProductBasket = 20;
    public static int numberProduct = 0;
    public static int numberProductBasket = 0;
    public static Product[] products = new Product[maxProduct];
    public static Product[] productsBasket = new Product[maxProductBasket];

    public static void addShop(Product product){
        products[numberProduct] = product;
        numberProduct++;
    }

    public static void addBasket(Product product){
        productsBasket[numberProductBasket] = product;
        numberProductBasket++;
    }

    public static int amount (Product[] products){
        int sum = 0;
        for (int i = 0; i < numberProductBasket; i++){
           sum+= productsBasket[i].getPrice()*productsBasket[i].getQuantity();
        }
        return sum;
    }

    public static String showProduct(Product[] products) {
        String str = "";
        for (int i = 0; i < products.length - 1; i++) {
            str = (products.toString());
        }
        return str;
    }

        public static void main (String[]args){

            Product bread = new Product("Хлеб", 1, 30);
            Product banana = new Product("Банан", 1, 7);
            Product oil = new Product("Масло", 1, 100);
            Product cookies = new Product("Печенье", 1, 70);
            Product fish = new Product("Рыба", 1, 150);
            Product meat = new Product("Мясо", 1, 200);

            addShop(bread);
            addShop(banana);
            addShop(oil);
            addShop(cookies);
            addShop(fish);
            addShop(meat);

            Scanner scan = new Scanner(System.in);
            System.out.println("Меню магазина: \n");
            for (int i = 0; i < numberProduct; i++) {
                    System.out.println(products[i].toString());
                }
            //String str = scan.nextLine();



        }

}
