package area;

public class Trapezoid extends Graph{

    public int getTop_wide() {
        return top_wide;
    }

    public void setTop_wide(int top_wide) {
        this.top_wide = top_wide;
    }

    public int getBottom_wide() {
        return bottom_wide;
    }

    public void setBottom_wide(int bottom_wide) {
        this.bottom_wide = bottom_wide;
    }

    private int top_wide;
    private int bottom_wide;

    @Override
    public double GraphArea() {
        double area = (top_wide + bottom_wide) * super.getHigh() / 2;
        return area;
    }
}
