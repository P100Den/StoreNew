package product;

import goods.Product;

public class Soda extends Product {
    public String name;
    public int price;
    public  String item;
    public String category;

    public Soda(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Soda{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", item='" + item + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
