package product;

public class SpecialOffers implements Runnable{
    private String fio;
    private String promoCode;
    private String name;
    private int sum;
    private int taskNumber;
    public SpecialOffers(String fio,String promoCode, String name, int sum, int taskNumber){
        this.fio = fio;
        this.promoCode = promoCode;
        this.name = name;
        this.sum = sum;
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20000);
            System.out.println("Имя клиента:"+ fio + "промокод:"+ promoCode + " наименнование товара:" + name + " стоимость:" + sum + " номер заказа:" + taskNumber);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
