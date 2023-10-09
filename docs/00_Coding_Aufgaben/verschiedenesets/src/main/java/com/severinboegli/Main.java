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