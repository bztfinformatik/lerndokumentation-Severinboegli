package com.severinboegli;

public class Kunde {
    private String name;
    private Buch[] buecherAusgeliehen = new Buch[10];

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void BuchLeihen(Buch buch) {
        if (buch.getStatus() == false) {
            for (int i = 0; i < buecherAusgeliehen.length; i++) {
                if (buecherAusgeliehen[i] == null) {
                    buecherAusgeliehen[i] = buch;
                    buch.ausleihen();
                    break;
                }
            }

            System.out.println("Das Maximum an Bücher für diesen Kunden ist erreicht.");
        } else {
            System.out.println("Das Buch ist bereits ausgeliehen.");
        }

    }

    public void ListeAusgeben() {
        System.out.println(name + " hat folgende Bücher ausgeliehen:");
        for (int i = 0; i < buecherAusgeliehen.length; i++) {
            if (buecherAusgeliehen[i] != null)
                System.out.println("- " + buecherAusgeliehen[i].getTitel());
        }
        System.out.println("---------------------");
    }

    public void BuchZurueckgeben(Buch buch) {
        for (int i = 0; i < buecherAusgeliehen.length; i++) {
            if (buecherAusgeliehen[i] == buch) {
                buecherAusgeliehen[i] = null;
                buch.zurueck();
                break;
            }

            System.out.println("Das Buch konnte nicht beim Kunde gefunden werden.");
        }
    }
}