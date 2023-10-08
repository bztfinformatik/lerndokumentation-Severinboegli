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