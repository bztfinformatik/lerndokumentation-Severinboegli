# JAVA Theorie

In diesem Abschnitt wird alles rund um Java beschrieben. Es werden wichtige Java Funktionen und Basics dokumentiert. Um Codebeispiele besser darzustellen wrid mit Codesnippes gearbeitet:

```java
System.out.println("Dies ist der Code.");
```

## Referenzen

Eine Referenz ist ein Pointer, der auf ein bestimmtes Objekt zeigt. Wird ein Objekt erstellt, wird eine Referenz erstellt, die auf das Object zeigt.
Weisst man nun dem gleichen Objekt ein andere Variabel zu sind dies voneinander abhängig.
```java
Circle b = new Circle();
Circle c = b;
```
> Hier zeigt der Kreis c auf b, was also das gleiche Element ist.

![Referenzen](referenz.jpeg)

> ändert man den Wert von b, wird sich auch der Wert von c ändern.

### Vergleichen

- Mit dem `==` Operator wird vergleichen ob beide Werte (b & c) auf das gleiche Objekt (Referenz) zeigen.
- Mit der `.equals()` Methode wird geschaut ob der Inhalt der selbe ist, also ob beide Objekte den Parameter "length" auf 10 haben.

## Konstruktor

Ein Konstruktor gibt vor, was beim Erstellen eines Objekts angepasst wird. Der Konstruktor muss immer **gleich wie die Klasse** heissen.

```java
public class Brett {
    private int laenge;

    public Brett(){
        laenge = 10;
    }
    public Brett(int laenge){
        this.laenge = laenge;
    }
}
```

Erstellt man mehrere Konstruktoren, kann man beim inizialisieren entscheiden, welche man auswählen will.
- `Brett()`
- `Brett(30)`

Im Bezug auf die obere Funktion können beide Konstruktoren benutzt werden.
Ein Konstrukur wird viel in Verwendung mit dem `this` benutzt.

## Metoden

Methoden werden benutzt um Parameter kontrolliert verändern zu können. Ebenfalls kann mit einer Funktion ein Event ausgeführt werden, der als Konsequenz eine Veränderung beim Programm bewirkt.

### Getter

```java
public int getPoints(boolean access) {
    if (access == true){
        return points;
    }
}
```

Getter können benutzt werden um Werte von Parametern abzurufen. Ein Parameter sollte als `private` dekliniert werden, damit dieser nur mit dem Getter abgerufen werden kann.

### Setter

```java
public void setPoints(int points) {
    if (points >= 0) {
        this.points = points;
    }
}
```

Mit Setter kann eine Parameter kontrolliert verändert werden. Dies macht Sinn, damit einem Parameter nur sinnvolle Werte zugewiesen werden können.

## Zugriffsmodifikatoren

