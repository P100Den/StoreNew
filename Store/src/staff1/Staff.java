package staff1;

public class Staff {
    private String name;
    private String position;
    private String expirience;
    private Cashier cashier;
    private Delivery delivery;
    private Hostess hostess;
    private Merchandiser merchandiser;
    private Service service;
    private ShopAssistant shopAssistant;

    public void sayHello(){
        System.out.println("Приветствует покупателя");
    }
    public void advises(){
        System.out.println("Консультирует");
    }
    public void helpsWithTheChoice(){
        System.out.println("Помогает выбрать");
    }
    public void sayGoodbye(){
        System.out.println("Прощается с покупателями");
    }
}
