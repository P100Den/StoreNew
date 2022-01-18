package ru.store;

public class ClassOfflineStore {
    public String name; // Magnit
    public  String square; // 400
    public  String workHouse; // 8:00 - 22:00

    public ClassOfflineStore() {
        this.name = name;
        this.square = square;
        this.workHouse = workHouse;
    }

    public  void openStore(){
        System.out.println("Магазин был открыт");

    }

    public void theBuyerCame(){
        System.out.println("Пришел покупатель");
    }

    public void theBuyerGoesToTheCheckout(){
        System.out.println("Покупатель отправляется на кассу");
    }

    public void closeStore(){
        System.out.println("Магазин был закрыт");
    }

    public  void checkWorkHous(){
        System.out.println("Проверить время работы");
    }


}
