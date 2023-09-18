public class Mitarbeiter {
    private String name;
    private String position;
    private String taetigkeit;

    public Mitarbeiter(String name, String position, String taetigkeit) {
        this.name = name;
        this.position = position;
        this.taetigkeit = taetigkeit;
    }

    public void printMitarbeiter() {
        String data = "";
        data = "Name: " + name + "\nPosition: " + position + "\nTätigkeit: " + taetigkeit;
        Drucker.getInstance().print(data);
    }

}
