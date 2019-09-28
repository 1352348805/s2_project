package Hiking;

public class Pashan extends Thread{

    private int journey = 1500;
    private int time;

    public Pashan(String ThreadName,int time) {
        super(ThreadName);
        this.time = time;
    }

    @Override
    public void run() {

        while (true){
            synchronized (this){
                if (journey <= 0)
                    break;
            }
            journey -=100;
            System.out.println(this.getName() + "跑了100米");
            try {
                this.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(this.getName() + "跑完了");
    }
}
