package product;

import goods.Product;

public class Apple extends Product {
    public int productCode;
    public String name;
    public int price;
    public  String item;
    public String category;


    public Apple(int productCode, String name, String category, int price) {
        this.productCode = productCode;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "productCode=" + productCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", item='" + item + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
