package BuyTicket;

public class Ssssss extends Thread{

    private static int i = 100; //票数
    private boolean flag = false;   //是否卖完
    static Object object = new Object();

    public Ssssss(String ThreadName) {
        super(ThreadName);
    }

    private void Buy(){

        if (i == 0) {
            flag = true;
            return;
        }

        i--;
        System.out.println(Thread.currentThread().getName() + "卖出了票，当前票数为" + i);


    }
    @Override
    public void run() {

        while (!flag) {
            synchronized (object) {
                Buy();
            }
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.activeCount());
        }
    }
}
