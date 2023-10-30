package com.severinboegli;

public class Main {
    public static void main(String[] args) {
        // Test
        Kunde testKunde = new Kunde();
        Kunde k1 = new Kunde();
        k1.setName("Severin");
        Buch testBuch = new Buch();
        Buch tester = new Buch();
        tester.setTitel("Hallo");
        testKunde.setName("Christian");
        testBuch.setTitel("Java");
        testKunde.BuchLeihen(testBuch);
        testKunde.BuchLeihen(tester);
        testKunde.ListeAusgeben();
        testKunde.BuchLeihen(testBuch);
        testKunde.BuchZurueckgeben(testBuch);
        testKunde.ListeAusgeben();
        System.out.println("");
        k1.BuchLeihen(tester);

    }
}