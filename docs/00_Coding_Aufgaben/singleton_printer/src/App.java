public class App {
    public static void main(String[] args) throws Exception {
        Mitarbeiter hans = new Mitarbeiter("Hans", "Cheffe", "Pläuschlen");
        Mitarbeiter severin = new Mitarbeiter("Severin", "Lehrling", "PC-Aufsetzen");

        hans.printMitarbeiter();
        hans.printMitarbeiter();
        severin.printMitarbeiter();

    }
}
