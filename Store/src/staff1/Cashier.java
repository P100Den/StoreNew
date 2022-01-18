package staff1;

public class Cashier {
    private String name;
    private String position;
    private String experience;
    private Merchandiser merchandiser;

    public Cashier() {
        this.name = name;
        this.position = position;
        this.experience = experience;
        this.merchandiser = merchandiser;
    }

    public  void Hello(){
        System.out.println("Приветствует покупателя");
    }
    public  void scanGood(){
        System.out.println("Проведено сканирование товара");
    }

    public  void sayTheAmount(){
        System.out.println("Назвать сумму");
    }
    public void priceCheck(){
        System.out.println("Проверка цены");
    }
    public void packGood(){
    System.out.println("Упаковка");
    }
    public  void Goodbye(){
        System.out.println("Прощается с покупателями");
    }

}
