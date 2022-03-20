package product;

public class PurchaseOfGoods implements Runnable{
    private String fio;
    private String name;
    private int sum;
    private int taskNumber;
    public PurchaseOfGoods(String fio, String name, int sum, int taskNumber){
        this.fio = fio;
        this.name = name;
        this.sum = sum;
        this.taskNumber = taskNumber;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(20000);
            System.out.println("Имя клиента:"+ fio + " наименнование товара:" + name + " стоимость:" + sum + " номер заказа:" + taskNumber);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
