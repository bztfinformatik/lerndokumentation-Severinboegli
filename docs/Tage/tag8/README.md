# Inhalte zum Tag 8


## Tätigkeiten

Ich habe heute die Verschiedenen Collection API kennengelernt. Ich habe dazu eine Praxisaufgabe erstellt.
Des Weiteren habe ich eine Übersicht über die verschiedenen Eigenschaften von Collections erstellt.
Ein Benchmark von Github habe ich implementiert, um die Geschwindigkeit der verschiedenen Collections zu vergleichen.

![Collections API](collection_benchmark_memory_usage.png)
![Collections API](collection_benchmark_time_usage.png)

## Theorie
Ich habe heute die Theorie zu den Collections API geschrieben. Ich habe die verschiedenen Eigenschaften von Collections aufgelistet und beschrieben.

- [Collections API](Theorie/Collections_API.md)

## Praxisaufgabe

### Aufgabe 1.1 & 1.2
> Lösung zu Collections 1.1 & 1.2

```java

package com.severinboegli;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /**
         * ----------- ArrayList -----------------
         */
        ArrayList<String> faecher = new ArrayList<String>();
        faecher.add("Mathe");
        faecher.add("Informatik");
        faecher.add("Sport"); // Element hinzufügen

        System.out.print("Meine Lieblingsfächer sind: ");
        for (int i = 0; i < faecher.size(); i++) { // Durch jedes Element durchloopen
            System.out.print(" " + faecher.get(i));
        }

        faecher.set(0, "Programmierung"); // Wert abändern

        /*
         * ------------ LinkedList -----------------
         */
        LinkedList<String> faechers = new LinkedList<>();
        faechers.add("Mathe");
        faechers.add("Informatik");
        faechers.add("Sport"); // Elemente hinzufügen

        System.out.print("Meine Lieblingsfächer sind: ");
        for (int i = 0; i < faecher.size(); i++) { // Durch jedes Element durchloopen
            System.out.print(" " + faecher.get(i));
        }

        faecher.set(0, "Programmierung"); // Wert abändern
    }
}
```

### Aufgabe 1.3
> Lösung zu Aufgabe 1.3 --> Durchschnitt berechnen
```java
package com.severinboegli;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        Random random = new Random();
        double highNumber = 0.0;
        double lowNumber = 6.0;

        for (int i = 0; i < 20; i++) {
            double temp = random.nextInt(51) / 10.0 + 1;
            numbers.add(temp); // Zufällige Numer zwischen 1.0 und 6.0
            if (highNumber < temp){
                highNumber = temp; // Falls Temp grösser ist, wie die grösst Nummer => temp wird zur highNumber
            }
            if (lowNumber > temp){
                lowNumber = temp; // Falls Temp kleiner ist, wie die kleinste Nummer => temp wird zur lowNumer
            }
        }
        
        numbers.remove(highNumber); // Grösste Nummer entfernen
        numbers.remove(lowNumber); // Kleinste Nummer entfernen


        double sum = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = sum / numbers.size(); // Durchschnitt ungerundet
        
        double averageRounded = Math.round(average*2) / 2.0; // Durchschnitt gerundet.

        System.out.println("Der Durchschnitt ist: " + averageRounded );
    }

}
```
### Aufgabe 1.4
> Lösung zur Praxiaufgabe 1.4
```java
// ----------------------------------------------------
/*-------------   Student.java Class ------------------ */
// ----------------------------------------------------

package com.severinboegli;

public class Student {
    private String name;
    private String vorname;
    private int matrikelnummer;

    public Student(String name, String vorname, int matrikelnummer) {
        setName(name);
        setVorname(vorname);
        setMatrikelnummer(matrikelnummer);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }
}

// ----------------------------------------------------
/*-------------   Main.java Class ------------------ */
// ----------------------------------------------------

package com.severinboegli;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Student hans = new Student("Hans", "Müller", 100);
        Student peter = new Student("Peter", "Obster", 101);
        Student johannes = new Student("Johannes", "Meier", 102);

        TreeMap<Integer, Student> studenten = new TreeMap<>(); // TreeMap mit Integer als Key und Student als Value machen.

        // Daten einfügen
        studenten.put(hans.getMatrikelnummer(), hans); 
        studenten.put(peter.getMatrikelnummer(), peter);
        studenten.put(johannes.getMatrikelnummer(), johannes);

        // make a loop => get iterator
        Set set = studenten.entrySet();
        Iterator iterator = set.iterator();

        System.out.println("Alle TreeMap Elemente ausgeben:");
        while(iterator.hasNext()) {
            Map.Entry mapEntry =  (Map.Entry) iterator.next();
            System.out.println("\nSchüler:");
            System.out.println("Name: " + ((Student)mapEntry.getValue()).getName());
            System.out.println("Vorname: " + ((Student)mapEntry.getValue()).getVorname());
            System.out.println("Matrikelnummer: " + ((Student)mapEntry.getValue()).getMatrikelnummer());
        }

        // Nummer abrufen
        System.out.println("Name von Nummer 100: " + studenten.get(100).getName());
    }
}
```

### Aufgabe 1.5
Die Aufgabe 1.5 habe ich unter Collections API im [Unterschied HashSet, LinkedHashSet & TreeSet](Theorie/Collections_API?id=unterschied-hashset-linkedhashset-amp-treeset) Bereich genauer beschrieben.