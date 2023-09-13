package ch.severinboegli;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Konto konto01 = new Konto("Severin", "Sparkonto", 100, 50);

        System.out.println("Momentaner Kontostand: " + konto01.getSaldoKonto());
        System.out.println("Wie viel Geld möchten sie schon einzahlen?");
        double saldo = scanner.nextDouble();
        konto01.setSaldoKonto(konto01.getSaldoKonto()+ saldo);

        System.out.println("Information zum Konto01");
        System.out.println("Kontoinhaber:" + konto01.getKontoInhaber());
        System.out.println("Kontoname: " + konto01.getNameKonto());
        System.out.println("Kontonummer: " + konto01.getNummerKonto());
        System.out.println("Saldo des Kontos: " + konto01.getSaldoKonto());
    }
}

