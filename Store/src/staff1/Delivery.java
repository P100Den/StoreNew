package staff1;

public class Delivery {

    private String typeDelivery;
    private   String timeDelivery;
    private String distance;
    private   String adress;
    private   String trackingNumber;

    public Delivery(String typeDelivery, String timeDelivery, String distance, String adress, String trackingNumber) {
        this.typeDelivery = typeDelivery;
        this.timeDelivery = timeDelivery;
        this.distance = distance;
        this.adress = adress;
        this.trackingNumber = trackingNumber;
    }

    public  void productLoaded(){
        System.out.println("Загрузка товара");
    }
    public  void goodsOfTranzit(){
        System.out.println("Транспортировка товара");
    }

    public  void orderDelivered(){
    System.out.println("Передача заказа");
    }

}
