# JAVA Theorie

## Collections API

> - [ArrayList](#arraylist)
> - [LinkedList](#linkedlist)
> - [HashMap](#hashmap)
> - [TreeMap](#treemap)
> - [HashSet](#hashset)

Eine Gemeinsamkeit, die alle Collections haben, ist, dass sie alle Daten speichern und ausgeben können. Die verschiedenen Collections machen die alle auf eine unterschiedliche Art und Weise. Dabei sollte man sich die Frage stellen, welche Eigenschaft einem am wichtigsten ist, damit man möglichst effizient und sinnvoll die Daten speichern und abrufen kann.

**Folgende Eigenschaften sind dabei zu beachten:**

| Eigenschaft | Beschreibung | Collection |
| ----------- | ----------- | ---------- |
| Ordnung | Müssen die Daten sortiert werden können? | [ArrayList](Theorie/Collections_API?id=arraylist), [LinkedList](Theorie/Collections_API?id=linkedlist) |
| Einzigartikeit | Darf es Duplikate geben? | [HashSet](Theorie/Collections_API?id=hashset), LinkedHashSet, TreeSet |
| Suchen | Müssen die Daten effizient gesucht werden können? | Verwante Collections mit Tree |
| Zugriff auf die Daten | Sollen die Daten über einen Index zugreifbar sein? | [ArrayList](Theorie/Collections_API?id=arraylist), [LinkedList](Theorie/Collections_API?id=linkedlist) |
| Stabilität der Daten | Wird der Datensatz oft verändert? | [LinkedList](Theorie/Collections_API?id=linkedlist) |
| Identifikation der Daten | Gibt es eine Schlüsseleigenschaft (Key) | [HashMap](Theorie/Collections_API?id=hashmap), LinkedHashMap, TreeMap |
| Reihenfolge von Datensätzen | gibt es ein LIFO <sup>[1](#myfootnote1)</sup> / FIFO<sup>[2](#myfootnote2)</sup> | Verwandte Collections mit Queues |

Aufgrund dieser Kriterien kann nun entschieden werden welche Collections verwendet werden sollten. Dies können je nach Anwendung auch verschiedene Collections sein.

## ArrayList


Eine ArrayList ist sehr verwandt mit einem normalen Array. Im Unterschied dazu, ist eine Arrayliste dynamisch erweiterbar. Will man, dass die Daten sortiert sind und in der Reihenfolge aufgerufen werden, macht eine Arraylist Sinn. In einer ArrayList werden die Daten normal in einer Array gespeichert.

**Syntax:**
```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

// Funktionen
cars.add("Volvo"); // Element hinzufügen
cars.get(0); // Auf Element zugreifen
cars.set(0,"BMW"); // Datensatz ändern
cars.remove(0); // Element entfernen
cars.size() // Grösse des Array ausgeben lassen

// Durch Arrayliste loopen
for (int i = 0; i < cars.size; i++) {
    System.out.println(cars.get(i));
}
```

## LinkedList

Eine LinkedList ist sehr ähnlich zu einer ArrayList. Beide basieren auf eine List, weshalb auch beide die die gleichen Methoden haben. Im Gegensatz zu einer ArrayList werden in einer LinkedList die Daten in einem Container gespeichert, der auf einen weiteren Contrainer verlinkt. Man sollte eine LinkedList verwendet, wenn man oft *Daten manipulieren* möchte.

**Syntax:**
```java
import java.util.LinkedList;

LinkedList<String> cars = new LinkedList<String>(); // Create an LinkedList

// Funktionen
cars.add("Volvo");
cars.get(0);
cars.addFirst("Auto");
cars.removeLast();
cars.getLast();

// Durch Arrayliste loopen
for (int i = 0; i < cars.size; i++) {
    System.out.println(cars.get(i));
}    
```

## HashMap

Eine HashMap werden Werte immer mit einem Schlüssel zusammen gespeichert. Dies ermöglicht, dass man mit dem Schlüssel den Wert abrufen kann. Ein Key und Value zusammen ergeben ein Pair.

**Syntax:**
```java
import java.util.HashMap; // import the HashMap class

HashMap<String, String> voci = new HashMap<String, String>();

// Funktionen

// Fügt Schlüssel und Wert hinzu. (Begriff, Übersetzung)
voci.put("Haus","house"); //    
voci.put("Tisch","table");
voci.get("Tisch");
voci.remove("Tisch");
voci.clear();
voci.size();

// Loop
for (String i : voci.values()) {
  System.out.println(i); // Gibt alle Werte aus.
}

for (String i : voci.keySet()) {
  System.out.println("key: " + i + " value: " + voci.get(i)); // Gibt den Schlüssel und den Wert aus.
}
```

## TreeMap
Ein TreeMap ist sehr ähnlich wie ein HashMap, im Unterschied zu einer HashMap wird bei einer TreeMap der Wert nicht in einem Hashtable gespeichert sondern in einem Binärbaum. Dies ermöglicht, dass die Werte in einer TreeMap sortiert sind. Eine TreeMap kann verwendet werden, wenn die Werte sortiert und spezifisch abgerufen werden müssen.

**Syntax:**
```java
TreeMap<String, Integer> number = new TreeMap<>();

        number.put("Eins", 1); // Numbern hinzufügen
        number.put("Zwei", 2);

        TreeMap<String, Integer> otherNumbers = new TreeMap<>();
        otherNumbers.put("Drei", 3);
        otherNumbers.putAll(number); // Map einer anderen Map hinzufügen

        System.out.println("Alle Werte ausgeben:" + otherNumbers.entrySet()); // Alle Werte ausgeben: [Drei=3, Eins=1, Zwei=2]
        System.out.println("Keys: " + otherNumbers.keySet()); // Keys: [Drei, Eins, Zwei]
        System.out.println("Value: " + otherNumbers.values()); // Value: [3, 1, 2]

        number.get("Eins"); // Wert abrufen über den Key
        number.remove("Eins"); // Entfernt das Paar und gibt den Wert aus.
        number.remove("Eins", 1); // Entfernt den Wert nur, wenn der Key mit dem Wert übereinstimmt => gibt ein boolean aus.

        otherNumbers.firstEntry(); // erster Wert
        otherNumbers.lastKey(); // letzter Schlüssel

        otherNumbers.lowerEntry("Eins"); // gibt den nächstkleineren Wert des Schlüssels als Wert zurück

        // Weitere Funktionen
        otherNumbers.containsKey("Eins"); // prüft ob ein Schlüssel in der Map vorkommt
        otherNumbers.size(); // gibt die Grösse aus
```

Wichtig zu erwähnen ist es, dass eine TreeMap die Element in alphabetischer Reihenfolge ordnet. Dies kann beim Abrufen praktisch sein.


## HashSet
Eine Set wird benutzt, wenn ein Wert nur einmal vorkommen darf. Im Unterschied zu einer LinkedHashSet werden die Werte in einer HashSet in einer zufälligen Reihenfolge gespeichert.

**Syntax:**
```java
import java.util.HashSet; // Import the HashSet class

HashSet<String> cars = new HashSet<String>();

// Funktionen
cars.add("Volvo");
cars.add("BMW");
cars.add("Volvo");
System.out.println(cars); // --> [Volvo, BMW]
cars.contain("Mazda");
cars.remove("Volvo");

// Loop
for (String i : cars) {
  System.out.println(i);
}
```

## Unterschied HashSet, LinkedHashSet & TreeSet
Ein HashSet, ein LinkedHashSet und eine TreeSet sind zwar alle ein Set, also ein Wert kann nur einmal gespeichert werden, jedoch unterscheiden sie sich, wie der Wert gespeichert wird.

* **HashSet:** Ein HashSet speichert die Werte in zufälliger Reihenfolge, da er beim Abruf mit Hilfe des Keys darauf zugreift.
* **LinkedHashSet:** Ein LinkedHashSet ist in der Art und Weise sehr ähnlich zu der HashSet, ausser, dass er seine Werte in der hinzugefügten Reihenfolge ordnet und auch bei einem Loop so abruft.
* **TreeSet:** Ein TreeSet speichert sich die Werte in alphabetischer Reihenfolge, also wird bei einem Loop das "1" vor dem "5" ausgegeben.

> Beispiel der Set => siehe unten für output!

```java
package com.severinboegli;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int anzahlZahlen = 10;

        // Mit Werten füllen
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("Werte: ");
        for (int i = 0; i < anzahlZahlen; i++) {
            int temp = (int) (Math.random() * 100) + 1;
            System.out.print(temp + " ");
            hashSet.add(temp);
            linkedHashSet.add(temp);
            treeSet.add(temp);
        }

        System.out.print("\nLinkedHashSet: [");
        for (Integer integer : linkedHashSet) {
            System.out.print(" " + integer);
        }
        System.out.print("]\n");

        System.out.print("HashSet: [");
        for (Integer integer : hashSet) {
            System.out.print(" " + integer);
        }
        System.out.print("]\n");

        System.out.print("TreeSet: [");
        for (Integer integer : treeSet) {
            System.out.print(" " + integer);
        }
        System.out.print("]\n");

    }
}

/*
 OUTPUT:

    Werte: 
    2 85 82 74 81 39 35 29 28 67
    LinkedHashSet: [ 2 85 82 74 81 39 35 29 28 67]
    HashSet: [ 81 2 82 35 67 85 39 74 28 29]
    TreeSet: [ 2 28 29 35 39 67 74 81 82 85]
    
 */
```


<a id="myfootnote1">1</a>: "first in, first out", bezeichnet einen Datensatz, bei dem alle Elemente, die dazu kommen hinten angefügt werden. Beim Aufrufen wird also das älteste Element als erstes abgerufen. <br>
<a id="myfootnote2">2</a>: "last in, first out", bezeichnet einen Datensatz, bei dem alle Elemente, die dazu kommen voran angefügt werden. Beim Aufrufen wird also das neuste Element als erstes abgerufen.
