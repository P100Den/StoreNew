package staff1;

public class Service {
    private String name;
    private int price;
    private String time;
    private   String quality;

    public Service(String name, int price, String time, String quality) {
        this.name = name;
        this.price = price;
        this.time = time;
        this.quality = quality;
    }

    public void servicePerformed(){
        System.out.println("Выполнена услуга");
    }

    public void feedbackService(){
        System.out.println("Выполнена обратная связь");
    }
}
