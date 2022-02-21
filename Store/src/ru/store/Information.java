package ru.store;

import model.Person;
import java.io.*;
import java.util.Scanner;

public class Information {
    private static String CATALOG_NAME = "person/";
    public static void main(String[] args) {

        System.out.println("Загрузить данные или выгрузить?");
        System.out.println("1. Загрузить");
        System.out.println("2. Выгрузить");

        Scanner s = new Scanner(System.in);
        int choise = s.nextInt();
        if (choise == 1) {

            String personName = s.next();
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(CATALOG_NAME+personName))) {
                dos.writeUTF(personName);
                dos.writeUTF(s.next());
                dos.writeInt(s.nextInt());
                dos.writeInt(s.nextInt());

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (choise == 2){

            String personName = s.next();
            try (DataInputStream dis = new DataInputStream(new FileInputStream(CATALOG_NAME+personName))) {
                Person p1 = new Person(dis.readUTF(),dis.readUTF(),dis.readInt(),dis.readInt());
                System.out.println(p1);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
