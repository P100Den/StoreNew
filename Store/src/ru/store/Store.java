package ru.store;
import goods.Alcohol;
import sport.SportGoods;
import staff1.Cashier;
import staff1.Hostess;
import staff1.ShopAssistant;
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

       }





}