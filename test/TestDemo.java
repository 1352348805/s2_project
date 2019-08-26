import area.Circle;
import classDemo.Animal;
import classDemo.Cat;
import classDemo.People;
import org.junit.Test;
import page116x4.Store;
import page88x5.DotMatrixPrinter;
import page88x5.InkpetPrinter;
import page88x5.LaserPrinter;
import page88x5.Printer;
import page89x6.Friends;
import page89x6.Niu;
import page89x6.Wang;

public class TestDemo {

    @Test
    public void t1() {
        Animal cat = new Cat("莉莉");
        cat.setHealth(50);
        People p = new People("a");
        p.getFood(cat);
    }

    @Test
    public void t2() {
        Printer dotMatrixPrinter = new DotMatrixPrinter();
        Printer inkpetPrinter = new InkpetPrinter();
        Printer laserPrinter = new LaserPrinter();
        dotMatrixPrinter.print();
        inkpetPrinter.print();
        laserPrinter.print();
    }

    @Test
    public void t3() {

        Friends wang = new Wang();
        Niu niu = new Niu();
        niu.serveFriend(wang);

    }



}
