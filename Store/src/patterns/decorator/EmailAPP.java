package patterns.decorator;

public class EmailAPP implements Notifier{
    private Notifier notifier;
    public EmailAPP(Notifier notifier){
        this. notifier = notifier;
    }
    public EmailAPP (){}
    @Override
    public void send(String message) {
        if (notifier!=null) notifier.send(message);
        System.out.println("Email отправлен:" + message);
    }
}
