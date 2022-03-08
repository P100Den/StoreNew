package ru.store;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать");
        System.out.println("Введите код товара");
        String productCode = sc.next();
        boolean codeNotOk = proccesProductCode(productCode);
        if (codeNotOk) {
            System.out.println("Введите категорию товара");
            String productCategory = sc.next();
            proccesproductCategory(productCategory);
        }
        }
    private static boolean proccesProductCode(String productCode)  {
        try {
            if (productCode.length() > 7) {
                throw new java.lang.Exception("Введенный номер кода товара привышает 7 символов" + productCode.length());
            }else if (productCode.length() < 7){
                throw new java.lang.Exception("Введенный номер кода товара меньше 7 символов" + productCode.length());
            }
            System.out.println("Товар выбран:" + productCode);
        }catch (java.lang.Exception e){
            System.out.println( e.getMessage());
            e.printStackTrace();
            return true;
        }
        return false;
    }
    private static void proccesproductCategory(String productCategory) {
        System.out.println("Выбранная категория товара:"+ productCategory);
    }
}
