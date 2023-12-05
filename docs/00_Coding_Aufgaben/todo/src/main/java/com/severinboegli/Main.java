package com.severinboegli;

import java.util.ArrayList;
import java.util.Scanner;

import com.severinboegli.Aufgabe.Status;

/**
 * Main Klasse für das Projekt. Hier wird das Programm gestartet.
 * Dies ist ausserdem die Testklasse für die anderen Klassen.
 * @version 1.0
 * @since 2023-11-26
 * @author Severin Bögli
 * @see Benutzer
 * @see SharedList
 * @see Aufgabe
 * @see Bild
 */
public class Main {
    /**
     * Main Methode, welche das Programm startet.
     * @param args Argumente, welche beim Starten des Programms übergeben werden können.
     */
    public static void main(String[] args) {
        // erstellen von einem Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Erstellt 4 Testbenutzer
        Benutzer severin = new Benutzer("Severin", "Bögli", "severinboegli@testmail.com");
        Benutzer peter = new Benutzer();
        Benutzer max = new Benutzer("Max", "Muster", "max.muster@outlook.de");
        Benutzer moritz = new Benutzer("Moritz", "Müller", "moritz.müller@gmail.com");

        // Erstellen von 10 Testlisten
        ArrayList<SharedList> sharedListListe = new ArrayList<SharedList>();
        for (int i = 0; i < 10; i++) {
            sharedListListe.add(new SharedList());
        }

        

        // Modifizieren der Testlisten mit Aufgaben und Benuztern
        sharedListListe.get(0).setName("Hausaufgabenliste");
        sharedListListe.get(0).setBeschreibung("Diese Liste enthält alle Hausaufgaben, die noch gemacht werden müssen");
        sharedListListe.get(0).addBenutzer(severin);
        sharedListListe.get(0).addAufgabe("Mathe", "Aufgabe 1a", 4, Status.ONGOING);
        sharedListListe.get(0).addAufgabe("Deutsch", "Aufsatz schreiben", 5, Status.OPEN);
        sharedListListe.get(0).addAufgabe("Englisch", "Vokabeln lernen", 3, Status.DONE);
        sharedListListe.get(0).addAufgabe("Französisch", "Bild interpretieren.", 1, Status.ONGOING, new Bild("D:\\Franz\\Bilder\\LaSable.jpg", 100, 100, "Bild am Strand"));

        sharedListListe.get(1).setName("Einkaufsliste");
        sharedListListe.get(1).setBeschreibung("Diese Liste enthält alle Einkäufe, die noch getätigt werden müssen");
        sharedListListe.get(1).addBenutzer(severin);
        sharedListListe.get(1).addBenutzer(peter);
        sharedListListe.get(1).addAufgabe();
        sharedListListe.get(1).addAufgabe("Milch", "1 Liter", 1, Status.OPEN);
        sharedListListe.get(1).addAufgabe("Brot", "1 Laib", 1, Status.OPEN);
        sharedListListe.get(1).addAufgabe("Butter", "1 Packung", 1, Status.OPEN);
        sharedListListe.get(1).addAufgabe("Käse", "1 Packung", 1, Status.OPEN, new Bild("D:\\Einkauf\\Spezieller Käse.jpg", 500, 200));
        sharedListListe.get(1).addAufgabe("Wurst", "1 Packung", 1, Status.OPEN);
        sharedListListe.get(1).addAufgabe("Eier", "1 Packung", 1, Status.DONE);
        sharedListListe.get(1).addAufgabe("Mehl", "1 Packung", 1, Status.DONE);

        sharedListListe.get(9).setName("Wunschliste Familie Muster");
        sharedListListe.get(9).setBeschreibung("Diese Liste enthält alle Wünsche, die sich die Familie Muster zu Weihnachten wünscht.");
        sharedListListe.get(9).addBenutzer(severin);
        sharedListListe.get(9).addBenutzer(peter);
        sharedListListe.get(9).addBenutzer(max);
        sharedListListe.get(9).addAufgabe("Buch: Der Herr der Ringe", "Das Buch von J.R.R. Tolkien", 1, Status.ONGOING);
        sharedListListe.get(9).addAufgabe();

        System.out.println("Solle zwei Tasks zeigen");
        sharedListListe.get(9).printAllTasks();
        sharedListListe.get(9).removeAufgabe(10013);
        
        System.out.println("Sollte nur noch einen Task zeigen");
        sharedListListe.get(9).printAllTasks();

        sharedListListe.get(9).addAufgabe("Playstation 5", "Die neue Playstation", 1, Status.DONE);
        sharedListListe.get(9).addAufgabe("Xbox Series X", "Die neue Xbox", 1, Status.DONE);


        // Gibt alles SharedLists aus, alle Benutzer und alle Aufgaben dazu.
        
        for (SharedList sharedList : sharedListListe) {
            sharedList.printOutSharedListFull();
        }

    }
}