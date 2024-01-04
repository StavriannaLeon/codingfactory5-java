package gr.aueb.cf.ch15;

public class Point2D extends Point {
    private double y;

    public Point2D() {
//        super();
//        y = 0.0;
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String convertToString() {
        return super.convertToString() + "(" + y + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }
}
