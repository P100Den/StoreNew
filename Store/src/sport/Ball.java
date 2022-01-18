package sport;
public class Ball extends SportGoods{
    private String type; // football
    private String size; // 20
    private String matter; // leather
    private String weight;
    private String brand;// adidas
    private String color; // black
    private int price; //1000
    private String guaranteePeriod; // 1
    private String item;
    private String shape;

        public Ball(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public String setColor(String color) {
            this.color = color;
            return color;
        }

        public void checkBrand() {
            System.out.println("ru.store.Adidas");
        }

        public void byuBall() {
            System.out.println("Черный мяч");
        }

        public void putOnTheShelf() {
            System.out.println("Продукт был положен на полку");
        }

        public void takeFromTheShelf() {
            System.out.println("Продукт был взят с полки");
        }

        public void choiceProduct() {
            System.out.println("Выбор продукта");
        }

        public void visualInspectoin() {
            System.out.println("Продукт был осмотрен");
        }

        public void putOnBasket() {
            System.out.println("Продукт был положен в корзину");
        }

        public void buy() {
            System.out.println("Продукт куплен");
        }


    }
