package staff1;

public class Merchandiser {
    private String name;
    private String position;
    private   int price;
    private Cashier cashier;


    public Merchandiser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void layoutGood(){
        System.out.println("Планирование");
    }

    public int CheckThePrice(){
        System.out.println("Цена:"+ price);
        return price;
    }
   public void printPriceTag(){
        System.out.println("Печатать ценник");
    }
   public void replaceOfPriceTag(){
        System.out.println("Замена ценников");
    }
}
