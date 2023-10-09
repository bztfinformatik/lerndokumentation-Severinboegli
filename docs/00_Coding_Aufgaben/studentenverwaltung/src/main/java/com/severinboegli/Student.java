package com.severinboegli;

public class Student {
    private String name;
    private String vorname;
    private int matrikelnummer;

    public Student(String name, String vorname, int matrikelnummer) {
        setName(name);
        setVorname(vorname);
        setMatrikelnummer(matrikelnummer);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }
}
