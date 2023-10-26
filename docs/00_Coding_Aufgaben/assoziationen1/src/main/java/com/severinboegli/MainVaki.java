package com.severinboegli;

public class MainVaki
{
    public static void main(String[] args)
    {
        // Es werden konkrete Objekte (Instanzen) erzeugt
        Vater herrM = new Vater();
        Vater herrZ = new Vater();
        Vater herrJ = new Vater();
        Kind claudia = new Kind();
        Kind hans = new Kind();
        Kind peter = new Kind();
        

        // Setzen des Alters der Instanz herrM
        herrM.setAlterVater(28);

        // herrM bekommt Claudia zeigt auf Instanz Claudia
        herrM.setIhrKind(claudia);
        System.out.println("Herr M hat jetzt folgendes Kind:" + herrM.getIhrKind());
        herrM.setIhrKind(peter);
        // Nun wurde das Kind geändert, es kann nur ein Kind des Mutter hinterlegt werden.
        System.out.println("Herr M hat folgendes Kind: " + herrM.getIhrKind());
        System.out.println("---------");

        herrZ.setIhrKind(peter);
        // Man kann zwei Väter einem Kind zuweisen, da diese einfach in eine Richtung auf das Kind verlinken.
        System.out.println("Anzeigen von Kinder der Väter:");
        System.out.println("Kind von herr Z: " + herrZ.getIhrKind());
        System.out.println("Kind von herr M: " + herrM.getIhrKind());
        System.out.println("Beide Väter zeigen auf das selbe Kind, also können zwei Väter das selbe Kind haben.");

        System.out.println("-----------------");
        claudia.setSeinenVater(herrM);
        System.out.println("HerrM mit Tochter Claudia");
        System.out.println("Quasi Adresse des Kindes von HerrM: " + herrM.getIhrKind());

        System.out.println("Quasi Adresse des Vater von Claudia: " + claudia.getSeinenVater());

        System.out.println("Alter des Vaters von Claudia: " + herrM.getAlterVater());

    }
}