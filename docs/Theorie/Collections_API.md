# JAVA Theorie {docsify-ignore-all}

## Collections API

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

### ArrayList

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

### LinkedList

Eine LinkedList ist sehr ähnlich zu einer ArrayList. Beide basieren auf eine List, weshalb auch beide die die gleichen Methoden haben. Im Gegensatzu zu einer ArrayList werden in einer LinkedList die Daten in einem Container gespeichert, der auf einen weiteren Contrainer verlinkt. Man sollte eine LinkedList verwendet, wenn man oft *Daten manipulieren* möchte.

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

### HashMap

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

### HashSet
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


<a id="myfootnote1">1</a>: "first in, first out", bezeichnet einen Datensatz, bei dem alle Elemente, die dazu kommen hinten angefügt werden. Beim Aufrufen wird also das älteste Element als erstes abgerufen. <br>
<a id="myfootnote2">2</a>: "last in, first out", bezeichnet einen Datensatz, bei dem alle Elemente, die dazu kommen voran angefügt werden. Beim Aufrufen wird also das neuste Element als erstes abgerufen.
