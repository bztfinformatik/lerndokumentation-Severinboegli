package com.severinboegli;

public class Buch {
    private String titel;
    private boolean ausgeliehen = false;

    public void ausleihen() {
        ausgeliehen = true;
    }

    public void zurueck() {
        ausgeliehen = false;
    }

    public boolean getStatus() {
        return ausgeliehen;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }
}
