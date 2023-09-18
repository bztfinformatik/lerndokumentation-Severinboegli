class Drucker{
    private static Drucker drucker;
    private int anzahlSeiten;
    private Drucker(){
        anzahlSeiten = 0;
    } // Leerer Konstruktor

    public static Drucker getInstance() {
        if (drucker == null) {
            drucker = new Drucker(); // Nur beim ersten Mal wird ein PrintService Objekt erstellt.
        }
        return drucker;
    }

    public void print(String data) {
        anzahlSeiten++;
        System.out.println(data);
        System.out.println("\n----------------");
        System.out.println("Anzahl gedruckte Seiten: " + anzahlSeiten);
        System.out.println("----------------\n");
    }
}