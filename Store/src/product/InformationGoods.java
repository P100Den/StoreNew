package product;
import model.Goods;
import java.io.*;
import java.util.Scanner;

public class InformationGoods {
    private static String CATALOG_NAME = "goods/";
    public static void main(String[] args) {
        System.out.println("Загрузить данные или выгрузить?");
        System.out.println("1. Загрузить");
        System.out.println("2. Выгрузить");

        Scanner g = new Scanner(System.in);
        int choise = g.nextInt();
        if (choise == 1) {

            String goodsName = g.next();
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(CATALOG_NAME+goodsName))) {
                dos.writeUTF(goodsName);
                dos.writeInt(g.nextInt());
                dos.writeInt(g.nextInt());
                dos.writeUTF(g.next());
                dos.writeUTF(g.next());

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (choise == 2){

            String goodsName = g.next();
            try (DataInputStream dis = new DataInputStream(new FileInputStream(CATALOG_NAME+goodsName))) {
                Goods g1 = new Goods(dis.readUTF(),dis.readInt(),dis.readInt(),dis.readUTF(),dis.readUTF());
                System.out.println(g1);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
