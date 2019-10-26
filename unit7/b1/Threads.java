package b1;

public class Threads extends Thread {

    public Threads(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while(i <= 5){
            i++;
            System.out.println(this.getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        Threads t1 = new Threads("A");
        Threads t2 = new Threads("B");
        t1.start();
        t2.start();
    }
}
