package ch.bztf;

public class Point {
    private double x = 0;
    private double y = 0;

    public Point (double x, double y){
        setX(x);
        setY(y);
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public void setX(double x) {
        this.x = validate(x);
    }

    public void setY(double y) {
        this.y = validate(y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double[] getCordinates() {
        return new double[]{x,y};
    }

    public boolean equals(Point point){
        return this.getX() == point.getX() && this.getY() == point.getY();
    }

    private double validate(double value){
        if (value <= 100 && value >= -100) {
            return value;
        } else {
            System.out.println("Warning! Value is not between -100 and 100");
            System.out.println("Value is set to 0");
            return 0;
        }

    }
}
