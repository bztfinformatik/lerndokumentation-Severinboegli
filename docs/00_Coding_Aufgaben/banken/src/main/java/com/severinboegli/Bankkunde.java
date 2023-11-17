package com.severinboegli;

import java.util.ArrayList;
import java.util.Scanner;

public class Bankkunde {
    private Scanner scanner = new Scanner(System.in);
    private String nachname;
    private ArrayList<Konto> konten = new ArrayList<>();

    public void neuesKonto(){
        System.out.println("Konto wird erstellt.");
        if (konten.size() <= 4) {
            System.out.println("Es konnte ein Konto hinzugefügt werden. Bitte geben sie die Kontonummer ein.");
            
            // Create number
            int nummer = 0;

            boolean breakLoop = false;
            while (!breakLoop) {
                try {
                nummer = scanner.nextInt();
                } 
                catch (Exception e) {
                System.out.println("Es ist ein Fehler bei der Eingabe der Nummer entstanden. Bitte geben sie erneuert die Kontonummer ein.");
                breakLoop = false;
                continue;
                }

                if (nummer >= 1000 & nummer < 10000) {
                    breakLoop = true;
                }
                else {
                    System.out.println("Die Zahl ist nicht vierstellig, bitte gib eine vierstellige Zahl ein.");
                }

            }
            
            
            konten.add(new Konto(nummer));
        } else {
            System.out.println("Es wurden bereits vier Konten erstellt, weshalb momentan kein zusätzliches Konto hinzugefügt werden kann.");
        }
    }

    public void ausgabe() {
        System.out.println("Nachname: " + nachname);
        System.out.println("----- Konten anzeigen -----");
        System.out.println("Es sind folgende Konten verfügbar:");
        for (Konto konto : konten) {
            System.out.println("- Kontonummer: " + konto.getKontoNummer());
        }
    }

    public Bankkunde() {
        neuesKonto();
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }
}
