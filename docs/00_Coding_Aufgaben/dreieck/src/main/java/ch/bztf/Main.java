package ch.bztf;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(1, 12);
        Point pointB = new Point(5, 52);
        Point pointC = new Point(1, 22);
        Point pointD = new Point(-2, -8);
        Point pointE = new Point(-1, -8);
        Point pointF = new Point(-102, -8);

        //Dreieck dreieckA = new Dreieck(pointA,pointB,pointC);

        Viereck viereckA = new Viereck(pointA, pointB, pointC, pointD);

        Dreieck dreieck = new Dreieck(pointA, pointB, pointC);
        System.out.println("Koordinaten des ersten Dreiecks: ");
        System.out.println(dreieck.getPointsToString());

        System.out.println("Koordinaten des zweiten Dreiecks: (Abänderung auf eine Gerade, was nicht möglich ist)");
        dreieck.setPoints(pointA, pointB, pointE);
        System.out.println(dreieck.getPointsToString());

        System.out.println("Koordinaten des dritten Dreiecks: (nach möglicher Abänderung)");
        dreieck.setPoints(pointA, pointB, pointD);
        System.out.println(dreieck.getPointsToString());
    }
}