package ch.bztf;

public class Viereck {
    private Point[] points;

    public Viereck(Point a, Point b, Point c, Point d){
        setPoints(a, b, c, d);
    }

    public void setPoints(Point a, Point b, Point c, Point d) {
        if (validateSquare(a, b, c, d)){
            this.points = new Point[]{a,b,c,d};
            System.out.println("Möglich");
        } else {
            System.out.println("Koordinaten sind auf einer Gerade");
        }
    }

    public Point[] getPoints() {
        return points;
    }

    /* Prüft alle möglichen Kombinationen, um mit drei der vier Punkte ein Dreieck zu bilden. */
    private boolean validateSquare(Point a, Point b, Point c, Point d) {
        if (!validateTriangle(b, c, d)) {
                return false;
            }

        if (!validateTriangle(a, c, d)) {
                return false;
            }
            
            
        if (!validateTriangle(a, b, d)) {
                return false;
            }
            
        if (!validateTriangle(a, b, c)) {
                return false;
            }    

        return true;
    }

    /* Damit ein Dreieck möglich ist, muss beim Viereck ebenfalls ein Dreieck möglich sein, wenn man einen Punkt entfernt. */
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
}
