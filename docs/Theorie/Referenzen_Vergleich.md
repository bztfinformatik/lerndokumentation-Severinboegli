# Referenzen

Eine Referenz ist ein Pointer, der auf ein bestimmtes Objekt zeigt. Wird ein Objekt erstellt, wird eine Referenz erstellt, die auf das Object zeigt.
Weisst man nun dem gleichen Objekt ein andere Variabel zu sind dies voneinander abhängig.
```java
Circle b = new Circle();
Circle c = b;
```
> Hier zeigt der Kreis c auf b, was also das gleiche Element ist.

![Referenzen](referenz.jpeg)

> ändert man den Wert von b, wird sich auch der Wert von c ändern.

## Vergleichen

- Mit dem `==` Operator wird vergleichen ob beide Werte (b & c) auf das gleiche Objekt (Referenz) zeigen.
- Mit der `.equals()` Methode wird geschaut ob der Inhalt der selbe ist, also ob beide Objekte den Parameter "length" auf 10 haben.

## Instanzen

Eine Instanz ist ein Objekt von einer gewissen Klasse. Beim Erstellen dieser Instanz wurde ein Objekt nach Vorgabe der Klasse erstellt. Eine Instanz ist also ein entstandenes Objekt nach Vorgaben der Klasse.
<div class="question-box">
  Was bedeutet "ein Instanz erstellen"?
</div>
<br>
Spricht man von einer Instanz erstellen, meint man, dass man ein Objekt von einer Klasse nach einem gewissen Bauplan erstellt. Wir eine Klasse also instanziert, wird im Hintergrund ein Objekt erstellt und die Referenz zeigt auf das Objekt. Diese Informationen sind in der Instanz gespeichert.
<br><br>
<div class="question-box">
  Ist die Variabel instanzTestKonto1 eine Variable oder eine Referenz?
</div>
<br>
Die Variabel instanzTestKonto1 ist eine Referenzvariabel, in der Variabel wird die Refernez gespeichert, also die Verlinkung zum richtigen Objekt. Auf die Frage bezogen ist instanTestKonto1 also eine Referenz.
<br><br>
<div class="question-box">
  Was passiert technisch im Speicher, wenn Sie instanzTestKonto1 = instanzTestKonto machen?
</div>
<br>
Wenn man instanzTestKonto1 = instanzTestKonto1 macht, wird der Referenz von instanzTestKonto01 gesagt, dass die Verlinkung nun die selbe ist wie die von instanzTestKonto1.
Der Pointer von instanzTestKonto zeigt nun auf instanzTestKonto1. Nun hängen beide zusammen und wird ein Wert verändert, wird auch die andere Verändert.
<br>