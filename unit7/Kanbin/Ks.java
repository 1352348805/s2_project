package Kanbin;

public class Ks extends Thread{

    int count = 10;
    int i = 0;
    int time;

    public Ks(String TreadName,int time) {
        super(TreadName);
        this.time = time;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this){
                if (i == count){
                    break;
                }
                i++;
                System.out.println(this.getName() + "号：第"+i+"号病人！");
            }

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
