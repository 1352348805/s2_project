package BuyTicket;

public class ServerWindow implements Runnable{

    private static int i = 100; //票数

    private void Buy(){
        while(true) {
            synchronized (this) {


                if (i == 0) {
                    return;
                }

                i--;
                System.out.println(Thread.currentThread().getName() + "卖出了票，当前票数为" + i);
            }
        }

    }
    @Override
    public void run() {

                Buy();


    }
}
