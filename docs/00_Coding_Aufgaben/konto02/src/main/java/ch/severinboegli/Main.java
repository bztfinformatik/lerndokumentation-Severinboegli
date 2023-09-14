package ch.severinboegli;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Konto kt01 = new Konto("Goldfinger","Debitor", 3000, 1.0000000006667E11);
        Konto konto01 = new Konto("Severin", "Sparkonto", 100, 50);
        Konto konto02 = new Konto();
        Konto konto03 = new Konto("Severin");
        Konto konto04 = new Konto(200, 100.05);

        System.out.println("Kontoinhaber: ");
        kt01.getKontoInhaberOut();
        System.out.println("Namekonto: ");
        kt01.getNameKontoOut();
        System.out.println("Kontonummer: ");
        kt01.getNummerKontoOut();
        System.out.println("Saldo: ");
        kt01.getSaldoKontoOut();
    }
}

