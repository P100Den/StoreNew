package ru.store;

import sport.Ball;

public class ProcessesStore {

    public void countingProductsInTheBasket() {
        int countingProductsInTheBasket = 0, countingProductsInTheBasket2 = 21;
        while (countingProductsInTheBasket < 20){
            countingProductsInTheBasket++;
        }
        System.out.println(countingProductsInTheBasket);

        do {
            countingProductsInTheBasket++;
            System.out.println(countingProductsInTheBasket);
        } while (countingProductsInTheBasket2 < 20);
    }

    public  void printPurchase() {
        boolean blackBall = true;
        if (blackBall) System.out.println("Покупка совершена");
    }

    public  void colorBall() {
        Ball color = new Ball("черный");
        System.out.println(color.getColor());
        Ball color1 = new Ball("черный");
        System.out.println(color1.setColor("белый"));
    }

    public  void clientNeedsHelp() {
        if (theClientNeedsHelp()){
            System.out.println("Консультант не подходит");
        } else
            System.out.println("Консультант оказывает помощь");
    }

    public  void printStaff() {
        for (int staff = 0; staff < 50;){
            staff++;
            System.out.println(staff);
        }
    }

    private  boolean theClientNeedsHelp() {
        return false;
    }
}
