package staff1;

public class ShopAssistant {
    private String name;
    private String position;
    private   String experience;


    public ShopAssistant() {
        this.name = name;
        this.position = position;
        this.experience = experience;
    }

    public  void sayHello(){
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
