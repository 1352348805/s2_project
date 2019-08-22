import area.Circle;

public class TestDemo {

    public static void main(String[] args) {
        Circle c = new Circle();

        c.setWide(10);
        double area = c.GraphArea();
        System.out.println("面积是：" +area);
    }
}
