package patterns.decorator;

public class MessengerApp implements Notifier {

    private Notifier notifier;
    public MessengerApp(Notifier notifier){this. notifier = notifier;}
    public MessengerApp(){}
    @Override
    public void send(String message) {
        if (notifier!=null) notifier.send(message);
        System.out.println("Сообшение отправлено:" + message);
    }
}
