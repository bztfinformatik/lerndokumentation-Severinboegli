package com.severinboegli;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Kunde> kunden = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            kunden.add(new Kunde());
        }

        // Namen der Kunden setzen
        kunden.get(0).setName("Hans");
        kunden.get(1).setName("Peter");
        kunden.get(2).setName("Urs");
        kunden.get(3).setName("Nina");
        kunden.get(4).setName("Helene");

        ArrayList<Buch> buecher = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            buecher.add(new Buch());
        }

        // Titel der Bücher setzen
        buecher.get(0).setTitel("Der Herr der Ringe");
        buecher.get(1).setTitel("Der kleine Prinz");
        buecher.get(2).setTitel("Harry Potter");
        buecher.get(3).setTitel("Der Alchimist");
        buecher.get(4).setTitel("Der Name der Rose");
        buecher.get(5).setTitel("Der Medicus");
        buecher.get(6).setTitel("Der Vorleser");
        buecher.get(7).setTitel("Der Schatten des Windes");
        buecher.get(8).setTitel("Der Schwarm");
        buecher.get(9).setTitel("Der Pate");
        buecher.get(10).setTitel("Der Fänger im Roggen");
        buecher.get(11).setTitel("Der Graf von Monte Christo");
        buecher.get(12).setTitel("Der Hobbit");
        buecher.get(13).setTitel("Der Zauberberg");
        buecher.get(14).setTitel("Der Steppenwolf");
        buecher.get(15).setTitel("Der Prozess");


        // Ausleihen
        kunden.get(0).BuchLeihen(buecher.get(0));
        kunden.get(0).BuchLeihen(buecher.get(1));
        kunden.get(0).BuchLeihen(buecher.get(2));
        kunden.get(0).BuchLeihen(buecher.get(3));

        kunden.get(1).BuchLeihen(buecher.get(4));
        kunden.get(1).BuchLeihen(buecher.get(0));

        // Ausgeliehen Bücher anzeigen
        for (Kunde kunde : kunden) {
            kunde.ListeAusgeben();   
        }

    }
}