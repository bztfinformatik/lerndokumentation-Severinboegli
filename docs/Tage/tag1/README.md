# Inhalte zum Tag 1


## Tätigkeiten
> Docsify eingerichtet und funktionsfähig gemacht.

Heute habe ich angefangen mit dem ersten der Projekts. Ich kann nun in den verschiedenen "README" Dateien eine Dokumentation schreiben. Damit ich das Projekt ausführen konnte musste ich folgenden Code eingeben:

- *Befehlt:* `docker-compose up`
- *Clear Cache (bei Fehlermeldung)*: `docker compose build --no-cache`

## Theorie
Heute habe ich zu folgenden Themen eine Theorie aufgeschrieben:
- [Referenzen und Vergleiche](Theorie/Referenzen_Vergleich.md)
- [Konstruktoren](Theorie/Konstruktoren.md)
- [Methoden, Setter, Getter](Theorie/SetterGetter.md)

## Programmieraufgabe

**Aufgabenstellung**: Erstellen eines Programs, dass mit Hilfe von Punkten Dreieck und Vierecke als Klassenobjekt erstellen kann.
Damit ich ein Dreieck oder ein Viereck erstellen muss, sollte zuerst die Point Klasse definiert werden mit zwei wichtigen Parameter:
- X Koordinate
- Y Koordinate

> Point.java Klasse
```java
public class Point {
    private int x = 0;
    private int y = 0;

    public Point (int x, int y){
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getCordinates() {
        return new int[]{x,y};
    }
}
```
Hier wurde eine Klasse erstellt mit Getter und Setter. Beim Inizialisieren müssen dem Konstruktor zwei Parameterm mitgegeben werden.

Da ein Viereck vier Punkte braucht, sollte jedem Viereck vier Objekte "Point" mitgegeben werden.
Am einfachsten ist es hier mit Arrays zu arbeiten und wieder Getter und Setter zu setzten.

> Viereck.java Klasse
```java
public class Viereck {
    private Point[] points;

    public Viereck(Point a, Point b, Point c, Point d){
        setPoints(new Point[]{a,b,c,d});
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }
}
```

Bei der Dreiecksklasse wird das Selbe gemacht wie bei dem Viereck mit Ausnahme, dass es nun nur drei Punkte sind. In der Setter Funktion könnte man nun definieren, dass kein Punkt am selben Ort wieder der andere Punkt liegen darf. Dies könnte man nun abfangen und ein Fehler ausgeben.

> Dreieck.java Klasse
```java
public class Dreieck {
    private Point[] points;

    public Dreieck(Point a, Point b, Point c) {
        setPoints(new Point[]{a,b,c});
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }
}
```

Nun können Dreieck und Vierecke erstellt werden und mit dem Getter abgerufen werden:

> Main.java Klasse
```java
public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(-5, 0);
        Point pointB = new Point(10, 1);
        Point pointC = new Point(9, 4);
        Point pointD = new Point(-1, 5);

        Dreieck dreieckA = new Dreieck(pointA,pointB,pointC);

        Viereck viereckA = new Viereck(pointA, pointB, pointC, pointD);

        System.out.println("Dreieck Kordinaten von Punkt B:");
        System.out.println("X Achse: " + dreieckA.getPoints()[1].getX());
        System.out.println("Y Achse: " + dreieckA.getPoints()[1].getY());
        System.out.println("-------------");
        System.out.println("Viereck Kordinaten von Punkt D");
        System.out.println("X Achse: " + viereckA.getPoints()[3].getX());
        System.out.println("Y Achse: " + viereckA.getPoints()[3].getY());
    }
}
```


## Schwierigkeiten

> Docsify auf Windows

Es war zu Beginn anspruchsvoll Docker auf Windows verwenden zu können, da Docker wie viele Dinge auf Linux basiert.

## To Do

- [X] Einrichtung abschliessen
- [X] Hausaufgaben machen
- [X] Java anschauen