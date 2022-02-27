package ru.store;
import accesssystem.ServiceShop;
import accesssystem.StaffShop;
import goods.Alcohol;
import goods.Product;
import product.*;
import sport.SportGoods;
import staff1.Cashier;
import staff1.Hostess;
import staff1.ShopAssistant;

import java.util.*;

public class Store {
    public static void main(String[] args) {

        ProcessesStore myProcessesStore = new ProcessesStore();

        ClassOfflineStore openStore = Build.buildOfflineStore();

        myProcessesStore.printStaff();

        ClassOfflineStore theBuyerCame = Build.buildOfflineStore1();

        Hostess sayHello = Build.buildHostess();

        myProcessesStore.clientNeedsHelp();

        Hostess offerABasket = Build.buildHostess1();

        Hostess escortsToTheDepartment = Build.buildHostess3();

        ShopAssistant helpsWithTheChoice = Build.buildShopAssistant();

        Adidas checkBrand = Build.buildAdidas();

        myProcessesStore.colorBall();

        SportGoods takeFromTheShelf = Build.buildSportGoods();

        SportGoods testGood = Build.buildSportGoods1();

        SportGoods putOnBasket = Build.buildSportGoods2();

        ShopAssistant sayGoodbye = Build. buildSportGoods3();

        ClassOfflineStore theBuyerGoesToTheCheckout = Build.buildOfflineStore4();

        Cashier Hello = Build.buildCashier();

        Cashier scanGood = Build.buildCashier2();

        Cashier sayTheAmount = Build.buildCashier3();

        Cashier packGood = Build.buildCashier4();

        Cashier Goodbye = Build. buildCashier5();

        myProcessesStore.printPurchase();

        myProcessesStore.countingProductsInTheBasket();

        System.out.println("-------------------------------------------------");

        Alcohol korzinaProductov[] = {new Alcohol("balantais"), new Alcohol("jack daniels")};
       for (Alcohol n1:korzinaProductov){
            System.out.println(n1.getName());
        }
       Alcohol korzinaProductov2[] = new Alcohol[2];
        for (Alcohol i:korzinaProductov2) {
            System.out.println(i.capacity);
        }
        int korzinaProductov1 = 0, korzinaProductov3 = 3;
        while (korzinaProductov1 < 2){
            korzinaProductov1++;
        }
        System.out.println(korzinaProductov1);

        do {
            korzinaProductov1++;
            System.out.println(korzinaProductov1);
        } while (korzinaProductov3 < 2);



        System.out.println("-----------------------------------------------------------------");

        ServiceShop serviceShop = new ServiceShop();
        int idNumber_1 = serviceShop.giveMeNumberId("откройте турникет","14524" );
        int idNumber_2 = serviceShop.giveMeNumberId("откройте турникет","16814" );
        int idNumber_3 = serviceShop.giveMeNumberId("откройте турникет","19344" );
        int idNumber_4 = serviceShop.giveMeNumberId("откройте турникет","17314" );


         List<StaffShop> staffShops = serviceShop.getStaffShops();
         List<Integer>apass = serviceShop.getApass();
         List<StaffShop>apassToStaffShop = serviceShop.getApassToStaffShop();

         for (int i = 0; i< apassToStaffShop.size(); i++){
             System.out.println("ApassId:" + i + "StaffShop:" + apassToStaffShop.get(i).toString());
         }


        System.out.println("-----------------------------------------------------------------");

        Map<String, Product> map = new HashMap<>();
        populateMap(map);

        System.out.println(map.get("2014786"));

       }

       public static void populateMap(Map<String, Product> map1){
        map1.put("2014786", new Apple(2014786,"Яблоко зеленое","Фрукты", 60));
        map1.put("2334627", new Orange("Апельсин","Фрукты", 40));
        map1.put("1042163", new Milk("Молоко простоквашино","Молочные продукты",54));
        map1.put("4013452", new Chips("Чипсы лейс","Снэк",120));
        map1.put("5374532", new Soda("Кока кола","Напиток",100));
       }




}