package ch.severinboegli;

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
    
    public static void ausgabeAnzahlInstanzen() {
        System.out.println("Anzahl Kontoinstanzen: " + anzahlInstanzen);
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

}
