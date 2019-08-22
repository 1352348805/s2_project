package area;

public class Circle extends Graph{

    private double pi = 3.14;

    @Override
    public double GraphArea() {
        double area = pi * ((super.getWide() /2) * (super.getWide() /2));
        return area;
    }
}
