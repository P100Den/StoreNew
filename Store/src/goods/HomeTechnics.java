package goods;

public class HomeTechnics {
    public String name;
    public  int prise;
    public  String item;
    public  String color;
    public  String guaranteePeriod;
    public  String manufacturer;

    public HomeTechnics(String name, int prise, String item, String color, String guaranteePeriod, String manufacturer) {
        this.name = name;
        this.prise = prise;
        this.item = item;
        this.color = color;
        this.guaranteePeriod = guaranteePeriod;
        this.manufacturer = manufacturer;
    }

    public void putOnTheShelf(){
        System.out.println("Продукт был положен на полку");
    }
    public void takeFromTheShelf(){
        System.out.println("Продукт был взят с полки");
    }

    public void visualInspection(){
        System.out.println("Продукт был осмотрен");
    }

    public void putOnBasket(){
        System.out.println("Продукт был положен в корзину");
    }
    public  void buy(){
        System.out.println("Продукт куплен");
    }
}
