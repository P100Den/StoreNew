package streams;

public class JThread extends Thread {
    private String name;
    public JThread(String name){
        super(name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + "started");
        try {
            Thread.sleep(100);
        }catch (InterruptedException ex){
            System.out.println("Thread has been interrupted");
        }
        System.out.println(Thread.currentThread().getName() + "finished");
    }
}
