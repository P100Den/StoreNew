package model;

public class Goods {
    public String name;
    public int productCode;
    public int price;
    public  String item;
    public String category;

    public Goods (String name, int productCode,int price, String item, String category) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.item = item;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", productCode=" + productCode +
                ", price=" + price +
                ", item='" + item + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
