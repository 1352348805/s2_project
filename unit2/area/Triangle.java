package area;

public class Triangle extends Graph {

    @Override
    public double GraphArea() {
        double area = super.getHigh() * super.getWide() / 2;
        return area;
    }
}
