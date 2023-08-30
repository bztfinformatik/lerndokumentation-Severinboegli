# JAVA Theorie {docsify-ignore-all}

In diesem Abschnitt wird alles rund um Java beschrieben. Es werden wichtige Java Funktionen und Basics dokumentiert.

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