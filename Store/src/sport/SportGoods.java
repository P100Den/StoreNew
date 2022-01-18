package sport;



public class SportGoods {
    public String Sportmaster;
    public String name = Sportmaster;
    public int prise = 1000;
    public String item;
    public String color; // black


    public void checkTheOutputOnTheShelf() {
        System.out.println("Продукт был положен на полку");
    }

    public void takeFromTheShelf() {
        System.out.println("Продукт был взят с полки");
    }

    public void putOnBasket() {
        System.out.println("Продукт был положен в корзину");
    }

    public void testGood() {
        System.out.println("Проведение теста");
    }

    public void buy() {
        System.out.println("Продукт куплен");
    }

    public void name() {
        System.out.println("Спортмастер");
    }


}