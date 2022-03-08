package patterns.decorator;

public class TelegramAPP implements Notifier {
    private Notifier notifier;
    public TelegramAPP(Notifier notifier) {
        this.notifier = notifier;
    }
    public TelegramAPP (){}
    @Override
    public void send(String message) {
        if (notifier!=null) notifier.send(message);
        System.out.println("Telegram отправлен:" + message);
    }
}