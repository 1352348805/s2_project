package b2;

public class Bank extends Thread {

    static String str = new String("str");
    static int money = 500;
    @Override
    public void run() {

        while(true){
            synchronized (str){
                money-=100;
                System.out.println(this.getName()+"取了钱");
            }
        }
    }
}
