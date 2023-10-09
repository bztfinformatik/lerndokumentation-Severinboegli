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

        TreeMap<Integer, Student> studenten = new TreeMap<>();// TreeMap mit Integer als Key und Student als Value machen.

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