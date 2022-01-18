package staff1;

public class Hostess {
    private String name;
    private   String position;
    private   String experience;

    public Hostess() {
        this.name = name;
        this.position = position;
        this.experience = experience;
    }

    public void sayHello(){
        System.out.println("Приветствует покупателя");
    }

    public  void offerABasket(){
        System.out.println("Предложить корзину для покупок");
    }

    public void escortsToTheDepartment(){
        System.out.println("Сопровождать в отдел");
    }

}
