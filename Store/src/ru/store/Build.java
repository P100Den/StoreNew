package ru.store;

import sport.SportGoods;
import staff1.Cashier;
import staff1.Hostess;
import staff1.ShopAssistant;

public class Build {

    public static Cashier buildCashier5() {
        Cashier Goodbye = new Cashier();
        Goodbye.Goodbye();
        return Goodbye;
    }

    public static Cashier buildCashier4() {
        Cashier packGood = new Cashier();
        packGood.packGood();
        return packGood;
    }

    public static Cashier buildCashier3() {
        Cashier sayTheAmount = new Cashier();
        sayTheAmount.sayTheAmount();
        return sayTheAmount;
    }

    public static Cashier buildCashier2() {
        Cashier scanGood = new Cashier();
        scanGood.scanGood();
        return scanGood;
    }

    public static Cashier buildCashier() {
        Cashier Hello = new Cashier();
        Hello.Hello();
        return Hello;
    }

    public static ClassOfflineStore buildOfflineStore4() {
        ClassOfflineStore theBuyerGoesToTheCheckout = new ClassOfflineStore();
        theBuyerGoesToTheCheckout.theBuyerGoesToTheCheckout();
        return theBuyerGoesToTheCheckout;
    }

    public static ShopAssistant buildSportGoods3() {
        ShopAssistant sayGoodbye = new ShopAssistant();
        sayGoodbye.sayGoodbye();
        return sayGoodbye;
    }

    public static SportGoods buildSportGoods2() {
        SportGoods putOnBasket = new SportGoods();
        putOnBasket. putOnBasket();
        return putOnBasket;
    }

    public static SportGoods buildSportGoods1() {
        SportGoods testGood = new SportGoods();
        testGood.testGood();
        return testGood;
    }

    public static SportGoods buildSportGoods() {
        SportGoods takeFromTheShelf = new  SportGoods();
        takeFromTheShelf.takeFromTheShelf();
        return takeFromTheShelf;
    }


    public static Adidas buildAdidas() {
        Adidas checkBrand = new Adidas();
        checkBrand.checkBrand();
        return checkBrand;
    }

    public static void buildClassOfflineStore() {
    }

    public static ShopAssistant buildShopAssistant() {
        ShopAssistant helpsWithTheChoice = new ShopAssistant();
        helpsWithTheChoice.helpsWithTheChoice();
        return helpsWithTheChoice;
    }

    public static Hostess buildHostess3() {
        Hostess escortsToTheDepartment = new Hostess();
        escortsToTheDepartment.escortsToTheDepartment();
        return escortsToTheDepartment;
    }

    public static Hostess buildHostess1() {
        Hostess offerABasket = new Hostess();
        offerABasket.offerABasket();
        return offerABasket;
    }

    public static Hostess buildHostess() {
        Hostess sayHello = new Hostess();
        sayHello.sayHello();
        return sayHello;
    }

    public static ClassOfflineStore buildOfflineStore1() {
        ClassOfflineStore theBuyerCame = new ClassOfflineStore();
        theBuyerCame.theBuyerCame();
        return theBuyerCame;
    }

    public static ClassOfflineStore buildOfflineStore() {
        ClassOfflineStore openStore = new ClassOfflineStore();
        openStore. openStore();
        return openStore;
    }
}
