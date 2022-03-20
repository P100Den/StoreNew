package streams;
import product.PurchaseOfGoods;
import product.SpecialOffers;

import java.util.Random;
import java.util.Scanner;

public class ThreadAPP {
    public static void main(String[] args) {
        Random r = new Random();
        boolean isActive = true;
        while (isActive) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Добро пожаловать");
            System.out.println("Выберите товар");
            System.out.println("1. Купить товар");
            System.out.println("2. Есть промокод?");
            String result = sc.next();
            int taskNumber = r.nextInt(100000);

            if ("1".equals(result)) {
                System.out.println("Введите ФИО");
                String fio = sc.next();
                System.out.println("Введите название товара");
                String name = sc.next();
                System.out.println("Введите сумму");
                Integer sum = Integer.valueOf(sc.next());
                PurchaseOfGoods goods = new PurchaseOfGoods(fio,name, sum, taskNumber);
                new Thread(goods).start();

            } else if ("2".equals(result)) {
                System.out.println("Введите ФИО");
                String fio = sc.next();
                System.out.println("Введите промокод");
                String promoCode = sc.next();
                System.out.println("Введите название товара");
                String name = sc.next();
                System.out.println("Введите сумму");
                Integer sum = Integer.valueOf(sc.next());
                SpecialOffers goods = new SpecialOffers(fio,promoCode, name, sum,taskNumber);
                new Thread(goods).start();

            }
            System.out.println("Спасибо за покупку приходите еще!");
            System.out.println("Номер заказа:" + taskNumber);
            System.out.println("Нажмите кнопку выход для завершение работы");
            String exit = sc.next();
            if ("Выход".equals(exit)){
                isActive = false;
            }
        }
    }
}