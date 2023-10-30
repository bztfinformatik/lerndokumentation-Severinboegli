# Metoden

Methoden werden benutzt um Parameter kontrolliert verändern zu können. Ebenfalls kann mit einer Funktion ein Event ausgeführt werden, der als Konsequenz eine Veränderung beim Programm bewirkt.

## Methodensignatur

Spricht man von der Methodensignatur, meint man damit, was der Methode mitgegeben wird & wie der Name ist. In den untenstehenden Methoden ist die Methodensignatur also ```add(int x, int y)``` Jedoch darf die Methodensignatur beim Überladen von Methodne oder Konstruktoren nicht gleich sein, da dies sonst zu einem Fehler führt.

```java
public void add(int x, int y){
    System.out.println(x + y);
}

private int add(int x, int y){
    return x + y;
}

// Dies ist nicht möglich, beide Methoden haben die gleiche Methodensignatur.
```

## Getter

```java
public int getPoints(boolean access) {
    if (access == true){
        return points;
    }
}
```

Getter können benutzt werden um Werte von Parametern abzurufen. Ein Parameter sollte als `private` dekliniert werden, damit dieser nur mit dem Getter abgerufen werden kann.

## Setter

```java
public void setPoints(int points) {
    if (points >= 0) {
        this.points = points;
    }
}
```

Mit Setter kann eine Parameter kontrolliert verändert werden. Dies macht Sinn, damit einem Parameter nur sinnvolle Werte zugewiesen werden können.

