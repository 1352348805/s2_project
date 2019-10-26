package b1;

public class Runnables implements Runnable {


    @Override
    public void run() {
        int i = 0;
        while(i <= 5){
            i++;
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        Runnables runnables = new Runnables();
        Thread t1 = new Thread(runnables,"A");
        Thread t2 = new Thread(runnables,"B");
        t1.start();
        t2.start();
    }
}
