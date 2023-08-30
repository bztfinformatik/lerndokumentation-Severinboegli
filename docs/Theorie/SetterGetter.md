# JAVA Theorie

In diesem Abschnitt wird alles rund um Java beschrieben. Es werden wichtige Java Funktionen und Basics dokumentiert. Um Codebeispiele besser darzustellen wrid mit Codesnippes gearbeitet:



## Metoden

Methoden werden benutzt um Parameter kontrolliert verändern zu können. Ebenfalls kann mit einer Funktion ein Event ausgeführt werden, der als Konsequenz eine Veränderung beim Programm bewirkt.

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
