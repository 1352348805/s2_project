package Kanbin;

public class TestDemo {
    public static void main(String[] args) {
        Ks ts = new Ks("特殊",2000);
        ts.start();
        Thread.currentThread().setName("普通");
        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName()+"号:第" + i + "号病人");
            if (i == 10){
                try {
                    ts.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
