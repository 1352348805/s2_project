package BuyTicket;

public class TestDemo {
    public static void main(String[] args) {
        ServerWindow serverWindow1 = new ServerWindow();
        Thread thread1 = new Thread(serverWindow1,"窗口一");
        Thread thread2 = new Thread(serverWindow1,"窗口二");
        Thread thread3 = new Thread(serverWindow1,"窗口三");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
