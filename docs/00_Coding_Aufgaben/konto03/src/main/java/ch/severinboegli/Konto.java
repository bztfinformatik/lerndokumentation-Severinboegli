package ch.severinboegli;

import java.util.Scanner;

public class Konto {
    private static int anzahlInstanzen = 0;
    private String kontoInhaber;
    private String nameKonto;
    private int nummerKonto;
    private double saldoKonto;

    public Konto(String kontoInhaber, String nameKonto, int nummerKonto, double saldoKonto) {
        setKontoInhaber(kontoInhaber);
        setNameKonto(nameKonto);
        setNummerKonto(nummerKonto);
        setSaldoKonto(saldoKonto);
        anzahlInstanzen++;
    }

    public Konto() {
        setKontoInhaber("Severin");
        setNameKonto("Konto");
        setNummerKonto(100);
        setSaldoKonto(0);
        anzahlInstanzen++;
    }

    public Konto(String kontoInhaber) {
        setKontoInhaber(kontoInhaber);
        setNameKonto("Konto");
        setNummerKonto(100);
        setSaldoKonto(0);
        anzahlInstanzen++;
    }   

    public Konto(String nameKonto, int saldoKonto, String kontoInhaber) {
        setKontoInhaber(kontoInhaber);
        setNameKonto(nameKonto);
        setNummerKonto(100);
        setSaldoKonto(saldoKonto);
        anzahlInstanzen++;
    }

    public Konto(int nummerKonto) {
        setKontoInhaber("Severin");
        setNameKonto("Konto");
        setNummerKonto(nummerKonto);
        setSaldoKonto(0);
        anzahlInstanzen++;
    }

    public Konto(double saldoKonto) {
        setKontoInhaber("Severin");
        setNameKonto("Konto");
        setNummerKonto(100);
        setSaldoKonto(saldoKonto);
        anzahlInstanzen++;
    }

    public Konto(String kontoInhaber, String nameKonto) {
        setKontoInhaber(kontoInhaber);
        setNameKonto(nameKonto);
        setNummerKonto(100);
        setSaldoKonto(0);
        anzahlInstanzen++;
    }

    public Konto(String nameKonto, int nummerKonto) {
        setKontoInhaber("Severin");
        setNameKonto(nameKonto);
        setNummerKonto(nummerKonto);
        setSaldoKonto(0);
        anzahlInstanzen++;
    }

    public Konto(int nummerKonto, double saldoKonto) {
        setKontoInhaber("Severin");
        setNameKonto("Konto");
        setNummerKonto(nummerKonto);
        setSaldoKonto(saldoKonto);
        anzahlInstanzen++;
    }

    public Konto(String kontoInhaber, String nameKonto, int nummerKonto) {
        setKontoInhaber(kontoInhaber);
        setNameKonto(nameKonto);
        setNummerKonto(nummerKonto);
        setSaldoKonto(0);
        anzahlInstanzen++;
    }

    public Konto(String nameKonto, int nummerKonto, double saldoKonto) {
        setKontoInhaber("Severin");
        setNameKonto(nameKonto);
        setNummerKonto(nummerKonto);
        setSaldoKonto(saldoKonto);
        anzahlInstanzen++;
    }

    public void setKontoInhaber(String kontoInhaber){
        this.kontoInhaber = kontoInhaber;
    }

    public void setNameKonto(String nameKonto) {
        this.nameKonto = nameKonto;
    }

    public void setNummerKonto(int nummerKonto) {
        this.nummerKonto = nummerKonto;
    }

    public void setSaldoKonto(double saldoKonto) {
        this.saldoKonto = saldoKonto;
    }

    public String getKontoInhaber() {
        return kontoInhaber;
    }
    
    public String getNameKonto() {
        return nameKonto;
    }
    
    public int getNummerKonto() {
        return nummerKonto;
    }

    public double getSaldoKonto() {
        return saldoKonto;
    }

    private void ausgabe(String stringAusgabe) {
        System.out.println(stringAusgabe);
    }

    private void ausgabe(int stringAusgabe) {
        System.out.println(stringAusgabe);
    }

    private void ausgabe(double stringAusgabe) {
        System.out.println(stringAusgabe);
    }

    public String getKontoInhaberOut()
    {
        ausgabe(kontoInhaber);
        return kontoInhaber;
    }

    public String getNameKontoOut(){
        ausgabe(nameKonto);
        return nameKonto;
    }

    public int getNummerKontoOut() {
        ausgabe(nummerKonto);
        return nummerKonto;
    }

    public double getSaldoKontoOut() {
        ausgabe(saldoKonto);
        return saldoKonto;
    }

    public static Konto createKonto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Konto wird erstellt:");
        System.out.println("Wie lautet der Name des Kontoinhaber?");
        String kontoinhaber = scanner.nextLine();
        System.out.println("Wie lautet das Konto?");
        String nameKonto = scanner.nextLine();
        System.out.println("Welche Nummer hat das Konto?");
        int nummerKonto = scanner.nextInt();
        System.out.println("Wie hoch ist der momentane Saldo?");
        double saldoKonto = scanner.nextDouble();

        while (!isPossitiv(saldoKonto)) {
            System.out.println("Fehler, Zahl konnte nicht angenommen werden (ist negativ)");
            System.out.println("Wie hoch ist der momentane Saldo?");
            saldoKonto = scanner.nextDouble();
        }


        return new Konto(kontoinhaber, nameKonto, nummerKonto, saldoKonto);
    }

    public static void ausgabeAnzahlInstanzen() {
        System.out.println("Anzahl Kontoinstanzen: " + anzahlInstanzen);
    }

    private static boolean isPossitiv(double saldo){
        return saldo >= 0;
    }

    public static void makeGreeting(){
        System.out.println("Guten Tag!");
    }

    public static void makeGreeting(int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            System.out.println("Guten Tag!");
        }
    }
}
