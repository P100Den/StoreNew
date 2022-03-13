package streams;

public class ParallelStreams {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 9; i++){
           new JThread("положить яблоко в корзину" + i).start();
           new JThread2("положить апельсин в корзину" + i).start();
        }
    }
}
