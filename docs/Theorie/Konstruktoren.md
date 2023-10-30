# Konstruktor

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

Diese Möglichkeit, wenn man mehrere Konstruktoren oder Methoden von einer Klasse aufrufen kann, nennt man Überladung. Es können sehr viele Konstruktoren gemacht werden, der entscheidene Punkt wie viele erstellt werden können, bestimmen jedoch die Datentypen, die übergeben werden. Es können nicht in zwei unterschiedlichen Konstruktoren nur ein String übergeben werden, da Java mit Hilfe der Datentypen unterscheidet und nicht dem Platzhaltername.

Im Bezug auf die obere Funktion können beide Konstruktoren benutzt werden.
Ein Konstrukur wird viel in Verwendung mit dem `this` benutzt.

## Fragen

<div class="question-box">
  Was passiert wenn kein Konstruktor erstellt wird?
</div>
<br>
Wird keine Konstruktor in der Klasse angegeben oder erstellt, wird ein Standartkonstruktur aufgerufen. Dieser Standartkonstruktor ist standartmässig leer.
<br>
<br>
<div class="question-box">
  Was heisst überladen bei Konstruktoren/Methoden?
</div>
<br>
Mit überladen ist gemeint, dass man für eine Klasse mehrere Konstruktoren machen, die je nach Übergabewert einen anderen Konstruktor aufruft. Sieht man sich das Beispiel oben an, sieht man, dass die Konstrukoren überladen wurden. Es gibt ein Konstruktor Brett ohne Input und ein Konstruktor Brett mit Input int.
Das gleiche kann mit Methoden gemacht werden. Je nachdem welcher Input mitgegeben wird, wird eine andere Methode aufgerufen.
<br>
<br>
<div class="question-box">
    Was macht der Konstruktor?
</div>
<br>
Ein Konstruktor bestimmt der Bauplan wie ein Objekt erstellt wird, sieht oben.




