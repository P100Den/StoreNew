package patterns.decorator;

public class Messenger {
    public static void main(String[] args) {
        Notifier e = new EmailAPP();
        Notifier t = new TelegramAPP(e);
        Notifier m = new MessengerApp(t);
        m.send("Заказ готов к выдаче");

    }
}
