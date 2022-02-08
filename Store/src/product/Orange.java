package product;

import goods.Product;

public class Orange extends Product {
    public String name;
    public int price;
    public  String item;
    public String category;

    public Orange(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", item='" + item + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
