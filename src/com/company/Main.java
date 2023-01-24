package com.company;

import java.util.Scanner;

public class Main {
    public static int maxProduct = 10;
    public static int maxProductBasket = 20;
    public static int numberProduct = 0;
    public static int numberProductBasket = 0;
    public static Product[] products = new Product[maxProduct];
    public static Product[] productsBasket = new Product[maxProductBasket];
    public static int count = 1;
    public static Scanner scan = new Scanner(System.in);

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

    public static void choiceProduct(Scanner scanCod, Scanner scanQuantity){
        int pCod = scanCod.nextInt();
        int pQuantity = scanQuantity.nextInt();
        for(int i = 0; i < numberProduct; i++){
            if(pCod == products[i].getCod()){
                products[i].setQuantity(pQuantity);
                addBasket(products[i]);
            }
        }
    }
    public static boolean menu (){
        System.out.println("Меню магазина: \n");
        for (int i = 0; i < numberProduct; i++) {
            System.out.println(products[i].toString());
        }
        while (true){
            int num1;
            System.out.println("Действия: \n"+
                    "1. Наполнить корзину \n" +
                    "2. Выход");
            num1 = scan.nextInt();

            switch (num1){
                case 1:
                    while(true){
                        int num2;
                        System.out.println("1.Добавить \n" +
                                "2.Сумма покупки");
                        num2 = scan.nextInt();
                        switch(num2){
                            case 1:
                                System.out.println("Выберите продукт и его количество: ");
                                choiceProduct(scan, scan);
                                break;
                            case 2:
                                System.out.println("Итоговая сумма: "+ amount(productsBasket) + " руб.");
                                return false;
                        }

                    }


                case 2:
                    System.out.println("Программа завершена");
                    return false;

            }
        }
    }

        public static void main (String[]args){

            Product bread = new Product(1,"Хлеб", 1, 30);
            Product banana = new Product(2,"Банан", 1, 7);
            Product oil = new Product(3,"Масло", 1, 100);
            Product cookies = new Product(4,"Печенье", 1, 70);
            Product fish = new Product(5,"Рыба", 1, 150);
            Product meat = new Product(6,"Мясо", 1, 200);

            addShop(bread);
            addShop(banana);
            addShop(oil);
            addShop(cookies);
            addShop(fish);
            addShop(meat);
            menu();

        }

}
