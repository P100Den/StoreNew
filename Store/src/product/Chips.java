package product;

import goods.Product;

public class Chips extends Product {
    public String name;
    public int price;
    public  String item;
    public String category;

    public Chips(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", item='" + item + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
