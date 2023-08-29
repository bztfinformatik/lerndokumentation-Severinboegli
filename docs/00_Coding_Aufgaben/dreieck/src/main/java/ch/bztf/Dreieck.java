package ch.bztf;

public class Dreieck {
    private Point[] points;

    public Dreieck(Point a, Point b, Point c) {
        setPoints(a, b, c);
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point a, Point b, Point c) {
       if (validateTriangle(a, b, c)){
            this.points = new Point[]{a,b,c};
            System.out.println("Möglich");
        } else {
            System.out.println("Koordinaten sind auf einer Gerade");
        }
    }

    private boolean validateTriangle(Point a, Point b, Point c) {
        if (a.getX() != b.getX()) {
            double[] value = linearFunction(a, b);
            if (calcFunction(c.getX(), value[0], value[1]) == c.getY()) {
                return false;
            }
            else {
                return true;
            }
        } 
        else if(a.getX() != c.getX()) {
            double[] value = linearFunction(a, c);
            if (calcFunction(b.getX(), value[0], value[1]) == b.getY()) {
                return false;
            }
            else {
                return true;
            }
        } 
        else {
            return false;
        }
    }

    private double[] linearFunction(Point firstPoint, Point secondPoint ){
        double m = (firstPoint.getY()-secondPoint.getY()) / (firstPoint.getX() - secondPoint.getX());
        double q = firstPoint.getY() - (m * firstPoint.getX());
        return new double[]{m,q};
    }

    private  double calcFunction(double value, double m, double q) {
        return value*m + q;
    }

    public String getPointsToString() {
        String text = "Koordinaten: \n";
        for (int i = 0; i < points.length; i++) {
            text += "X: " + points[i].getX() + " | Y: " + points[i].getY() + "\n";
        }
        return text;
    }
}
