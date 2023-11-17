package com.severinboegli;

public class Konto {
    private int kontoNummer;

    public Konto(int nummer){
        setKontoNummer(nummer);
    }

    public void setKontoNummer(int nummer) {
        if (nummer >= 1000 && nummer <= 9999) {
            this.kontoNummer = nummer;
        } else {
            System.out.println("Ungültige Kontonummer");
            this.kontoNummer = -1;
        }
    }

    public int getKontoNummer() {
        return kontoNummer;
    }
}
