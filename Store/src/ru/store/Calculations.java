package ru.store;

import goods.Product;

public class Calculations {
    public static void main(String[] args) {

        int ball = 1000;
        int discount = 200;

        ball = ball - discount;

        System.out.println(ball);


        Product f1 = new Product();
        f1.takeTheGoods();
        int product = 1580;
        int discount1 = 2;
        product = product / discount1;

        System.out.println(product);


    }

}
