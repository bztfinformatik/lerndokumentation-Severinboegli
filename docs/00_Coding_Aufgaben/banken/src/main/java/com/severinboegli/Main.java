package com.severinboegli;

public class Main {
    public static void main(String[] args) {
        Bankkunde Severin = new Bankkunde();
        Severin.setNachname("Boegli");
        Severin.neuesKonto();

        Bankkunde Antonia = new Bankkunde();
        Antonia.setNachname("Schneider");

        // Es können nur vier Konten erstellt werden, beim 5. Konto wird folgende
        // Meldung angezeigt:
        // --> "Es wurden bereits vier Konten erstellt, weshalb momentan kein
        // zusätzliches Konto hinzugefügt werden kann."
        for (int i = 0; i < 5; i++) {
            Antonia.neuesKonto();
        }

        Severin.ausgabe();
        /*
         * AUSGABE:
         * 
         * ----- Konten anzeigen -----
         * Es sind folgende Konten verfügbar:
         * - Kontonummer: 1002
         * - Kontonummer: 1010
         */

        Antonia.ausgabe();
        /*
         * AUSGABE:
         * 
         * Nachname: Schneider
         * ----- Konten anzeigen -----
         * Es sind folgende Konten verfügbar:
         * - Kontonummer: 1023
         * - Kontonummer: 1054
         * - Kontonummer: 1045
         * - Kontonummer: 1445
         * - Kontonummer: 1050
         */
    }
}