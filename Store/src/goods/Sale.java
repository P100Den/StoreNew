package goods;

public class Sale {
    public String paymentType;
    public  String serviceTime;

    public Sale(String paymentType, String serviceTime) {
        this.paymentType = paymentType;
        this.serviceTime = serviceTime;
    }

    public  void consultation(){
        System.out.println("Проведена консультация");
    }

    public void priceCheck(){
        System.out.println("Проверка цены");
    }
    public void scanGood(){
        System.out.println("Проведено сканирование товара");
    }
    public void getACheck(){
        System.out.println("Получин чек");
    }
}
