package ch.severinboegli;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Konto.makeGreeting();

        ArrayList<Konto> kontos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            kontos.add(Konto.createKonto());
        }

        System.out.println("Anzeigen Aller Konto");
        for (int i = 0; i < kontos.size(); i++) {
            System.out.println("Inhaber: " + kontos.get(i).getKontoInhaber());
            System.out.println("Kontoname: " + kontos.get(i).getNameKonto());
            System.out.println("Kontonummer: " + kontos.get(i).getNummerKonto());
            System.out.println("Saldo vom Konto:" + kontos.get(i).getSaldoKonto());
            System.out.println("------------");
        }

        Konto.makeGreeting(3);
        Konto.ausgabeAnzahlInstanzen();
    }
}

