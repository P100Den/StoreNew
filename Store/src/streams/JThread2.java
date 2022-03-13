package streams;

public class JThread2 extends Thread{
    private String name;
    public JThread2(String name){
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
